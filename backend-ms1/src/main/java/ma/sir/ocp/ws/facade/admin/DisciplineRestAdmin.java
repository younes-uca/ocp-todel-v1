package  ma.sir.ocp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.ocp.bean.core.Discipline;
import ma.sir.ocp.bean.history.DisciplineHistory;
import ma.sir.ocp.dao.criteria.core.DisciplineCriteria;
import ma.sir.ocp.dao.criteria.history.DisciplineHistoryCriteria;
import ma.sir.ocp.service.facade.admin.DisciplineAdminService;
import ma.sir.ocp.ws.converter.DisciplineConverter;
import ma.sir.ocp.ws.dto.DisciplineDto;
import ma.sir.ocp.zynerator.controller.AbstractController;
import ma.sir.ocp.zynerator.dto.AuditEntityDto;
import ma.sir.ocp.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.ocp.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.ocp.zynerator.dto.FileTempDto;

@Api("Manages discipline services")
@RestController
@RequestMapping("/api/admin/discipline/")
public class DisciplineRestAdmin  extends AbstractController<Discipline, DisciplineDto, DisciplineHistory, DisciplineCriteria, DisciplineHistoryCriteria, DisciplineAdminService, DisciplineConverter> {



    @ApiOperation("upload one discipline")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple disciplines")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all disciplines")
    @GetMapping("")
    public ResponseEntity<List<DisciplineDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all disciplines")
    @GetMapping("optimized")
    public ResponseEntity<List<DisciplineDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a discipline by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DisciplineDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  discipline")
    @PostMapping("")
    public ResponseEntity<DisciplineDto> save(@RequestBody DisciplineDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  discipline")
    @PutMapping("")
    public ResponseEntity<DisciplineDto> update(@RequestBody DisciplineDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of discipline")
    @PostMapping("multiple")
    public ResponseEntity<List<DisciplineDto>> delete(@RequestBody List<DisciplineDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified discipline")
    @DeleteMapping("")
    public ResponseEntity<DisciplineDto> delete(@RequestBody DisciplineDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified discipline")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple disciplines by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds disciplines by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DisciplineDto>> findByCriteria(@RequestBody DisciplineCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated disciplines by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DisciplineCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports disciplines by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DisciplineCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets discipline data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DisciplineCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets discipline history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets discipline paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DisciplineHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports discipline history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DisciplineHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets discipline history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DisciplineHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DisciplineRestAdmin (DisciplineAdminService service, DisciplineConverter converter) {
        super(service, converter);
    }


}