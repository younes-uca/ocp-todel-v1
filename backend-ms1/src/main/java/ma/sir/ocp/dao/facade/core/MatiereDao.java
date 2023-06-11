package ma.sir.ocp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.Matiere;
import org.springframework.stereotype.Repository;
import ma.sir.ocp.bean.core.Matiere;
import java.util.List;


@Repository
public interface MatiereDao extends AbstractRepository<Matiere,Long>  {
    Matiere findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Matiere(item.id,item.code) FROM Matiere item")
    List<Matiere> findAllOptimized();
}
