package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.Niveau;
import ma.sir.ocp.bean.history.NiveauHistory;
import ma.sir.ocp.dao.criteria.core.NiveauCriteria;
import ma.sir.ocp.dao.criteria.history.NiveauHistoryCriteria;
import ma.sir.ocp.dao.facade.core.NiveauDao;
import ma.sir.ocp.dao.facade.history.NiveauHistoryDao;
import ma.sir.ocp.dao.specification.core.NiveauSpecification;
import ma.sir.ocp.service.facade.admin.NiveauAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NiveauAdminServiceImpl extends AbstractServiceImpl<Niveau,NiveauHistory, NiveauCriteria, NiveauHistoryCriteria, NiveauDao,
NiveauHistoryDao> implements NiveauAdminService {



    public Niveau findByReferenceEntity(Niveau t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Niveau.class,NiveauHistory.class, NiveauHistoryCriteria.class, NiveauSpecification.class);
    }


    public NiveauAdminServiceImpl(NiveauDao dao, NiveauHistoryDao historyDao) {
        super(dao, historyDao);
    }

}