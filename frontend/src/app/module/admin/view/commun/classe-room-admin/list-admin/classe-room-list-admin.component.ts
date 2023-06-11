import {Component, OnInit} from '@angular/core';
import {ClasseRoomService} from 'src/app/controller/service/ClasseRoom.service';
import {ClasseRoomDto} from 'src/app/controller/model/ClasseRoom.model';
import {ClasseRoomCriteria} from 'src/app/controller/criteria/ClasseRoomCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { NiveauService } from 'src/app/controller/service/Niveau.service';

import {NiveauDto} from 'src/app/controller/model/Niveau.model';


@Component({
  selector: 'app-classe-room-list-admin',
  templateUrl: './classe-room-list-admin.component.html'
})
export class ClasseRoomListAdminComponent extends AbstractListController<ClasseRoomDto, ClasseRoomCriteria, ClasseRoomService>  implements OnInit {

    fileName = 'ClasseRoom';

    niveaus :Array<NiveauDto>;
  
    constructor(classeRoomService: ClasseRoomService, private niveauService: NiveauService) {
        super(classeRoomService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadNiveau();
    }

    public async loadClasseRooms(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('ClasseRoom', 'list');
        isPermistted ? this.service.findAll().subscribe(classeRooms => this.items = classeRooms,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
            {field: 'anneeScolaire', header: 'Annee scolaire'},
            {field: 'niveau?.code', header: 'Niveau'},
        ];
    }


    public async loadNiveau(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('ClasseRoom', 'list');
        isPermistted ? this.niveauService.findAllOptimized().subscribe(niveaus => this.niveaus = niveaus,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: ClasseRoomDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Libelle': e.libelle ,
                 'Code': e.code ,
                 'Annee scolaire': e.anneeScolaire ,
                'Niveau': e.niveau?.code ,
            }
        });

        this.criteriaData = [{
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Annee scolaire': this.criteria.anneeScolaire ? this.criteria.anneeScolaire : environment.emptyForExport ,
        //'Niveau': this.criteria.niveau?.code ? this.criteria.niveau?.code : environment.emptyForExport ,
        }];
      }
}
