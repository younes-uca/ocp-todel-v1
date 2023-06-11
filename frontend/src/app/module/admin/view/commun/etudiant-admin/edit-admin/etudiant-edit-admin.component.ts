import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {EtudiantService} from 'src/app/controller/service/Etudiant.service';
import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {EtudiantCriteria} from 'src/app/controller/criteria/EtudiantCriteria.model';



@Component({
  selector: 'app-etudiant-edit-admin',
  templateUrl: './etudiant-edit-admin.component.html'
})
export class EtudiantEditAdminComponent extends AbstractEditController<EtudiantDto, EtudiantCriteria, EtudiantService>   implements OnInit {


    private _validEtudiantNom = true;
    private _validEtudiantPrenom = true;
    private _validEtudiantEmail = true;
    private _validEtudiantAnneeDinscription = true;
    private _validEtudiantCodeMassar = true;
    private _validEtudiantPassword = true;




    constructor( private etudiantService: EtudiantService ) {
        super(etudiantService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validEtudiantNom = value;
        this.validEtudiantPrenom = value;
        this.validEtudiantEmail = value;
        this.validEtudiantAnneeDinscription = value;
        this.validEtudiantCodeMassar = value;
        this.validEtudiantPassword = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEtudiantNom();
        this.validateEtudiantPrenom();
        this.validateEtudiantEmail();
        this.validateEtudiantAnneeDinscription();
        this.validateEtudiantCodeMassar();
        this.validateEtudiantPassword();
    }
    public validateEtudiantNom(){
        if (this.stringUtilService.isEmpty(this.item.nom)) {
            this.errorMessages.push('Nom non valide');
            this.validEtudiantNom = false;
        } else {
            this.validEtudiantNom = true;
        }
    }
    public validateEtudiantPrenom(){
        if (this.stringUtilService.isEmpty(this.item.prenom)) {
            this.errorMessages.push('Prenom non valide');
            this.validEtudiantPrenom = false;
        } else {
            this.validEtudiantPrenom = true;
        }
    }
    public validateEtudiantEmail(){
        if (this.stringUtilService.isEmpty(this.item.email)) {
            this.errorMessages.push('Email non valide');
            this.validEtudiantEmail = false;
        } else {
            this.validEtudiantEmail = true;
        }
    }
    public validateEtudiantAnneeDinscription(){
        if (this.stringUtilService.isEmpty(this.item.anneeDinscription)) {
            this.errorMessages.push('Annee dinscription non valide');
            this.validEtudiantAnneeDinscription = false;
        } else {
            this.validEtudiantAnneeDinscription = true;
        }
    }
    public validateEtudiantCodeMassar(){
        if (this.stringUtilService.isEmpty(this.item.codeMassar)) {
            this.errorMessages.push('Code massar non valide');
            this.validEtudiantCodeMassar = false;
        } else {
            this.validEtudiantCodeMassar = true;
        }
    }
    public validateEtudiantPassword(){
        if (this.stringUtilService.isEmpty(this.item.password)) {
            this.errorMessages.push('Password non valide');
            this.validEtudiantPassword = false;
        } else {
            this.validEtudiantPassword = true;
        }
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
