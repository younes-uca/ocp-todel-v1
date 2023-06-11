import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {DisciplineService} from 'src/app/controller/service/Discipline.service';
import {DisciplineDto} from 'src/app/controller/model/Discipline.model';
import {DisciplineCriteria} from 'src/app/controller/criteria/DisciplineCriteria.model';
@Component({
  selector: 'app-discipline-create-admin',
  templateUrl: './discipline-create-admin.component.html'
})
export class DisciplineCreateAdminComponent extends AbstractCreateController<DisciplineDto, DisciplineCriteria, DisciplineService>  implements OnInit {



   private _validDisciplineLibelle = true;
   private _validDisciplineCode = true;

    constructor( private disciplineService: DisciplineService ) {
        super(disciplineService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validDisciplineLibelle = value;
        this.validDisciplineCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateDisciplineLibelle();
        this.validateDisciplineCode();
    }

    public validateDisciplineLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validDisciplineLibelle = false;
        } else {
            this.validDisciplineLibelle = true;
        }
    }
    public validateDisciplineCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validDisciplineCode = false;
        } else {
            this.validDisciplineCode = true;
        }
    }






    get validDisciplineLibelle(): boolean {
        return this._validDisciplineLibelle;
    }

    set validDisciplineLibelle(value: boolean) {
         this._validDisciplineLibelle = value;
    }
    get validDisciplineCode(): boolean {
        return this._validDisciplineCode;
    }

    set validDisciplineCode(value: boolean) {
         this._validDisciplineCode = value;
    }



}
