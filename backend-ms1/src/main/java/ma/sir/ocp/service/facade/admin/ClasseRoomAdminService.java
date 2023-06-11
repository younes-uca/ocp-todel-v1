package ma.sir.ocp.service.facade.admin;

import java.util.List;
import ma.sir.ocp.bean.core.ClasseRoom;
import ma.sir.ocp.dao.criteria.core.ClasseRoomCriteria;
import ma.sir.ocp.dao.criteria.history.ClasseRoomHistoryCriteria;
import ma.sir.ocp.zynerator.service.IService;


public interface ClasseRoomAdminService extends  IService<ClasseRoom,ClasseRoomCriteria, ClasseRoomHistoryCriteria>  {

    List<ClasseRoom> findByNiveauId(Long id);
    int deleteByNiveauId(Long id);



}
