import {Component, OnInit} from '@angular/core';
import {MatiereService} from 'src/app/controller/service/Matiere.service';
import {MatiereDto} from 'src/app/controller/model/Matiere.model';
import {MatiereCriteria} from 'src/app/controller/criteria/MatiereCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-matiere-list-admin',
  templateUrl: './matiere-list-admin.component.html'
})
export class MatiereListAdminComponent extends AbstractListController<MatiereDto, MatiereCriteria, MatiereService>  implements OnInit {

    fileName = 'Matiere';

  
    constructor(matiereService: MatiereService) {
        super(matiereService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadMatieres(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Matiere', 'list');
        isPermistted ? this.service.findAll().subscribe(matieres => this.items = matieres,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: MatiereDto) {
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
