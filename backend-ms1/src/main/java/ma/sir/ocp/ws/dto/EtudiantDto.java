package  ma.sir.ocp.ws.dto;

import ma.sir.ocp.zynerator.audit.Log;
import ma.sir.ocp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtudiantDto  extends AuditBaseDto {

    private String nom  ;
    private String prenom  ;
    private String email  ;
    private String anneeDinscription  ;
    private String codeMassar  ;
    private String password  ;




    public EtudiantDto(){
        super();
    }



    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Log
    public String getAnneeDinscription(){
        return this.anneeDinscription;
    }
    public void setAnneeDinscription(String anneeDinscription){
        this.anneeDinscription = anneeDinscription;
    }

    @Log
    public String getCodeMassar(){
        return this.codeMassar;
    }
    public void setCodeMassar(String codeMassar){
        this.codeMassar = codeMassar;
    }

    @Log
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }






}
