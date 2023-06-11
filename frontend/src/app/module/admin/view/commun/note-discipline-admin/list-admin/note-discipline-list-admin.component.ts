import {Component, OnInit} from '@angular/core';
import {NoteDisciplineService} from 'src/app/controller/service/NoteDiscipline.service';
import {NoteDisciplineDto} from 'src/app/controller/model/NoteDiscipline.model';
import {NoteDisciplineCriteria} from 'src/app/controller/criteria/NoteDisciplineCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { ProfesseurService } from 'src/app/controller/service/Professeur.service';
import { ClasseRoomService } from 'src/app/controller/service/ClasseRoom.service';
import { DisciplineService } from 'src/app/controller/service/Discipline.service';
import { EtudiantService } from 'src/app/controller/service/Etudiant.service';

import {DisciplineDto} from 'src/app/controller/model/Discipline.model';
import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {ProfesseurDto} from 'src/app/controller/model/Professeur.model';
import {ClasseRoomDto} from 'src/app/controller/model/ClasseRoom.model';


@Component({
  selector: 'app-note-discipline-list-admin',
  templateUrl: './note-discipline-list-admin.component.html'
})
export class NoteDisciplineListAdminComponent extends AbstractListController<NoteDisciplineDto, NoteDisciplineCriteria, NoteDisciplineService>  implements OnInit {

    fileName = 'NoteDiscipline';

    professeurs :Array<ProfesseurDto>;
    classeRooms :Array<ClasseRoomDto>;
    disciplines :Array<DisciplineDto>;
    etudiants :Array<EtudiantDto>;
  
    constructor(noteDisciplineService: NoteDisciplineService, private professeurService: ProfesseurService, private classeRoomService: ClasseRoomService, private disciplineService: DisciplineService, private etudiantService: EtudiantService) {
        super(noteDisciplineService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadProfesseur();
      this.loadClasseRoom();
      this.loadDiscipline();
      this.loadEtudiant();
    }

    public async loadNoteDisciplines(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteDiscipline', 'list');
        isPermistted ? this.service.findAll().subscribe(noteDisciplines => this.items = noteDisciplines,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'note', header: 'Note'},
            {field: 'professeur?.code', header: 'Professeur'},
            {field: 'classeRoom?.code', header: 'Classe room'},
            {field: 'discipline?.code', header: 'Discipline'},
            {field: 'etudiant?.codeMassar', header: 'Etudiant'},
        ];
    }


    public async loadProfesseur(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteDiscipline', 'list');
        isPermistted ? this.professeurService.findAllOptimized().subscribe(professeurs => this.professeurs = professeurs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadClasseRoom(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteDiscipline', 'list');
        isPermistted ? this.classeRoomService.findAllOptimized().subscribe(classeRooms => this.classeRooms = classeRooms,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDiscipline(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteDiscipline', 'list');
        isPermistted ? this.disciplineService.findAllOptimized().subscribe(disciplines => this.disciplines = disciplines,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEtudiant(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteDiscipline', 'list');
        isPermistted ? this.etudiantService.findAllOptimized().subscribe(etudiants => this.etudiants = etudiants,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: NoteDisciplineDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Note': e.note ,
                'Professeur': e.professeur?.code ,
                'Classe room': e.classeRoom?.code ,
                'Discipline': e.discipline?.code ,
                'Etudiant': e.etudiant?.codeMassar ,
            }
        });

        this.criteriaData = [{
            'Note Min': this.criteria.noteMin ? this.criteria.noteMin : environment.emptyForExport ,
            'Note Max': this.criteria.noteMax ? this.criteria.noteMax : environment.emptyForExport ,
        //'Professeur': this.criteria.professeur?.code ? this.criteria.professeur?.code : environment.emptyForExport ,
        //'Classe room': this.criteria.classeRoom?.code ? this.criteria.classeRoom?.code : environment.emptyForExport ,
        //'Discipline': this.criteria.discipline?.code ? this.criteria.discipline?.code : environment.emptyForExport ,
        //'Etudiant': this.criteria.etudiant?.codeMassar ? this.criteria.etudiant?.codeMassar : environment.emptyForExport ,
        }];
      }
}
