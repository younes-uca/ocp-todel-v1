package ma.sir.ocp.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "classe_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="classe_room_seq",sequenceName="classe_room_seq",allocationSize=1, initialValue = 1)
public class ClasseRoomHistory extends HistBusinessObject  {


    public ClasseRoomHistory() {
    super();
    }

    public ClasseRoomHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="classe_room_seq")
    public Long getId() {
    return id;
    }
}

