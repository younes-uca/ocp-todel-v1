package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "professeur")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="professeur_seq",sequenceName="professeur_seq",allocationSize=1, initialValue = 1)
public class ProfesseurHistory extends HistBusinessObject  {


    public ProfesseurHistory() {
    super();
    }

    public ProfesseurHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="professeur_seq")
    public Long getId() {
    return id;
    }
}

