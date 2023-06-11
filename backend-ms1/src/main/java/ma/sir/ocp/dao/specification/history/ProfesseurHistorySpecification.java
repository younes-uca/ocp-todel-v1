package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.ProfesseurHistoryCriteria;
import ma.sir.ocp.bean.history.ProfesseurHistory;


public class ProfesseurHistorySpecification extends AbstractHistorySpecification<ProfesseurHistoryCriteria, ProfesseurHistory> {

    public ProfesseurHistorySpecification(ProfesseurHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfesseurHistorySpecification(ProfesseurHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
