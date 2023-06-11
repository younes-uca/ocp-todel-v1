import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EtudiantService} from 'src/app/controller/service/Etudiant.service';
import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {EtudiantCriteria} from 'src/app/controller/criteria/EtudiantCriteria.model';

@Component({
  selector: 'app-etudiant-view-admin',
  templateUrl: './etudiant-view-admin.component.html'
})
export class EtudiantViewAdminComponent extends AbstractViewController<EtudiantDto, EtudiantCriteria, EtudiantService> implements OnInit {


    constructor(private etudiantService: EtudiantService){
        super(etudiantService);
    }

    ngOnInit(): void {
    }




}
