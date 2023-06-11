package  ma.sir.ocp.dao.criteria.core;


import ma.sir.ocp.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EtudiantCriteria extends  BaseCriteria  {

    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String email;
    private String emailLike;
    private String anneeDinscription;
    private String anneeDinscriptionLike;
    private String codeMassar;
    private String codeMassarLike;
    private String password;
    private String passwordLike;



    public EtudiantCriteria(){}

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

    public String getAnneeDinscription(){
        return this.anneeDinscription;
    }
    public void setAnneeDinscription(String anneeDinscription){
        this.anneeDinscription = anneeDinscription;
    }
    public String getAnneeDinscriptionLike(){
        return this.anneeDinscriptionLike;
    }
    public void setAnneeDinscriptionLike(String anneeDinscriptionLike){
        this.anneeDinscriptionLike = anneeDinscriptionLike;
    }

    public String getCodeMassar(){
        return this.codeMassar;
    }
    public void setCodeMassar(String codeMassar){
        this.codeMassar = codeMassar;
    }
    public String getCodeMassarLike(){
        return this.codeMassarLike;
    }
    public void setCodeMassarLike(String codeMassarLike){
        this.codeMassarLike = codeMassarLike;
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


}
