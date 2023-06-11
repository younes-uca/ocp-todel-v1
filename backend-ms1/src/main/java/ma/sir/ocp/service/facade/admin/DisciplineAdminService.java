package ma.sir.ocp.service.facade.admin;

import java.util.List;
import ma.sir.ocp.bean.core.Discipline;
import ma.sir.ocp.dao.criteria.core.DisciplineCriteria;
import ma.sir.ocp.dao.criteria.history.DisciplineHistoryCriteria;
import ma.sir.ocp.zynerator.service.IService;


public interface DisciplineAdminService extends  IService<Discipline,DisciplineCriteria, DisciplineHistoryCriteria>  {




}
