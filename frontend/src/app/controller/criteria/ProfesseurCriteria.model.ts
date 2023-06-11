import {DisciplineCriteria} from './DisciplineCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class ProfesseurCriteria  extends   BaseCriteria  {

    public id: number;
    public nom: string;
    public nomLike: string;
    public prenom: string;
    public prenomLike: string;
    public email: string;
    public emailLike: string;
    public code: string;
    public codeLike: string;
    public password: string;
    public passwordLike: string;
  public discipline: DisciplineCriteria ;
  public disciplines: Array<DisciplineCriteria> ;

}
