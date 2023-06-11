import {Component, OnInit} from '@angular/core';
import {NoteMatiereService} from 'src/app/controller/service/NoteMatiere.service';
import {NoteMatiereDto} from 'src/app/controller/model/NoteMatiere.model';
import {NoteMatiereCriteria} from 'src/app/controller/criteria/NoteMatiereCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { ProfesseurService } from 'src/app/controller/service/Professeur.service';
import { ClasseRoomService } from 'src/app/controller/service/ClasseRoom.service';
import { MatiereService } from 'src/app/controller/service/Matiere.service';
import { EtudiantService } from 'src/app/controller/service/Etudiant.service';

import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {MatiereDto} from 'src/app/controller/model/Matiere.model';
import {ProfesseurDto} from 'src/app/controller/model/Professeur.model';
import {ClasseRoomDto} from 'src/app/controller/model/ClasseRoom.model';


@Component({
  selector: 'app-note-matiere-list-admin',
  templateUrl: './note-matiere-list-admin.component.html'
})
export class NoteMatiereListAdminComponent extends AbstractListController<NoteMatiereDto, NoteMatiereCriteria, NoteMatiereService>  implements OnInit {

    fileName = 'NoteMatiere';

    professeurs :Array<ProfesseurDto>;
    classeRooms :Array<ClasseRoomDto>;
    matieres :Array<MatiereDto>;
    etudiants :Array<EtudiantDto>;
  
    constructor(noteMatiereService: NoteMatiereService, private professeurService: ProfesseurService, private classeRoomService: ClasseRoomService, private matiereService: MatiereService, private etudiantService: EtudiantService) {
        super(noteMatiereService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadProfesseur();
      this.loadClasseRoom();
      this.loadMatiere();
      this.loadEtudiant();
    }

    public async loadNoteMatieres(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteMatiere', 'list');
        isPermistted ? this.service.findAll().subscribe(noteMatieres => this.items = noteMatieres,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'note', header: 'Note'},
            {field: 'professeur?.code', header: 'Professeur'},
            {field: 'classeRoom?.code', header: 'Classe room'},
            {field: 'matiere?.code', header: 'Matiere'},
            {field: 'etudiant?.codeMassar', header: 'Etudiant'},
        ];
    }


    public async loadProfesseur(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteMatiere', 'list');
        isPermistted ? this.professeurService.findAllOptimized().subscribe(professeurs => this.professeurs = professeurs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadClasseRoom(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteMatiere', 'list');
        isPermistted ? this.classeRoomService.findAllOptimized().subscribe(classeRooms => this.classeRooms = classeRooms,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadMatiere(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteMatiere', 'list');
        isPermistted ? this.matiereService.findAllOptimized().subscribe(matieres => this.matieres = matieres,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEtudiant(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('NoteMatiere', 'list');
        isPermistted ? this.etudiantService.findAllOptimized().subscribe(etudiants => this.etudiants = etudiants,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: NoteMatiereDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Note': e.note ,
                'Professeur': e.professeur?.code ,
                'Classe room': e.classeRoom?.code ,
                'Matiere': e.matiere?.code ,
                'Etudiant': e.etudiant?.codeMassar ,
            }
        });

        this.criteriaData = [{
            'Note Min': this.criteria.noteMin ? this.criteria.noteMin : environment.emptyForExport ,
            'Note Max': this.criteria.noteMax ? this.criteria.noteMax : environment.emptyForExport ,
        //'Professeur': this.criteria.professeur?.code ? this.criteria.professeur?.code : environment.emptyForExport ,
        //'Classe room': this.criteria.classeRoom?.code ? this.criteria.classeRoom?.code : environment.emptyForExport ,
        //'Matiere': this.criteria.matiere?.code ? this.criteria.matiere?.code : environment.emptyForExport ,
        //'Etudiant': this.criteria.etudiant?.codeMassar ? this.criteria.etudiant?.codeMassar : environment.emptyForExport ,
        }];
      }
}
