package  ma.sir.ocp.ws.dto;

import ma.sir.ocp.zynerator.audit.Log;
import ma.sir.ocp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfesseurDto  extends AuditBaseDto {

    private String nom  ;
    private String prenom  ;
    private String email  ;
    private String code  ;
    private String password  ;

    private DisciplineDto discipline ;



    public ProfesseurDto(){
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
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }


    public DisciplineDto getDiscipline(){
        return this.discipline;
    }

    public void setDiscipline(DisciplineDto discipline){
        this.discipline = discipline;
    }




}
