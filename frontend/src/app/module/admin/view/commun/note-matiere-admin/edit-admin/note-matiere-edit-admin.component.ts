import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

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
  selector: 'app-note-matiere-edit-admin',
  templateUrl: './note-matiere-edit-admin.component.html'
})
export class NoteMatiereEditAdminComponent extends AbstractEditController<NoteMatiereDto, NoteMatiereCriteria, NoteMatiereService>   implements OnInit {



    private _validProfesseurNom = true;
    private _validProfesseurPrenom = true;
    private _validProfesseurEmail = true;
    private _validProfesseurCode = true;
    private _validProfesseurPassword = true;
    private _validClasseRoomLibelle = true;
    private _validClasseRoomCode = true;
    private _validClasseRoomAnneeScolaire = true;
    private _validClasseRoomNiveau = true;
    private _validMatiereLibelle = true;
    private _validMatiereCode = true;
    private _validEtudiantNom = true;
    private _validEtudiantPrenom = true;
    private _validEtudiantEmail = true;
    private _validEtudiantAnneeDinscription = true;
    private _validEtudiantCodeMassar = true;
    private _validEtudiantPassword = true;



    constructor( private noteMatiereService: NoteMatiereService , private etudiantService: EtudiantService, private matiereService: MatiereService, private classeRoomService: ClasseRoomService, private professeurService: ProfesseurService) {
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


    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



   public async openCreateEtudiant(etudiant: string) {
        const isPermistted = await this.roleService.isPermitted('Etudiant', 'edit');
        if(isPermistted) {
             this.etudiant = new EtudiantDto();
             this.createEtudiantDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateClasseRoom(classeRoom: string) {
        const isPermistted = await this.roleService.isPermitted('ClasseRoom', 'edit');
        if(isPermistted) {
             this.classeRoom = new ClasseRoomDto();
             this.createClasseRoomDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateProfesseur(professeur: string) {
        const isPermistted = await this.roleService.isPermitted('Professeur', 'edit');
        if(isPermistted) {
             this.professeur = new ProfesseurDto();
             this.createProfesseurDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateMatiere(matiere: string) {
        const isPermistted = await this.roleService.isPermitted('Matiere', 'edit');
        if(isPermistted) {
             this.matiere = new MatiereDto();
             this.createMatiereDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get etudiant(): EtudiantDto {
       return this.etudiantService.item;
   }
  set etudiant(value: EtudiantDto) {
        this.etudiantService.item = value;
   }
   get etudiants(): Array<EtudiantDto> {
        return this.etudiantService.items;
   }
   set etudiants(value: Array<EtudiantDto>) {
        this.etudiantService.items = value;
   }
   get createEtudiantDialog(): boolean {
       return this.etudiantService.createDialog;
   }
  set createEtudiantDialog(value: boolean) {
       this.etudiantService.createDialog= value;
   }
   get classeRoom(): ClasseRoomDto {
       return this.classeRoomService.item;
   }
  set classeRoom(value: ClasseRoomDto) {
        this.classeRoomService.item = value;
   }
   get classeRooms(): Array<ClasseRoomDto> {
        return this.classeRoomService.items;
   }
   set classeRooms(value: Array<ClasseRoomDto>) {
        this.classeRoomService.items = value;
   }
   get createClasseRoomDialog(): boolean {
       return this.classeRoomService.createDialog;
   }
  set createClasseRoomDialog(value: boolean) {
       this.classeRoomService.createDialog= value;
   }
   get professeur(): ProfesseurDto {
       return this.professeurService.item;
   }
  set professeur(value: ProfesseurDto) {
        this.professeurService.item = value;
   }
   get professeurs(): Array<ProfesseurDto> {
        return this.professeurService.items;
   }
   set professeurs(value: Array<ProfesseurDto>) {
        this.professeurService.items = value;
   }
   get createProfesseurDialog(): boolean {
       return this.professeurService.createDialog;
   }
  set createProfesseurDialog(value: boolean) {
       this.professeurService.createDialog= value;
   }
   get matiere(): MatiereDto {
       return this.matiereService.item;
   }
  set matiere(value: MatiereDto) {
        this.matiereService.item = value;
   }
   get matieres(): Array<MatiereDto> {
        return this.matiereService.items;
   }
   set matieres(value: Array<MatiereDto>) {
        this.matiereService.items = value;
   }
   get createMatiereDialog(): boolean {
       return this.matiereService.createDialog;
   }
  set createMatiereDialog(value: boolean) {
       this.matiereService.createDialog= value;
   }



    get validProfesseurNom(): boolean {
        return this._validProfesseurNom;
    }
    set validProfesseurNom(value: boolean) {
        this._validProfesseurNom = value;
    }
    get validProfesseurPrenom(): boolean {
        return this._validProfesseurPrenom;
    }
    set validProfesseurPrenom(value: boolean) {
        this._validProfesseurPrenom = value;
    }
    get validProfesseurEmail(): boolean {
        return this._validProfesseurEmail;
    }
    set validProfesseurEmail(value: boolean) {
        this._validProfesseurEmail = value;
    }
    get validProfesseurCode(): boolean {
        return this._validProfesseurCode;
    }
    set validProfesseurCode(value: boolean) {
        this._validProfesseurCode = value;
    }
    get validProfesseurPassword(): boolean {
        return this._validProfesseurPassword;
    }
    set validProfesseurPassword(value: boolean) {
        this._validProfesseurPassword = value;
    }
    get validClasseRoomLibelle(): boolean {
        return this._validClasseRoomLibelle;
    }
    set validClasseRoomLibelle(value: boolean) {
        this._validClasseRoomLibelle = value;
    }
    get validClasseRoomCode(): boolean {
        return this._validClasseRoomCode;
    }
    set validClasseRoomCode(value: boolean) {
        this._validClasseRoomCode = value;
    }
    get validClasseRoomAnneeScolaire(): boolean {
        return this._validClasseRoomAnneeScolaire;
    }
    set validClasseRoomAnneeScolaire(value: boolean) {
        this._validClasseRoomAnneeScolaire = value;
    }
    get validClasseRoomNiveau(): boolean {
        return this._validClasseRoomNiveau;
    }
    set validClasseRoomNiveau(value: boolean) {
        this._validClasseRoomNiveau = value;
    }
    get validMatiereLibelle(): boolean {
        return this._validMatiereLibelle;
    }
    set validMatiereLibelle(value: boolean) {
        this._validMatiereLibelle = value;
    }
    get validMatiereCode(): boolean {
        return this._validMatiereCode;
    }
    set validMatiereCode(value: boolean) {
        this._validMatiereCode = value;
    }
    get validEtudiantNom(): boolean {
        return this._validEtudiantNom;
    }
    set validEtudiantNom(value: boolean) {
        this._validEtudiantNom = value;
    }
    get validEtudiantPrenom(): boolean {
        return this._validEtudiantPrenom;
    }
    set validEtudiantPrenom(value: boolean) {
        this._validEtudiantPrenom = value;
    }
    get validEtudiantEmail(): boolean {
        return this._validEtudiantEmail;
    }
    set validEtudiantEmail(value: boolean) {
        this._validEtudiantEmail = value;
    }
    get validEtudiantAnneeDinscription(): boolean {
        return this._validEtudiantAnneeDinscription;
    }
    set validEtudiantAnneeDinscription(value: boolean) {
        this._validEtudiantAnneeDinscription = value;
    }
    get validEtudiantCodeMassar(): boolean {
        return this._validEtudiantCodeMassar;
    }
    set validEtudiantCodeMassar(value: boolean) {
        this._validEtudiantCodeMassar = value;
    }
    get validEtudiantPassword(): boolean {
        return this._validEtudiantPassword;
    }
    set validEtudiantPassword(value: boolean) {
        this._validEtudiantPassword = value;
    }
}
