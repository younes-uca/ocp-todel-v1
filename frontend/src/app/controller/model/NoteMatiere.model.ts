import {EtudiantDto} from './Etudiant.model';
import {MatiereDto} from './Matiere.model';
import {ProfesseurDto} from './Professeur.model';
import {ClasseRoomDto} from './ClasseRoom.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class NoteMatiereDto  extends BaseDto{

    public id: number;
    public note: number;
    public noteMax: string ;
    public noteMin: string ;
    public professeur: ProfesseurDto ;
    public classeRoom: ClasseRoomDto ;
    public matiere: MatiereDto ;
    public etudiant: EtudiantDto ;

}
