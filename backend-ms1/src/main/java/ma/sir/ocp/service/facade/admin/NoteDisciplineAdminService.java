package ma.sir.ocp.service.facade.admin;

import java.util.List;
import ma.sir.ocp.bean.core.NoteDiscipline;
import ma.sir.ocp.dao.criteria.core.NoteDisciplineCriteria;
import ma.sir.ocp.dao.criteria.history.NoteDisciplineHistoryCriteria;
import ma.sir.ocp.zynerator.service.IService;


public interface NoteDisciplineAdminService extends  IService<NoteDiscipline,NoteDisciplineCriteria, NoteDisciplineHistoryCriteria>  {

    List<NoteDiscipline> findByProfesseurId(Long id);
    int deleteByProfesseurId(Long id);
    List<NoteDiscipline> findByClasseRoomId(Long id);
    int deleteByClasseRoomId(Long id);
    List<NoteDiscipline> findByDisciplineId(Long id);
    int deleteByDisciplineId(Long id);
    List<NoteDiscipline> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
