package ma.sir.ocp.dao.facade.history;

import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.bean.history.NiveauHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauHistoryDao extends AbstractHistoryRepository<NiveauHistory,Long> {

}
