import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {MatiereService} from 'src/app/controller/service/Matiere.service';
import {MatiereDto} from 'src/app/controller/model/Matiere.model';
import {MatiereCriteria} from 'src/app/controller/criteria/MatiereCriteria.model';

@Component({
  selector: 'app-matiere-view-admin',
  templateUrl: './matiere-view-admin.component.html'
})
export class MatiereViewAdminComponent extends AbstractViewController<MatiereDto, MatiereCriteria, MatiereService> implements OnInit {


    constructor(private matiereService: MatiereService){
        super(matiereService);
    }

    ngOnInit(): void {
    }




}
