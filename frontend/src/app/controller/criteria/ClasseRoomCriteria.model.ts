import {NiveauCriteria} from './NiveauCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class ClasseRoomCriteria  extends   BaseCriteria  {

    public id: number;
    public libelle: string;
    public libelleLike: string;
    public code: string;
    public codeLike: string;
    public anneeScolaire: string;
    public anneeScolaireLike: string;
  public niveau: NiveauCriteria ;
  public niveaus: Array<NiveauCriteria> ;

}
