package ma.sir.ocp.service.impl.admin;

import ma.sir.ocp.bean.core.ClasseRoom;
import ma.sir.ocp.bean.history.ClasseRoomHistory;
import ma.sir.ocp.dao.criteria.core.ClasseRoomCriteria;
import ma.sir.ocp.dao.criteria.history.ClasseRoomHistoryCriteria;
import ma.sir.ocp.dao.facade.core.ClasseRoomDao;
import ma.sir.ocp.dao.facade.history.ClasseRoomHistoryDao;
import ma.sir.ocp.dao.specification.core.ClasseRoomSpecification;
import ma.sir.ocp.service.facade.admin.ClasseRoomAdminService;
import ma.sir.ocp.zynerator.service.AbstractServiceImpl;
import ma.sir.ocp.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.ocp.service.facade.admin.NiveauAdminService ;


import java.util.List;
@Service
public class ClasseRoomAdminServiceImpl extends AbstractServiceImpl<ClasseRoom,ClasseRoomHistory, ClasseRoomCriteria, ClasseRoomHistoryCriteria, ClasseRoomDao,
ClasseRoomHistoryDao> implements ClasseRoomAdminService {



    public ClasseRoom findByReferenceEntity(ClasseRoom t){
        return  dao.findByCode(t.getCode());
    }

    public List<ClasseRoom> findByNiveauId(Long id){
        return dao.findByNiveauId(id);
    }
    public int deleteByNiveauId(Long id){
        return dao.deleteByNiveauId(id);
    }




    public void configure() {
        super.configure(ClasseRoom.class,ClasseRoomHistory.class, ClasseRoomHistoryCriteria.class, ClasseRoomSpecification.class);
    }

    @Autowired
    private NiveauAdminService niveauService ;

    public ClasseRoomAdminServiceImpl(ClasseRoomDao dao, ClasseRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}