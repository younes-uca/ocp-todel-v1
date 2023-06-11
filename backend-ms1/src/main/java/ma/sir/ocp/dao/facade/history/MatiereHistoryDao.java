package ma.sir.ocp.dao.facade.history;

import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.bean.history.MatiereHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereHistoryDao extends AbstractHistoryRepository<MatiereHistory,Long> {

}
