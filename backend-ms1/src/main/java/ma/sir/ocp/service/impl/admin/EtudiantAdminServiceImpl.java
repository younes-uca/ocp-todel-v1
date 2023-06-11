package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.Etudiant;
import ma.sir.ocp.bean.history.EtudiantHistory;
import ma.sir.ocp.dao.criteria.core.EtudiantCriteria;
import ma.sir.ocp.dao.criteria.history.EtudiantHistoryCriteria;
import ma.sir.ocp.dao.facade.core.EtudiantDao;
import ma.sir.ocp.dao.facade.history.EtudiantHistoryDao;
import ma.sir.ocp.dao.specification.core.EtudiantSpecification;
import ma.sir.ocp.service.facade.admin.EtudiantAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtudiantAdminServiceImpl extends AbstractServiceImpl<Etudiant,EtudiantHistory, EtudiantCriteria, EtudiantHistoryCriteria, EtudiantDao,
EtudiantHistoryDao> implements EtudiantAdminService {



    public Etudiant findByReferenceEntity(Etudiant t){
        return  dao.findByCodeMassar(t.getCodeMassar());
    }





    public void configure() {
        super.configure(Etudiant.class,EtudiantHistory.class, EtudiantHistoryCriteria.class, EtudiantSpecification.class);
    }


    public EtudiantAdminServiceImpl(EtudiantDao dao, EtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}