import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {NoteMatiereDto} from '../model/NoteMatiere.model';
import {NoteMatiereCriteria} from '../criteria/NoteMatiereCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {EtudiantDto} from '../model/Etudiant.model';
import {MatiereDto} from '../model/Matiere.model';
import {ProfesseurDto} from '../model/Professeur.model';
import {ClasseRoomDto} from '../model/ClasseRoom.model';

@Injectable({
  providedIn: 'root'
})
export class NoteMatiereService extends AbstractService<NoteMatiereDto, NoteMatiereCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/noteMatiere/');
    }

    public constrcutDto(): NoteMatiereDto {
        return new NoteMatiereDto();
    }

    public constrcutCriteria(): NoteMatiereCriteria {
        return new NoteMatiereCriteria();
    }
}
