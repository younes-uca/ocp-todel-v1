import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {NiveauDto} from '../model/Niveau.model';
import {NiveauCriteria} from '../criteria/NiveauCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class NiveauService extends AbstractService<NiveauDto, NiveauCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/niveau/');
    }

    public constrcutDto(): NiveauDto {
        return new NiveauDto();
    }

    public constrcutCriteria(): NiveauCriteria {
        return new NiveauCriteria();
    }
}
