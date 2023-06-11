package  ma.sir.ocp.dao.specification.core;

import ma.sir.ocp.zynerator.specification.AbstractSpecification;
import ma.sir.ocp.dao.criteria.core.NoteMatiereCriteria;
import ma.sir.ocp.bean.core.NoteMatiere;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class NoteMatiereSpecification extends  AbstractSpecification<NoteMatiereCriteria, NoteMatiere>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("note", criteria.getNote(), criteria.getNoteMin(), criteria.getNoteMax());
        addPredicateFk("professeur","id", criteria.getProfesseur()==null?null:criteria.getProfesseur().getId());
        addPredicateFk("professeur","id", criteria.getProfesseurs());
        addPredicateFk("professeur","code", criteria.getProfesseur()==null?null:criteria.getProfesseur().getCode());
        addPredicateFk("classeRoom","id", criteria.getClasseRoom()==null?null:criteria.getClasseRoom().getId());
        addPredicateFk("classeRoom","id", criteria.getClasseRooms());
        addPredicateFk("classeRoom","code", criteria.getClasseRoom()==null?null:criteria.getClasseRoom().getCode());
        addPredicateFk("matiere","id", criteria.getMatiere()==null?null:criteria.getMatiere().getId());
        addPredicateFk("matiere","id", criteria.getMatieres());
        addPredicateFk("matiere","code", criteria.getMatiere()==null?null:criteria.getMatiere().getCode());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","codeMassar", criteria.getEtudiant()==null?null:criteria.getEtudiant().getCodeMassar());
    }

    public NoteMatiereSpecification(NoteMatiereCriteria criteria) {
        super(criteria);
    }

    public NoteMatiereSpecification(NoteMatiereCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
