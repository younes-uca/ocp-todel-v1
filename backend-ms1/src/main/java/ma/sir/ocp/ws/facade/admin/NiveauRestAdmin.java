package  ma.sir.ocp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.ocp.bean.core.Niveau;
import ma.sir.ocp.bean.history.NiveauHistory;
import ma.sir.ocp.dao.criteria.core.NiveauCriteria;
import ma.sir.ocp.dao.criteria.history.NiveauHistoryCriteria;
import ma.sir.ocp.service.facade.admin.NiveauAdminService;
import ma.sir.ocp.ws.converter.NiveauConverter;
import ma.sir.ocp.ws.dto.NiveauDto;
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

@Api("Manages niveau services")
@RestController
@RequestMapping("/api/admin/niveau/")
public class NiveauRestAdmin  extends AbstractController<Niveau, NiveauDto, NiveauHistory, NiveauCriteria, NiveauHistoryCriteria, NiveauAdminService, NiveauConverter> {



    @ApiOperation("upload one niveau")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple niveaus")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all niveaus")
    @GetMapping("")
    public ResponseEntity<List<NiveauDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all niveaus")
    @GetMapping("optimized")
    public ResponseEntity<List<NiveauDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a niveau by id")
    @GetMapping("id/{id}")
    public ResponseEntity<NiveauDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  niveau")
    @PostMapping("")
    public ResponseEntity<NiveauDto> save(@RequestBody NiveauDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  niveau")
    @PutMapping("")
    public ResponseEntity<NiveauDto> update(@RequestBody NiveauDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of niveau")
    @PostMapping("multiple")
    public ResponseEntity<List<NiveauDto>> delete(@RequestBody List<NiveauDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified niveau")
    @DeleteMapping("")
    public ResponseEntity<NiveauDto> delete(@RequestBody NiveauDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified niveau")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple niveaus by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds niveaus by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<NiveauDto>> findByCriteria(@RequestBody NiveauCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated niveaus by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody NiveauCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports niveaus by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody NiveauCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets niveau data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody NiveauCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets niveau history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets niveau paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody NiveauHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports niveau history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody NiveauHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets niveau history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody NiveauHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public NiveauRestAdmin (NiveauAdminService service, NiveauConverter converter) {
        super(service, converter);
    }


}