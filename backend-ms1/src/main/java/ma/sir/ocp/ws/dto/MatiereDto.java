package  ma.sir.ocp.ws.dto;

import ma.sir.ocp.zynerator.audit.Log;
import ma.sir.ocp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatiereDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;




    public MatiereDto(){
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






}
