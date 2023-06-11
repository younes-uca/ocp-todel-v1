package ma.sir.ocp.dao.facade.history;

import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.bean.history.ProfesseurHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurHistoryDao extends AbstractHistoryRepository<ProfesseurHistory,Long> {

}
