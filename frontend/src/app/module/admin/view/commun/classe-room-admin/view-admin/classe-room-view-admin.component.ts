import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ClasseRoomService} from 'src/app/controller/service/ClasseRoom.service';
import {ClasseRoomDto} from 'src/app/controller/model/ClasseRoom.model';
import {ClasseRoomCriteria} from 'src/app/controller/criteria/ClasseRoomCriteria.model';

import {NiveauDto} from 'src/app/controller/model/Niveau.model';
import {NiveauService} from 'src/app/controller/service/Niveau.service';
@Component({
  selector: 'app-classe-room-view-admin',
  templateUrl: './classe-room-view-admin.component.html'
})
export class ClasseRoomViewAdminComponent extends AbstractViewController<ClasseRoomDto, ClasseRoomCriteria, ClasseRoomService> implements OnInit {


    constructor(private classeRoomService: ClasseRoomService, private niveauService: NiveauService){
        super(classeRoomService);
    }

    ngOnInit(): void {
        this.niveau = new NiveauDto();
        this.niveauService.findAll().subscribe((data) => this.niveaus = data);
    }


    get niveau(): NiveauDto {
       return this.niveauService.item;
    }
    set niveau(value: NiveauDto) {
        this.niveauService.item = value;
    }
    get niveaus():Array<NiveauDto> {
       return this.niveauService.items;
    }
    set niveaus(value: Array<NiveauDto>) {
        this.niveauService.items = value;
    }


}
