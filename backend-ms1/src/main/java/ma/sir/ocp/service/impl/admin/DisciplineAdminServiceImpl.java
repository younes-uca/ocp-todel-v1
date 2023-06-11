package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.Discipline;
import ma.sir.ocp.bean.history.DisciplineHistory;
import ma.sir.ocp.dao.criteria.core.DisciplineCriteria;
import ma.sir.ocp.dao.criteria.history.DisciplineHistoryCriteria;
import ma.sir.ocp.dao.facade.core.DisciplineDao;
import ma.sir.ocp.dao.facade.history.DisciplineHistoryDao;
import ma.sir.ocp.dao.specification.core.DisciplineSpecification;
import ma.sir.ocp.service.facade.admin.DisciplineAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class DisciplineAdminServiceImpl extends AbstractServiceImpl<Discipline,DisciplineHistory, DisciplineCriteria, DisciplineHistoryCriteria, DisciplineDao,
DisciplineHistoryDao> implements DisciplineAdminService {



    public Discipline findByReferenceEntity(Discipline t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Discipline.class,DisciplineHistory.class, DisciplineHistoryCriteria.class, DisciplineSpecification.class);
    }


    public DisciplineAdminServiceImpl(DisciplineDao dao, DisciplineHistoryDao historyDao) {
        super(dao, historyDao);
    }

}