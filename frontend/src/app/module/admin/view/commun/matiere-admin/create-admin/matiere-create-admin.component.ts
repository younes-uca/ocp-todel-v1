import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {MatiereService} from 'src/app/controller/service/Matiere.service';
import {MatiereDto} from 'src/app/controller/model/Matiere.model';
import {MatiereCriteria} from 'src/app/controller/criteria/MatiereCriteria.model';
@Component({
  selector: 'app-matiere-create-admin',
  templateUrl: './matiere-create-admin.component.html'
})
export class MatiereCreateAdminComponent extends AbstractCreateController<MatiereDto, MatiereCriteria, MatiereService>  implements OnInit {



   private _validMatiereLibelle = true;
   private _validMatiereCode = true;

    constructor( private matiereService: MatiereService ) {
        super(matiereService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validMatiereLibelle = value;
        this.validMatiereCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateMatiereLibelle();
        this.validateMatiereCode();
    }

    public validateMatiereLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validMatiereLibelle = false;
        } else {
            this.validMatiereLibelle = true;
        }
    }
    public validateMatiereCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validMatiereCode = false;
        } else {
            this.validMatiereCode = true;
        }
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



}
