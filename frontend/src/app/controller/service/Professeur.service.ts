import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {ProfesseurDto} from '../model/Professeur.model';
import {ProfesseurCriteria} from '../criteria/ProfesseurCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DisciplineDto} from '../model/Discipline.model';

@Injectable({
  providedIn: 'root'
})
export class ProfesseurService extends AbstractService<ProfesseurDto, ProfesseurCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/professeur/');
    }

    public constrcutDto(): ProfesseurDto {
        return new ProfesseurDto();
    }

    public constrcutCriteria(): ProfesseurCriteria {
        return new ProfesseurCriteria();
    }
}
