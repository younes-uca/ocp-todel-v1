package  ma.sir.ocp.dao.criteria.core;


import ma.sir.ocp.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ProfesseurCriteria extends  BaseCriteria  {

    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String email;
    private String emailLike;
    private String code;
    private String codeLike;
    private String password;
    private String passwordLike;

    private DisciplineCriteria discipline ;
    private List<DisciplineCriteria> disciplines ;


    public ProfesseurCriteria(){}

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
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

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPasswordLike(){
        return this.passwordLike;
    }
    public void setPasswordLike(String passwordLike){
        this.passwordLike = passwordLike;
    }


    public DisciplineCriteria getDiscipline(){
        return this.discipline;
    }

    public void setDiscipline(DisciplineCriteria discipline){
        this.discipline = discipline;
    }
    public List<DisciplineCriteria> getDisciplines(){
        return this.disciplines;
    }

    public void setDisciplines(List<DisciplineCriteria> disciplines){
        this.disciplines = disciplines;
    }
}
