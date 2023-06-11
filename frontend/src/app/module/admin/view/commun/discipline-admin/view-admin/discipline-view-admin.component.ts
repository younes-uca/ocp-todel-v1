import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {DisciplineService} from 'src/app/controller/service/Discipline.service';
import {DisciplineDto} from 'src/app/controller/model/Discipline.model';
import {DisciplineCriteria} from 'src/app/controller/criteria/DisciplineCriteria.model';

@Component({
  selector: 'app-discipline-view-admin',
  templateUrl: './discipline-view-admin.component.html'
})
export class DisciplineViewAdminComponent extends AbstractViewController<DisciplineDto, DisciplineCriteria, DisciplineService> implements OnInit {


    constructor(private disciplineService: DisciplineService){
        super(disciplineService);
    }

    ngOnInit(): void {
    }




}
