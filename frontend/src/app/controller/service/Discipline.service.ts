import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {DisciplineDto} from '../model/Discipline.model';
import {DisciplineCriteria} from '../criteria/DisciplineCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class DisciplineService extends AbstractService<DisciplineDto, DisciplineCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/discipline/');
    }

    public constrcutDto(): DisciplineDto {
        return new DisciplineDto();
    }

    public constrcutCriteria(): DisciplineCriteria {
        return new DisciplineCriteria();
    }
}
