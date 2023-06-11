package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.NoteMatiereHistoryCriteria;
import ma.sir.ocp.bean.history.NoteMatiereHistory;


public class NoteMatiereHistorySpecification extends AbstractHistorySpecification<NoteMatiereHistoryCriteria, NoteMatiereHistory> {

    public NoteMatiereHistorySpecification(NoteMatiereHistoryCriteria criteria) {
        super(criteria);
    }

    public NoteMatiereHistorySpecification(NoteMatiereHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
