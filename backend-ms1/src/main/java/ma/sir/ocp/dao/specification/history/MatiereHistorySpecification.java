package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.MatiereHistoryCriteria;
import ma.sir.ocp.bean.history.MatiereHistory;


public class MatiereHistorySpecification extends AbstractHistorySpecification<MatiereHistoryCriteria, MatiereHistory> {

    public MatiereHistorySpecification(MatiereHistoryCriteria criteria) {
        super(criteria);
    }

    public MatiereHistorySpecification(MatiereHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
