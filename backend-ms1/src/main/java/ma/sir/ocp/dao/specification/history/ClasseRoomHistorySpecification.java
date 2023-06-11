package  ma.sir.ocp.dao.specification.history;

import ma.sir.ocp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.ocp.dao.criteria.history.ClasseRoomHistoryCriteria;
import ma.sir.ocp.bean.history.ClasseRoomHistory;


public class ClasseRoomHistorySpecification extends AbstractHistorySpecification<ClasseRoomHistoryCriteria, ClasseRoomHistory> {

    public ClasseRoomHistorySpecification(ClasseRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public ClasseRoomHistorySpecification(ClasseRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
