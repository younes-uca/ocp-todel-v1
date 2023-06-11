import {Component, OnInit} from '@angular/core';
import {EtudiantService} from 'src/app/controller/service/Etudiant.service';
import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {EtudiantCriteria} from 'src/app/controller/criteria/EtudiantCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-etudiant-list-admin',
  templateUrl: './etudiant-list-admin.component.html'
})
export class EtudiantListAdminComponent extends AbstractListController<EtudiantDto, EtudiantCriteria, EtudiantService>  implements OnInit {

    fileName = 'Etudiant';

  
    constructor(etudiantService: EtudiantService) {
        super(etudiantService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadEtudiants(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Etudiant', 'list');
        isPermistted ? this.service.findAll().subscribe(etudiants => this.items = etudiants,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'nom', header: 'Nom'},
            {field: 'prenom', header: 'Prenom'},
            {field: 'email', header: 'Email'},
            {field: 'anneeDinscription', header: 'Annee dinscription'},
            {field: 'codeMassar', header: 'Code massar'},
            {field: 'password', header: 'Password'},
        ];
    }



	public initDuplicate(res: EtudiantDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Nom': e.nom ,
                 'Prenom': e.prenom ,
                 'Email': e.email ,
                 'Annee dinscription': e.anneeDinscription ,
                 'Code massar': e.codeMassar ,
                 'Password': e.password ,
            }
        });

        this.criteriaData = [{
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Prenom': this.criteria.prenom ? this.criteria.prenom : environment.emptyForExport ,
            'Email': this.criteria.email ? this.criteria.email : environment.emptyForExport ,
            'Annee dinscription': this.criteria.anneeDinscription ? this.criteria.anneeDinscription : environment.emptyForExport ,
            'Code massar': this.criteria.codeMassar ? this.criteria.codeMassar : environment.emptyForExport ,
            'Password': this.criteria.password ? this.criteria.password : environment.emptyForExport ,
        }];
      }
}
