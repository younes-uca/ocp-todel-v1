package  ma.sir.ocp.dao.specification.core;

import ma.sir.ocp.zynerator.specification.AbstractSpecification;
import ma.sir.ocp.dao.criteria.core.MatiereCriteria;
import ma.sir.ocp.bean.core.Matiere;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class MatiereSpecification extends  AbstractSpecification<MatiereCriteria, Matiere>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public MatiereSpecification(MatiereCriteria criteria) {
        super(criteria);
    }

    public MatiereSpecification(MatiereCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
