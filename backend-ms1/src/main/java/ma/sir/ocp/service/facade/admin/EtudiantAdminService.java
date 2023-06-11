package ma.sir.ocp.service.facade.admin;

import java.util.List;
import ma.sir.ocp.bean.core.Etudiant;
import ma.sir.ocp.dao.criteria.core.EtudiantCriteria;
import ma.sir.ocp.dao.criteria.history.EtudiantHistoryCriteria;
import ma.sir.ocp.zynerator.service.IService;


public interface EtudiantAdminService extends  IService<Etudiant,EtudiantCriteria, EtudiantHistoryCriteria>  {




}
