package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.Matiere;
import ma.sir.ocp.bean.history.MatiereHistory;
import ma.sir.ocp.dao.criteria.core.MatiereCriteria;
import ma.sir.ocp.dao.criteria.history.MatiereHistoryCriteria;
import ma.sir.ocp.dao.facade.core.MatiereDao;
import ma.sir.ocp.dao.facade.history.MatiereHistoryDao;
import ma.sir.ocp.dao.specification.core.MatiereSpecification;
import ma.sir.ocp.service.facade.admin.MatiereAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class MatiereAdminServiceImpl extends AbstractServiceImpl<Matiere,MatiereHistory, MatiereCriteria, MatiereHistoryCriteria, MatiereDao,
MatiereHistoryDao> implements MatiereAdminService {



    public Matiere findByReferenceEntity(Matiere t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Matiere.class,MatiereHistory.class, MatiereHistoryCriteria.class, MatiereSpecification.class);
    }


    public MatiereAdminServiceImpl(MatiereDao dao, MatiereHistoryDao historyDao) {
        super(dao, historyDao);
    }

}