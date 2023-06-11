package  ma.sir.ocp.dao.specification.core;

import ma.sir.ocp.zynerator.specification.AbstractSpecification;
import ma.sir.ocp.dao.criteria.core.DisciplineCriteria;
import ma.sir.ocp.bean.core.Discipline;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DisciplineSpecification extends  AbstractSpecification<DisciplineCriteria, Discipline>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public DisciplineSpecification(DisciplineCriteria criteria) {
        super(criteria);
    }

    public DisciplineSpecification(DisciplineCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
