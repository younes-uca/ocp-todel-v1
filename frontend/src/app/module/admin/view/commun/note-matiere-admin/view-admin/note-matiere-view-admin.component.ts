import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {NoteMatiereService} from 'src/app/controller/service/NoteMatiere.service';
import {NoteMatiereDto} from 'src/app/controller/model/NoteMatiere.model';
import {NoteMatiereCriteria} from 'src/app/controller/criteria/NoteMatiereCriteria.model';

import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {EtudiantService} from 'src/app/controller/service/Etudiant.service';
import {MatiereDto} from 'src/app/controller/model/Matiere.model';
import {MatiereService} from 'src/app/controller/service/Matiere.service';
import {ClasseRoomDto} from 'src/app/controller/model/ClasseRoom.model';
import {ClasseRoomService} from 'src/app/controller/service/ClasseRoom.service';
import {ProfesseurDto} from 'src/app/controller/model/Professeur.model';
import {ProfesseurService} from 'src/app/controller/service/Professeur.service';
@Component({
  selector: 'app-note-matiere-view-admin',
  templateUrl: './note-matiere-view-admin.component.html'
})
export class NoteMatiereViewAdminComponent extends AbstractViewController<NoteMatiereDto, NoteMatiereCriteria, NoteMatiereService> implements OnInit {


    constructor(private noteMatiereService: NoteMatiereService, private etudiantService: EtudiantService, private matiereService: MatiereService, private classeRoomService: ClasseRoomService, private professeurService: ProfesseurService){
        super(noteMatiereService);
    }

    ngOnInit(): void {
        this.professeur = new ProfesseurDto();
        this.professeurService.findAll().subscribe((data) => this.professeurs = data);
        this.classeRoom = new ClasseRoomDto();
        this.classeRoomService.findAll().subscribe((data) => this.classeRooms = data);
        this.matiere = new MatiereDto();
        this.matiereService.findAll().subscribe((data) => this.matieres = data);
        this.etudiant = new EtudiantDto();
        this.etudiantService.findAll().subscribe((data) => this.etudiants = data);
    }


    get etudiant(): EtudiantDto {
       return this.etudiantService.item;
    }
    set etudiant(value: EtudiantDto) {
        this.etudiantService.item = value;
    }
    get etudiants():Array<EtudiantDto> {
       return this.etudiantService.items;
    }
    set etudiants(value: Array<EtudiantDto>) {
        this.etudiantService.items = value;
    }
    get classeRoom(): ClasseRoomDto {
       return this.classeRoomService.item;
    }
    set classeRoom(value: ClasseRoomDto) {
        this.classeRoomService.item = value;
    }
    get classeRooms():Array<ClasseRoomDto> {
       return this.classeRoomService.items;
    }
    set classeRooms(value: Array<ClasseRoomDto>) {
        this.classeRoomService.items = value;
    }
    get professeur(): ProfesseurDto {
       return this.professeurService.item;
    }
    set professeur(value: ProfesseurDto) {
        this.professeurService.item = value;
    }
    get professeurs():Array<ProfesseurDto> {
       return this.professeurService.items;
    }
    set professeurs(value: Array<ProfesseurDto>) {
        this.professeurService.items = value;
    }
    get matiere(): MatiereDto {
       return this.matiereService.item;
    }
    set matiere(value: MatiereDto) {
        this.matiereService.item = value;
    }
    get matieres():Array<MatiereDto> {
       return this.matiereService.items;
    }
    set matieres(value: Array<MatiereDto>) {
        this.matiereService.items = value;
    }


}
