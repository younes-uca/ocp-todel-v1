package ma.sir.ocp.dao.facade.history;

import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.bean.history.DisciplineHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplineHistoryDao extends AbstractHistoryRepository<DisciplineHistory,Long> {

}
