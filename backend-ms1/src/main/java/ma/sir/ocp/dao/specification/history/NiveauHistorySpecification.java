package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.NiveauHistoryCriteria;
import ma.sir.ocp.bean.history.NiveauHistory;


public class NiveauHistorySpecification extends AbstractHistorySpecification<NiveauHistoryCriteria, NiveauHistory> {

    public NiveauHistorySpecification(NiveauHistoryCriteria criteria) {
        super(criteria);
    }

    public NiveauHistorySpecification(NiveauHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
