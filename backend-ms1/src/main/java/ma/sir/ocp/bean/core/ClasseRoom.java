package ma.sir.ocp.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "classe_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="classe_room_seq",sequenceName="classe_room_seq",allocationSize=1, initialValue = 1)
public class ClasseRoom   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String anneeScolaire;

    private Niveau niveau ;
    


    public ClasseRoom(){
        super();
    }

    public ClasseRoom(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="classe_room_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getAnneeScolaire(){
        return this.anneeScolaire;
    }
    public void setAnneeScolaire(String anneeScolaire){
        this.anneeScolaire = anneeScolaire;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Niveau getNiveau(){
        return this.niveau;
    }
    public void setNiveau(Niveau niveau){
        this.niveau = niveau;
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
        ClasseRoom classeRoom = (ClasseRoom) o;
        return id != null && id.equals(classeRoom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

