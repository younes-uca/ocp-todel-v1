package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.NoteMatiere;
import ma.sir.ocp.bean.history.NoteMatiereHistory;
import ma.sir.ocp.dao.criteria.core.NoteMatiereCriteria;
import ma.sir.ocp.dao.criteria.history.NoteMatiereHistoryCriteria;
import ma.sir.ocp.dao.facade.core.NoteMatiereDao;
import ma.sir.ocp.dao.facade.history.NoteMatiereHistoryDao;
import ma.sir.ocp.dao.specification.core.NoteMatiereSpecification;
import ma.sir.ocp.service.facade.admin.NoteMatiereAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.ocp.service.facade.admin.EtudiantAdminService ;
import ma.sir.ocp.service.facade.admin.MatiereAdminService ;
import ma.sir.ocp.service.facade.admin.ClasseRoomAdminService ;
import ma.sir.ocp.service.facade.admin.ProfesseurAdminService ;


import java.util.List;
@Service
public class NoteMatiereAdminServiceImpl extends AbstractServiceImpl<NoteMatiere,NoteMatiereHistory, NoteMatiereCriteria, NoteMatiereHistoryCriteria, NoteMatiereDao,
NoteMatiereHistoryDao> implements NoteMatiereAdminService {




    public List<NoteMatiere> findByProfesseurId(Long id){
        return dao.findByProfesseurId(id);
    }
    public int deleteByProfesseurId(Long id){
        return dao.deleteByProfesseurId(id);
    }
    public List<NoteMatiere> findByClasseRoomId(Long id){
        return dao.findByClasseRoomId(id);
    }
    public int deleteByClasseRoomId(Long id){
        return dao.deleteByClasseRoomId(id);
    }
    public List<NoteMatiere> findByMatiereId(Long id){
        return dao.findByMatiereId(id);
    }
    public int deleteByMatiereId(Long id){
        return dao.deleteByMatiereId(id);
    }
    public List<NoteMatiere> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }




    public void configure() {
        super.configure(NoteMatiere.class,NoteMatiereHistory.class, NoteMatiereHistoryCriteria.class, NoteMatiereSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private MatiereAdminService matiereService ;
    @Autowired
    private ClasseRoomAdminService classeRoomService ;
    @Autowired
    private ProfesseurAdminService professeurService ;

    public NoteMatiereAdminServiceImpl(NoteMatiereDao dao, NoteMatiereHistoryDao historyDao) {
        super(dao, historyDao);
    }

}