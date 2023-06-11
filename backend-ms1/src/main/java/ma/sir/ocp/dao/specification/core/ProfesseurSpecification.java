package  ma.sir.ocp.dao.specification.core;

import ma.sir.ocp.zynerator.specification.AbstractSpecification;
import ma.sir.ocp.dao.criteria.core.ProfesseurCriteria;
import ma.sir.ocp.bean.core.Professeur;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProfesseurSpecification extends  AbstractSpecification<ProfesseurCriteria, Professeur>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicateFk("discipline","id", criteria.getDiscipline()==null?null:criteria.getDiscipline().getId());
        addPredicateFk("discipline","id", criteria.getDisciplines());
        addPredicateFk("discipline","code", criteria.getDiscipline()==null?null:criteria.getDiscipline().getCode());
    }

    public ProfesseurSpecification(ProfesseurCriteria criteria) {
        super(criteria);
    }

    public ProfesseurSpecification(ProfesseurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
