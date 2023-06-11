package ma.sir.ocp.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.Etudiant;
import org.springframework.stereotype.Repository;
import ma.sir.ocp.bean.core.Etudiant;
import java.util.List;


@Repository
public interface EtudiantDao extends AbstractRepository<Etudiant,Long>  {
    Etudiant findByCodeMassar(String codeMassar);
    int deleteByCodeMassar(String codeMassar);


    @Query("SELECT NEW Etudiant(item.id,item.codeMassar) FROM Etudiant item")
    List<Etudiant> findAllOptimized();
}
