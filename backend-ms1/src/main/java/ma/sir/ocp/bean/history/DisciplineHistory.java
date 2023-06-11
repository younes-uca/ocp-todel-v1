package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "discipline")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="discipline_seq",sequenceName="discipline_seq",allocationSize=1, initialValue = 1)
public class DisciplineHistory extends HistBusinessObject  {


    public DisciplineHistory() {
    super();
    }

    public DisciplineHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="discipline_seq")
    public Long getId() {
    return id;
    }
}

