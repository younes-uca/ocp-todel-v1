package ma.sir.ocp.service.facade.admin;

import java.util.List;
import ma.sir.ocp.bean.core.NoteMatiere;
import ma.sir.ocp.dao.criteria.core.NoteMatiereCriteria;
import ma.sir.ocp.dao.criteria.history.NoteMatiereHistoryCriteria;
import ma.sir.ocp.zynerator.service.IService;


public interface NoteMatiereAdminService extends  IService<NoteMatiere,NoteMatiereCriteria, NoteMatiereHistoryCriteria>  {

    List<NoteMatiere> findByProfesseurId(Long id);
    int deleteByProfesseurId(Long id);
    List<NoteMatiere> findByClasseRoomId(Long id);
    int deleteByClasseRoomId(Long id);
    List<NoteMatiere> findByMatiereId(Long id);
    int deleteByMatiereId(Long id);
    List<NoteMatiere> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
