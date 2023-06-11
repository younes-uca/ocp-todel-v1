package ma.sir.ocp.zynerator.service;

import ma.sir.ocp.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.ocp.zynerator.criteria.BaseCriteria;
import ma.sir.ocp.zynerator.history.HistBusinessObject;
import ma.sir.ocp.zynerator.history.HistCriteria;
import ma.sir.ocp.zynerator.repository.AbstractHistoryRepository;
import ma.sir.ocp.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}