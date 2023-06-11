import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {NoteDisciplineService} from 'src/app/controller/service/NoteDiscipline.service';
import {NoteDisciplineDto} from 'src/app/controller/model/NoteDiscipline.model';
import {NoteDisciplineCriteria} from 'src/app/controller/criteria/NoteDisciplineCriteria.model';

import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {EtudiantService} from 'src/app/controller/service/Etudiant.service';
import {ClasseRoomDto} from 'src/app/controller/model/ClasseRoom.model';
import {ClasseRoomService} from 'src/app/controller/service/ClasseRoom.service';
import {DisciplineDto} from 'src/app/controller/model/Discipline.model';
import {DisciplineService} from 'src/app/controller/service/Discipline.service';
import {ProfesseurDto} from 'src/app/controller/model/Professeur.model';
import {ProfesseurService} from 'src/app/controller/service/Professeur.service';
@Component({
  selector: 'app-note-discipline-view-admin',
  templateUrl: './note-discipline-view-admin.component.html'
})
export class NoteDisciplineViewAdminComponent extends AbstractViewController<NoteDisciplineDto, NoteDisciplineCriteria, NoteDisciplineService> implements OnInit {


    constructor(private noteDisciplineService: NoteDisciplineService, private etudiantService: EtudiantService, private classeRoomService: ClasseRoomService, private disciplineService: DisciplineService, private professeurService: ProfesseurService){
        super(noteDisciplineService);
    }

    ngOnInit(): void {
        this.professeur = new ProfesseurDto();
        this.professeurService.findAll().subscribe((data) => this.professeurs = data);
        this.classeRoom = new ClasseRoomDto();
        this.classeRoomService.findAll().subscribe((data) => this.classeRooms = data);
        this.discipline = new DisciplineDto();
        this.disciplineService.findAll().subscribe((data) => this.disciplines = data);
        this.etudiant = new EtudiantDto();
        this.etudiantService.findAll().subscribe((data) => this.etudiants = data);
    }


    get discipline(): DisciplineDto {
       return this.disciplineService.item;
    }
    set discipline(value: DisciplineDto) {
        this.disciplineService.item = value;
    }
    get disciplines():Array<DisciplineDto> {
       return this.disciplineService.items;
    }
    set disciplines(value: Array<DisciplineDto>) {
        this.disciplineService.items = value;
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


}
