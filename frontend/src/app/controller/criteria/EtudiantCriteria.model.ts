import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class EtudiantCriteria  extends   BaseCriteria  {

    public id: number;
    public nom: string;
    public nomLike: string;
    public prenom: string;
    public prenomLike: string;
    public email: string;
    public emailLike: string;
    public anneeDinscription: string;
    public anneeDinscriptionLike: string;
    public codeMassar: string;
    public codeMassarLike: string;
    public password: string;
    public passwordLike: string;

}
