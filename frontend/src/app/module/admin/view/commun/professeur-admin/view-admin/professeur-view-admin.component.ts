import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ProfesseurService} from 'src/app/controller/service/Professeur.service';
import {ProfesseurDto} from 'src/app/controller/model/Professeur.model';
import {ProfesseurCriteria} from 'src/app/controller/criteria/ProfesseurCriteria.model';

import {DisciplineDto} from 'src/app/controller/model/Discipline.model';
import {DisciplineService} from 'src/app/controller/service/Discipline.service';
@Component({
  selector: 'app-professeur-view-admin',
  templateUrl: './professeur-view-admin.component.html'
})
export class ProfesseurViewAdminComponent extends AbstractViewController<ProfesseurDto, ProfesseurCriteria, ProfesseurService> implements OnInit {


    constructor(private professeurService: ProfesseurService, private disciplineService: DisciplineService){
        super(professeurService);
    }

    ngOnInit(): void {
        this.discipline = new DisciplineDto();
        this.disciplineService.findAll().subscribe((data) => this.disciplines = data);
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


}
