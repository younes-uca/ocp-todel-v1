package  ma.sir.ocp.dao.specification.core;

import ma.sir.ocp.zynerator.specification.AbstractSpecification;
import ma.sir.ocp.dao.criteria.core.ClasseRoomCriteria;
import ma.sir.ocp.bean.core.ClasseRoom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClasseRoomSpecification extends  AbstractSpecification<ClasseRoomCriteria, ClasseRoom>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("anneeScolaire", criteria.getAnneeScolaire(),criteria.getAnneeScolaireLike());
        addPredicateFk("niveau","id", criteria.getNiveau()==null?null:criteria.getNiveau().getId());
        addPredicateFk("niveau","id", criteria.getNiveaus());
        addPredicateFk("niveau","code", criteria.getNiveau()==null?null:criteria.getNiveau().getCode());
    }

    public ClasseRoomSpecification(ClasseRoomCriteria criteria) {
        super(criteria);
    }

    public ClasseRoomSpecification(ClasseRoomCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
