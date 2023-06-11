package ma.sir.ocp.dao.facade.history;

import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.bean.history.EtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantHistoryDao extends AbstractHistoryRepository<EtudiantHistory,Long> {

}
