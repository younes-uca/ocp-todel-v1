package ma.sir.ocp.service.facade.admin;

import java.util.List;
import ma.sir.ocp.bean.core.Professeur;
import ma.sir.ocp.dao.criteria.core.ProfesseurCriteria;
import ma.sir.ocp.dao.criteria.history.ProfesseurHistoryCriteria;
import ma.sir.ocp.zynerator.service.IService;


public interface ProfesseurAdminService extends  IService<Professeur,ProfesseurCriteria, ProfesseurHistoryCriteria>  {

    List<Professeur> findByDisciplineId(Long id);
    int deleteByDisciplineId(Long id);



}
