import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {ClasseRoomService} from 'src/app/controller/service/ClasseRoom.service';
import {ClasseRoomDto} from 'src/app/controller/model/ClasseRoom.model';
import {ClasseRoomCriteria} from 'src/app/controller/criteria/ClasseRoomCriteria.model';


import {NiveauDto} from 'src/app/controller/model/Niveau.model';
import {NiveauService} from 'src/app/controller/service/Niveau.service';

@Component({
  selector: 'app-classe-room-edit-admin',
  templateUrl: './classe-room-edit-admin.component.html'
})
export class ClasseRoomEditAdminComponent extends AbstractEditController<ClasseRoomDto, ClasseRoomCriteria, ClasseRoomService>   implements OnInit {


    private _validClasseRoomLibelle = true;
    private _validClasseRoomCode = true;
    private _validClasseRoomAnneeScolaire = true;
    private _validClasseRoomNiveau = true;

    private _validNiveauLibelle = true;
    private _validNiveauCode = true;



    constructor( private classeRoomService: ClasseRoomService , private niveauService: NiveauService) {
        super(classeRoomService);
    }

    ngOnInit(): void {
    this.niveau = new NiveauDto();
    this.niveauService.findAll().subscribe((data) => this.niveaus = data);
}


    public setValidation(value : boolean){
        this.validClasseRoomLibelle = value;
        this.validClasseRoomCode = value;
        this.validClasseRoomAnneeScolaire = value;
        this.validClasseRoomNiveau = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateClasseRoomLibelle();
        this.validateClasseRoomCode();
        this.validateClasseRoomAnneeScolaire();
        this.validateClasseRoomNiveau();
    }
    public validateClasseRoomLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validClasseRoomLibelle = false;
        } else {
            this.validClasseRoomLibelle = true;
        }
    }
    public validateClasseRoomCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validClasseRoomCode = false;
        } else {
            this.validClasseRoomCode = true;
        }
    }
    public validateClasseRoomAnneeScolaire(){
        if (this.stringUtilService.isEmpty(this.item.anneeScolaire)) {
            this.errorMessages.push('Annee scolaire non valide');
            this.validClasseRoomAnneeScolaire = false;
        } else {
            this.validClasseRoomAnneeScolaire = true;
        }
    }
    public validateClasseRoomNiveau(){
        if (this.stringUtilService.isEmpty(this.item.niveau)) {
            this.errorMessages.push('Niveau non valide');
            this.validClasseRoomNiveau = false;
        } else {
            this.validClasseRoomNiveau = true;
        }
    }



   public async openCreateNiveau(niveau: string) {
        const isPermistted = await this.roleService.isPermitted('Niveau', 'edit');
        if(isPermistted) {
             this.niveau = new NiveauDto();
             this.createNiveauDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get niveau(): NiveauDto {
       return this.niveauService.item;
   }
  set niveau(value: NiveauDto) {
        this.niveauService.item = value;
   }
   get niveaus(): Array<NiveauDto> {
        return this.niveauService.items;
   }
   set niveaus(value: Array<NiveauDto>) {
        this.niveauService.items = value;
   }
   get createNiveauDialog(): boolean {
       return this.niveauService.createDialog;
   }
  set createNiveauDialog(value: boolean) {
       this.niveauService.createDialog= value;
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

    get validNiveauLibelle(): boolean {
        return this._validNiveauLibelle;
    }
    set validNiveauLibelle(value: boolean) {
        this._validNiveauLibelle = value;
    }
    get validNiveauCode(): boolean {
        return this._validNiveauCode;
    }
    set validNiveauCode(value: boolean) {
        this._validNiveauCode = value;
    }
}
