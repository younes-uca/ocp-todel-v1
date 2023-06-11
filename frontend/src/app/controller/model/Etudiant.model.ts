import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class EtudiantDto  extends BaseDto{

    public id: number;
    public nom: string;
    public prenom: string;
    public email: string;
    public anneeDinscription: string;
    public codeMassar: string;
    public password: string;

}
