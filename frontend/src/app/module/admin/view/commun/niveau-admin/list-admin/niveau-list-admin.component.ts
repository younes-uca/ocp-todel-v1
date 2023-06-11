import {Component, OnInit} from '@angular/core';
import {NiveauService} from 'src/app/controller/service/Niveau.service';
import {NiveauDto} from 'src/app/controller/model/Niveau.model';
import {NiveauCriteria} from 'src/app/controller/criteria/NiveauCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-niveau-list-admin',
  templateUrl: './niveau-list-admin.component.html'
})
export class NiveauListAdminComponent extends AbstractListController<NiveauDto, NiveauCriteria, NiveauService>  implements OnInit {

    fileName = 'Niveau';

  
    constructor(niveauService: NiveauService) {
        super(niveauService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadNiveaus(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Niveau', 'list');
        isPermistted ? this.service.findAll().subscribe(niveaus => this.items = niveaus,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }



	public initDuplicate(res: NiveauDto) {
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
