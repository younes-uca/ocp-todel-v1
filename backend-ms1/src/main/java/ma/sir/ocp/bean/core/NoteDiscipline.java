package ma.sir.ocp.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "note_discipline")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="note_discipline_seq",sequenceName="note_discipline_seq",allocationSize=1, initialValue = 1)
public class NoteDiscipline   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal note = BigDecimal.ZERO;

    private Professeur professeur ;
    
    private ClasseRoom classeRoom ;
    
    private Discipline discipline ;
    
    private Etudiant etudiant ;
    


    public NoteDiscipline(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="note_discipline_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Professeur getProfesseur(){
        return this.professeur;
    }
    public void setProfesseur(Professeur professeur){
        this.professeur = professeur;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ClasseRoom getClasseRoom(){
        return this.classeRoom;
    }
    public void setClasseRoom(ClasseRoom classeRoom){
        this.classeRoom = classeRoom;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Discipline getDiscipline(){
        return this.discipline;
    }
    public void setDiscipline(Discipline discipline){
        this.discipline = discipline;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteDiscipline noteDiscipline = (NoteDiscipline) o;
        return id != null && id.equals(noteDiscipline.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

