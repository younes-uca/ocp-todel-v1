import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {NiveauService} from 'src/app/controller/service/Niveau.service';
import {NiveauDto} from 'src/app/controller/model/Niveau.model';
import {NiveauCriteria} from 'src/app/controller/criteria/NiveauCriteria.model';

@Component({
  selector: 'app-niveau-view-admin',
  templateUrl: './niveau-view-admin.component.html'
})
export class NiveauViewAdminComponent extends AbstractViewController<NiveauDto, NiveauCriteria, NiveauService> implements OnInit {


    constructor(private niveauService: NiveauService){
        super(niveauService);
    }

    ngOnInit(): void {
    }




}
