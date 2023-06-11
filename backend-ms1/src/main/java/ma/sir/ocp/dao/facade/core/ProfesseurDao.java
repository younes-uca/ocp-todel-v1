package ma.sir.ocp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.Professeur;
import org.springframework.stereotype.Repository;
import ma.sir.ocp.bean.core.Professeur;
import java.util.List;


@Repository
public interface ProfesseurDao extends AbstractRepository<Professeur,Long>  {
    Professeur findByCode(String code);
    int deleteByCode(String code);

    List<Professeur> findByDisciplineId(Long id);
    int deleteByDisciplineId(Long id);

    @Query("SELECT NEW Professeur(item.id,item.code) FROM Professeur item")
    List<Professeur> findAllOptimized();
}
