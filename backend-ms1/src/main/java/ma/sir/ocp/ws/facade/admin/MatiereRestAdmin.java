package  ma.sir.ocp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.ocp.bean.core.Matiere;
import ma.sir.ocp.bean.history.MatiereHistory;
import ma.sir.ocp.dao.criteria.core.MatiereCriteria;
import ma.sir.ocp.dao.criteria.history.MatiereHistoryCriteria;
import ma.sir.ocp.service.facade.admin.MatiereAdminService;
import ma.sir.ocp.ws.converter.MatiereConverter;
import ma.sir.ocp.ws.dto.MatiereDto;
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

@Api("Manages matiere services")
@RestController
@RequestMapping("/api/admin/matiere/")
public class MatiereRestAdmin  extends AbstractController<Matiere, MatiereDto, MatiereHistory, MatiereCriteria, MatiereHistoryCriteria, MatiereAdminService, MatiereConverter> {



    @ApiOperation("upload one matiere")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple matieres")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all matieres")
    @GetMapping("")
    public ResponseEntity<List<MatiereDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all matieres")
    @GetMapping("optimized")
    public ResponseEntity<List<MatiereDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a matiere by id")
    @GetMapping("id/{id}")
    public ResponseEntity<MatiereDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  matiere")
    @PostMapping("")
    public ResponseEntity<MatiereDto> save(@RequestBody MatiereDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  matiere")
    @PutMapping("")
    public ResponseEntity<MatiereDto> update(@RequestBody MatiereDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of matiere")
    @PostMapping("multiple")
    public ResponseEntity<List<MatiereDto>> delete(@RequestBody List<MatiereDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified matiere")
    @DeleteMapping("")
    public ResponseEntity<MatiereDto> delete(@RequestBody MatiereDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified matiere")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple matieres by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds matieres by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<MatiereDto>> findByCriteria(@RequestBody MatiereCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated matieres by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody MatiereCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports matieres by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody MatiereCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets matiere data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody MatiereCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets matiere history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets matiere paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody MatiereHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports matiere history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody MatiereHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets matiere history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody MatiereHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public MatiereRestAdmin (MatiereAdminService service, MatiereConverter converter) {
        super(service, converter);
    }


}