package ma.sir.ocp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.ClasseRoom;
import org.springframework.stereotype.Repository;
import ma.sir.ocp.bean.core.ClasseRoom;
import java.util.List;


@Repository
public interface ClasseRoomDao extends AbstractRepository<ClasseRoom,Long>  {
    ClasseRoom findByCode(String code);
    int deleteByCode(String code);

    List<ClasseRoom> findByNiveauId(Long id);
    int deleteByNiveauId(Long id);

    @Query("SELECT NEW ClasseRoom(item.id,item.code) FROM ClasseRoom item")
    List<ClasseRoom> findAllOptimized();
}
