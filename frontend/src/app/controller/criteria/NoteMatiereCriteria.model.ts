import {EtudiantCriteria} from './EtudiantCriteria.model';
import {MatiereCriteria} from './MatiereCriteria.model';
import {ProfesseurCriteria} from './ProfesseurCriteria.model';
import {ClasseRoomCriteria} from './ClasseRoomCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class NoteMatiereCriteria  extends   BaseCriteria  {

    public id: number;
     public note: number;
     public noteMin: number;
     public noteMax: number;
  public professeur: ProfesseurCriteria ;
  public professeurs: Array<ProfesseurCriteria> ;
  public classeRoom: ClasseRoomCriteria ;
  public classeRooms: Array<ClasseRoomCriteria> ;
  public matiere: MatiereCriteria ;
  public matieres: Array<MatiereCriteria> ;
  public etudiant: EtudiantCriteria ;
  public etudiants: Array<EtudiantCriteria> ;

}
