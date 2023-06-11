import {Component, OnInit} from '@angular/core';
import {ProfesseurService} from 'src/app/controller/service/Professeur.service';
import {ProfesseurDto} from 'src/app/controller/model/Professeur.model';
import {ProfesseurCriteria} from 'src/app/controller/criteria/ProfesseurCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { DisciplineService } from 'src/app/controller/service/Discipline.service';

import {DisciplineDto} from 'src/app/controller/model/Discipline.model';


@Component({
  selector: 'app-professeur-list-admin',
  templateUrl: './professeur-list-admin.component.html'
})
export class ProfesseurListAdminComponent extends AbstractListController<ProfesseurDto, ProfesseurCriteria, ProfesseurService>  implements OnInit {

    fileName = 'Professeur';

    disciplines :Array<DisciplineDto>;
  
    constructor(professeurService: ProfesseurService, private disciplineService: DisciplineService) {
        super(professeurService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadDiscipline();
    }

    public async loadProfesseurs(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Professeur', 'list');
        isPermistted ? this.service.findAll().subscribe(professeurs => this.items = professeurs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'nom', header: 'Nom'},
            {field: 'prenom', header: 'Prenom'},
            {field: 'email', header: 'Email'},
            {field: 'code', header: 'Code'},
            {field: 'password', header: 'Password'},
            {field: 'discipline?.code', header: 'Discipline'},
        ];
    }


    public async loadDiscipline(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Professeur', 'list');
        isPermistted ? this.disciplineService.findAllOptimized().subscribe(disciplines => this.disciplines = disciplines,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: ProfesseurDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Nom': e.nom ,
                 'Prenom': e.prenom ,
                 'Email': e.email ,
                 'Code': e.code ,
                 'Password': e.password ,
                'Discipline': e.discipline?.code ,
            }
        });

        this.criteriaData = [{
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Prenom': this.criteria.prenom ? this.criteria.prenom : environment.emptyForExport ,
            'Email': this.criteria.email ? this.criteria.email : environment.emptyForExport ,
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Password': this.criteria.password ? this.criteria.password : environment.emptyForExport ,
        //'Discipline': this.criteria.discipline?.code ? this.criteria.discipline?.code : environment.emptyForExport ,
        }];
      }
}
