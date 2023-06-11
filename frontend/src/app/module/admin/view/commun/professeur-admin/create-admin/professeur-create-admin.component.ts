import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {ProfesseurService} from 'src/app/controller/service/Professeur.service';
import {ProfesseurDto} from 'src/app/controller/model/Professeur.model';
import {ProfesseurCriteria} from 'src/app/controller/criteria/ProfesseurCriteria.model';
import {DisciplineDto} from 'src/app/controller/model/Discipline.model';
import {DisciplineService} from 'src/app/controller/service/Discipline.service';
@Component({
  selector: 'app-professeur-create-admin',
  templateUrl: './professeur-create-admin.component.html'
})
export class ProfesseurCreateAdminComponent extends AbstractCreateController<ProfesseurDto, ProfesseurCriteria, ProfesseurService>  implements OnInit {



   private _validProfesseurNom = true;
   private _validProfesseurPrenom = true;
   private _validProfesseurEmail = true;
   private _validProfesseurCode = true;
   private _validProfesseurPassword = true;
    private _validDisciplineLibelle = true;
    private _validDisciplineCode = true;

    constructor( private professeurService: ProfesseurService , private disciplineService: DisciplineService) {
        super(professeurService);
    }

    ngOnInit(): void {
    this.discipline = new DisciplineDto();
    this.disciplineService.findAll().subscribe((data) => this.disciplines = data);
}





    public setValidation(value: boolean){
        this.validProfesseurNom = value;
        this.validProfesseurPrenom = value;
        this.validProfesseurEmail = value;
        this.validProfesseurCode = value;
        this.validProfesseurPassword = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateProfesseurNom();
        this.validateProfesseurPrenom();
        this.validateProfesseurEmail();
        this.validateProfesseurCode();
        this.validateProfesseurPassword();
    }

    public validateProfesseurNom(){
        if (this.stringUtilService.isEmpty(this.item.nom)) {
        this.errorMessages.push('Nom non valide');
        this.validProfesseurNom = false;
        } else {
            this.validProfesseurNom = true;
        }
    }
    public validateProfesseurPrenom(){
        if (this.stringUtilService.isEmpty(this.item.prenom)) {
        this.errorMessages.push('Prenom non valide');
        this.validProfesseurPrenom = false;
        } else {
            this.validProfesseurPrenom = true;
        }
    }
    public validateProfesseurEmail(){
        if (this.stringUtilService.isEmpty(this.item.email)) {
        this.errorMessages.push('Email non valide');
        this.validProfesseurEmail = false;
        } else {
            this.validProfesseurEmail = true;
        }
    }
    public validateProfesseurCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validProfesseurCode = false;
        } else {
            this.validProfesseurCode = true;
        }
    }
    public validateProfesseurPassword(){
        if (this.stringUtilService.isEmpty(this.item.password)) {
        this.errorMessages.push('Password non valide');
        this.validProfesseurPassword = false;
        } else {
            this.validProfesseurPassword = true;
        }
    }


    public async openCreateDiscipline(discipline: string) {
    const isPermistted = await this.roleService.isPermitted('Discipline', 'add');
    if(isPermistted) {
         this.discipline = new DisciplineDto();
         this.createDisciplineDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get discipline(): DisciplineDto {
        return this.disciplineService.item;
    }
    set discipline(value: DisciplineDto) {
        this.disciplineService.item = value;
    }
    get disciplines(): Array<DisciplineDto> {
        return this.disciplineService.items;
    }
    set disciplines(value: Array<DisciplineDto>) {
        this.disciplineService.items = value;
    }
    get createDisciplineDialog(): boolean {
       return this.disciplineService.createDialog;
    }
    set createDisciplineDialog(value: boolean) {
        this.disciplineService.createDialog= value;
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
