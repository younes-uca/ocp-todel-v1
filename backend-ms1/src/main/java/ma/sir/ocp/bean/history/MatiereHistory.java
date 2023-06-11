package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "matiere")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="matiere_seq",sequenceName="matiere_seq",allocationSize=1, initialValue = 1)
public class MatiereHistory extends HistBusinessObject  {


    public MatiereHistory() {
    super();
    }

    public MatiereHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="matiere_seq")
    public Long getId() {
    return id;
    }
}

