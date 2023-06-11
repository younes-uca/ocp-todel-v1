package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.NoteDiscipline;
import ma.sir.ocp.bean.history.NoteDisciplineHistory;
import ma.sir.ocp.dao.criteria.core.NoteDisciplineCriteria;
import ma.sir.ocp.dao.criteria.history.NoteDisciplineHistoryCriteria;
import ma.sir.ocp.dao.facade.core.NoteDisciplineDao;
import ma.sir.ocp.dao.facade.history.NoteDisciplineHistoryDao;
import ma.sir.ocp.dao.specification.core.NoteDisciplineSpecification;
import ma.sir.ocp.service.facade.admin.NoteDisciplineAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.ocp.service.facade.admin.EtudiantAdminService ;
import ma.sir.ocp.service.facade.admin.ClasseRoomAdminService ;
import ma.sir.ocp.service.facade.admin.DisciplineAdminService ;
import ma.sir.ocp.service.facade.admin.ProfesseurAdminService ;


import java.util.List;
@Service
public class NoteDisciplineAdminServiceImpl extends AbstractServiceImpl<NoteDiscipline,NoteDisciplineHistory, NoteDisciplineCriteria, NoteDisciplineHistoryCriteria, NoteDisciplineDao,
NoteDisciplineHistoryDao> implements NoteDisciplineAdminService {




    public List<NoteDiscipline> findByProfesseurId(Long id){
        return dao.findByProfesseurId(id);
    }
    public int deleteByProfesseurId(Long id){
        return dao.deleteByProfesseurId(id);
    }
    public List<NoteDiscipline> findByClasseRoomId(Long id){
        return dao.findByClasseRoomId(id);
    }
    public int deleteByClasseRoomId(Long id){
        return dao.deleteByClasseRoomId(id);
    }
    public List<NoteDiscipline> findByDisciplineId(Long id){
        return dao.findByDisciplineId(id);
    }
    public int deleteByDisciplineId(Long id){
        return dao.deleteByDisciplineId(id);
    }
    public List<NoteDiscipline> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }




    public void configure() {
        super.configure(NoteDiscipline.class,NoteDisciplineHistory.class, NoteDisciplineHistoryCriteria.class, NoteDisciplineSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ClasseRoomAdminService classeRoomService ;
    @Autowired
    private DisciplineAdminService disciplineService ;
    @Autowired
    private ProfesseurAdminService professeurService ;

    public NoteDisciplineAdminServiceImpl(NoteDisciplineDao dao, NoteDisciplineHistoryDao historyDao) {
        super(dao, historyDao);
    }

}