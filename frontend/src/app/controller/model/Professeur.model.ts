import {DisciplineDto} from './Discipline.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ProfesseurDto  extends BaseDto{

    public id: number;
    public nom: string;
    public prenom: string;
    public email: string;
    public code: string;
    public password: string;
    public discipline: DisciplineDto ;

}
