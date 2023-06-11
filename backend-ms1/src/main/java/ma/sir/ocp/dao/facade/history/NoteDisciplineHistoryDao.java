package ma.sir.ocp.dao.facade.history;

import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.bean.history.NoteDisciplineHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDisciplineHistoryDao extends AbstractHistoryRepository<NoteDisciplineHistory,Long> {

}
