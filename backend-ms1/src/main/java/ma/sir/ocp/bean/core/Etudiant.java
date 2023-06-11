package ma.sir.ocp.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etudiant_seq",sequenceName="etudiant_seq",allocationSize=1, initialValue = 1)
public class Etudiant   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String anneeDinscription;
    @Column(length = 500)
    private String codeMassar;
    @Column(length = 500)
    private String password;



    public Etudiant(){
        super();
    }

    public Etudiant(Long id,String codeMassar){
        this.id = id;
        this.codeMassar = codeMassar ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etudiant_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getAnneeDinscription(){
        return this.anneeDinscription;
    }
    public void setAnneeDinscription(String anneeDinscription){
        this.anneeDinscription = anneeDinscription;
    }
    public String getCodeMassar(){
        return this.codeMassar;
    }
    public void setCodeMassar(String codeMassar){
        this.codeMassar = codeMassar;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Transient
    public String getLabel() {
        label = codeMassar;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id != null && id.equals(etudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

