import {Component, OnInit} from '@angular/core';
import {DisciplineService} from 'src/app/controller/service/Discipline.service';
import {DisciplineDto} from 'src/app/controller/model/Discipline.model';
import {DisciplineCriteria} from 'src/app/controller/criteria/DisciplineCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-discipline-list-admin',
  templateUrl: './discipline-list-admin.component.html'
})
export class DisciplineListAdminComponent extends AbstractListController<DisciplineDto, DisciplineCriteria, DisciplineService>  implements OnInit {

    fileName = 'Discipline';

  
    constructor(disciplineService: DisciplineService) {
        super(disciplineService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadDisciplines(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Discipline', 'list');
        isPermistted ? this.service.findAll().subscribe(disciplines => this.items = disciplines,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: DisciplineDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Libelle': e.libelle ,
                 'Code': e.code ,
            }
        });

        this.criteriaData = [{
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        }];
      }
}
