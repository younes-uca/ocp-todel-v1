package  ma.sir.ocp.dao.criteria.core;


import ma.sir.ocp.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ClasseRoomCriteria extends  BaseCriteria  {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private String anneeScolaire;
    private String anneeScolaireLike;

    private NiveauCriteria niveau ;
    private List<NiveauCriteria> niveaus ;


    public ClasseRoomCriteria(){}

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getAnneeScolaire(){
        return this.anneeScolaire;
    }
    public void setAnneeScolaire(String anneeScolaire){
        this.anneeScolaire = anneeScolaire;
    }
    public String getAnneeScolaireLike(){
        return this.anneeScolaireLike;
    }
    public void setAnneeScolaireLike(String anneeScolaireLike){
        this.anneeScolaireLike = anneeScolaireLike;
    }


    public NiveauCriteria getNiveau(){
        return this.niveau;
    }

    public void setNiveau(NiveauCriteria niveau){
        this.niveau = niveau;
    }
    public List<NiveauCriteria> getNiveaus(){
        return this.niveaus;
    }

    public void setNiveaus(List<NiveauCriteria> niveaus){
        this.niveaus = niveaus;
    }
}
