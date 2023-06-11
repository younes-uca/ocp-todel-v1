import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {NiveauService} from 'src/app/controller/service/Niveau.service';
import {NiveauDto} from 'src/app/controller/model/Niveau.model';
import {NiveauCriteria} from 'src/app/controller/criteria/NiveauCriteria.model';



@Component({
  selector: 'app-niveau-edit-admin',
  templateUrl: './niveau-edit-admin.component.html'
})
export class NiveauEditAdminComponent extends AbstractEditController<NiveauDto, NiveauCriteria, NiveauService>   implements OnInit {


    private _validNiveauLibelle = true;
    private _validNiveauCode = true;




    constructor( private niveauService: NiveauService ) {
        super(niveauService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validNiveauLibelle = value;
        this.validNiveauCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateNiveauLibelle();
        this.validateNiveauCode();
    }
    public validateNiveauLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validNiveauLibelle = false;
        } else {
            this.validNiveauLibelle = true;
        }
    }
    public validateNiveauCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validNiveauCode = false;
        } else {
            this.validNiveauCode = true;
        }
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
