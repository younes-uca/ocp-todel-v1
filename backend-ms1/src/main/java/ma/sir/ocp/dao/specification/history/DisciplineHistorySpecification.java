package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.DisciplineHistoryCriteria;
import ma.sir.ocp.bean.history.DisciplineHistory;


public class DisciplineHistorySpecification extends AbstractHistorySpecification<DisciplineHistoryCriteria, DisciplineHistory> {

    public DisciplineHistorySpecification(DisciplineHistoryCriteria criteria) {
        super(criteria);
    }

    public DisciplineHistorySpecification(DisciplineHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
