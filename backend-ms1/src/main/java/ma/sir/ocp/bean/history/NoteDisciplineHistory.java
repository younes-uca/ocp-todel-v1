package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "note_discipline")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="note_discipline_seq",sequenceName="note_discipline_seq",allocationSize=1, initialValue = 1)
public class NoteDisciplineHistory extends HistBusinessObject  {


    public NoteDisciplineHistory() {
    super();
    }

    public NoteDisciplineHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="note_discipline_seq")
    public Long getId() {
    return id;
    }
}

