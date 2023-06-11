package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.EtudiantHistoryCriteria;
import ma.sir.ocp.bean.history.EtudiantHistory;


public class EtudiantHistorySpecification extends AbstractHistorySpecification<EtudiantHistoryCriteria, EtudiantHistory> {

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
