package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.Professeur;
import ma.sir.ocp.bean.history.ProfesseurHistory;
import ma.sir.ocp.dao.criteria.core.ProfesseurCriteria;
import ma.sir.ocp.dao.criteria.history.ProfesseurHistoryCriteria;
import ma.sir.ocp.dao.facade.core.ProfesseurDao;
import ma.sir.ocp.dao.facade.history.ProfesseurHistoryDao;
import ma.sir.ocp.dao.specification.core.ProfesseurSpecification;
import ma.sir.ocp.service.facade.admin.ProfesseurAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.ocp.service.facade.admin.DisciplineAdminService ;


import java.util.List;
@Service
public class ProfesseurAdminServiceImpl extends AbstractServiceImpl<Professeur,ProfesseurHistory, ProfesseurCriteria, ProfesseurHistoryCriteria, ProfesseurDao,
ProfesseurHistoryDao> implements ProfesseurAdminService {



    public Professeur findByReferenceEntity(Professeur t){
        return  dao.findByCode(t.getCode());
    }

    public List<Professeur> findByDisciplineId(Long id){
        return dao.findByDisciplineId(id);
    }
    public int deleteByDisciplineId(Long id){
        return dao.deleteByDisciplineId(id);
    }




    public void configure() {
        super.configure(Professeur.class,ProfesseurHistory.class, ProfesseurHistoryCriteria.class, ProfesseurSpecification.class);
    }

    @Autowired
    private DisciplineAdminService disciplineService ;

    public ProfesseurAdminServiceImpl(ProfesseurDao dao, ProfesseurHistoryDao historyDao) {
        super(dao, historyDao);
    }

}