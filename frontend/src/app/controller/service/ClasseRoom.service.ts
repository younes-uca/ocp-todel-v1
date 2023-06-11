import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {ClasseRoomDto} from '../model/ClasseRoom.model';
import {ClasseRoomCriteria} from '../criteria/ClasseRoomCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {NiveauDto} from '../model/Niveau.model';

@Injectable({
  providedIn: 'root'
})
export class ClasseRoomService extends AbstractService<ClasseRoomDto, ClasseRoomCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/classeRoom/');
    }

    public constrcutDto(): ClasseRoomDto {
        return new ClasseRoomDto();
    }

    public constrcutCriteria(): ClasseRoomCriteria {
        return new ClasseRoomCriteria();
    }
}
