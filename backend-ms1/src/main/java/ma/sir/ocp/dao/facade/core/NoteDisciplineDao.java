package ma.sir.ocp.dao.facade.core;

import ma.sir.ocp.zynerator.repository.AbstractRepository;
import ma.sir.ocp.bean.core.NoteDiscipline;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface NoteDisciplineDao extends AbstractRepository<NoteDiscipline,Long>  {

    List<NoteDiscipline> findByProfesseurId(Long id);
    int deleteByProfesseurId(Long id);
    List<NoteDiscipline> findByClasseRoomId(Long id);
    int deleteByClasseRoomId(Long id);
    List<NoteDiscipline> findByDisciplineId(Long id);
    int deleteByDisciplineId(Long id);
    List<NoteDiscipline> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
