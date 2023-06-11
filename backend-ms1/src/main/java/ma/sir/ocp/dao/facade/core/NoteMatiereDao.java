package ma.sir.ocp.dao.facade.core;

import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.NoteMatiere;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface NoteMatiereDao extends AbstractRepository<NoteMatiere,Long>  {

    List<NoteMatiere> findByProfesseurId(Long id);
    int deleteByProfesseurId(Long id);
    List<NoteMatiere> findByClasseRoomId(Long id);
    int deleteByClasseRoomId(Long id);
    List<NoteMatiere> findByMatiereId(Long id);
    int deleteByMatiereId(Long id);
    List<NoteMatiere> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
