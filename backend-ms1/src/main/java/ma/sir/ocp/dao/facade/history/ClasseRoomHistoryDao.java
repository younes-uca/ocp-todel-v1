package ma.sir.ocp.dao.facade.history;

import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.bean.history.ClasseRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRoomHistoryDao extends AbstractHistoryRepository<ClasseRoomHistory,Long> {

}
