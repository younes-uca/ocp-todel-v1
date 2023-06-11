package  ma.sir.ocp.ws.dto;

import ma.sir.ocp.zynerator.audit.Log;
import ma.sir.ocp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClasseRoomDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;
    private String anneeScolaire  ;

    private NiveauDto niveau ;



    public ClasseRoomDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getAnneeScolaire(){
        return this.anneeScolaire;
    }
    public void setAnneeScolaire(String anneeScolaire){
        this.anneeScolaire = anneeScolaire;
    }


    public NiveauDto getNiveau(){
        return this.niveau;
    }

    public void setNiveau(NiveauDto niveau){
        this.niveau = niveau;
    }




}
