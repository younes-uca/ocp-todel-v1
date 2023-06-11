package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etudiant_seq",sequenceName="etudiant_seq",allocationSize=1, initialValue = 1)
public class EtudiantHistory extends HistBusinessObject  {


    public EtudiantHistory() {
    super();
    }

    public EtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etudiant_seq")
    public Long getId() {
    return id;
    }
}

