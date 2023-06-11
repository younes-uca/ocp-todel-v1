package ma.sir.ocp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.Discipline;
import org.springframework.stereotype.Repository;
import ma.sir.ocp.bean.core.Discipline;
import java.util.List;


@Repository
public interface DisciplineDao extends AbstractRepository<Discipline,Long>  {
    Discipline findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Discipline(item.id,item.code) FROM Discipline item")
    List<Discipline> findAllOptimized();
}
