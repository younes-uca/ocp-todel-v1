package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "note_matiere")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="note_matiere_seq",sequenceName="note_matiere_seq",allocationSize=1, initialValue = 1)
public class NoteMatiereHistory extends HistBusinessObject  {


    public NoteMatiereHistory() {
    super();
    }

    public NoteMatiereHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="note_matiere_seq")
    public Long getId() {
    return id;
    }
}

