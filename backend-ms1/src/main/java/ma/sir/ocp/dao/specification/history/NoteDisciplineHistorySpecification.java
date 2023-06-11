package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.NoteDisciplineHistoryCriteria;
import ma.sir.ocp.bean.history.NoteDisciplineHistory;


public class NoteDisciplineHistorySpecification extends AbstractHistorySpecification<NoteDisciplineHistoryCriteria, NoteDisciplineHistory> {

    public NoteDisciplineHistorySpecification(NoteDisciplineHistoryCriteria criteria) {
        super(criteria);
    }

    public NoteDisciplineHistorySpecification(NoteDisciplineHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
