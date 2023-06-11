package ma.sir.ocp.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "professeur")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="professeur_seq",sequenceName="professeur_seq",allocationSize=1, initialValue = 1)
public class Professeur   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String password;

    private Discipline discipline ;
    


    public Professeur(){
        super();
    }

    public Professeur(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="professeur_seq")
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
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Discipline getDiscipline(){
        return this.discipline;
    }
    public void setDiscipline(Discipline discipline){
        this.discipline = discipline;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professeur professeur = (Professeur) o;
        return id != null && id.equals(professeur.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

