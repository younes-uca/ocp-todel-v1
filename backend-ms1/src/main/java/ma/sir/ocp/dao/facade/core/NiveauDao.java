package ma.sir.ocp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.Niveau;
import org.springframework.stereotype.Repository;
import ma.sir.ocp.bean.core.Niveau;
import java.util.List;


@Repository
public interface NiveauDao extends AbstractRepository<Niveau,Long>  {
    Niveau findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Niveau(item.id,item.code) FROM Niveau item")
    List<Niveau> findAllOptimized();
}
