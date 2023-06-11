package ma.sir.ocp.service.facade.admin;

import java.util.List;
import ma.sir.ocp.bean.core.Matiere;
import ma.sir.ocp.dao.criteria.core.MatiereCriteria;
import ma.sir.ocp.dao.criteria.history.MatiereHistoryCriteria;
import ma.sir.ocp.zynerator.service.IService;


public interface MatiereAdminService extends  IService<Matiere,MatiereCriteria, MatiereHistoryCriteria>  {




}
