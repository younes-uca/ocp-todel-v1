import {DisciplineCriteria} from './DisciplineCriteria.model';
import {EtudiantCriteria} from './EtudiantCriteria.model';
import {ProfesseurCriteria} from './ProfesseurCriteria.model';
import {ClasseRoomCriteria} from './ClasseRoomCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class NoteDisciplineCriteria  extends   BaseCriteria  {

    public id: number;
     public note: number;
     public noteMin: number;
     public noteMax: number;
  public professeur: ProfesseurCriteria ;
  public professeurs: Array<ProfesseurCriteria> ;
  public classeRoom: ClasseRoomCriteria ;
  public classeRooms: Array<ClasseRoomCriteria> ;
  public discipline: DisciplineCriteria ;
  public disciplines: Array<DisciplineCriteria> ;
  public etudiant: EtudiantCriteria ;
  public etudiants: Array<EtudiantCriteria> ;

}
