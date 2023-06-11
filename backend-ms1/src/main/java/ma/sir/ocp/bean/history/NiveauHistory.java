package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "niveau")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="niveau_seq",sequenceName="niveau_seq",allocationSize=1, initialValue = 1)
public class NiveauHistory extends HistBusinessObject  {


    public NiveauHistory() {
    super();
    }

    public NiveauHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="niveau_seq")
    public Long getId() {
    return id;
    }
}

