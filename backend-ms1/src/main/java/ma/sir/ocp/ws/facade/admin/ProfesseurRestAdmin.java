package  ma.sir.ocp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.ocp.bean.core.Professeur;
import ma.sir.ocp.bean.history.ProfesseurHistory;
import ma.sir.ocp.dao.criteria.core.ProfesseurCriteria;
import ma.sir.ocp.dao.criteria.history.ProfesseurHistoryCriteria;
import ma.sir.ocp.service.facade.admin.ProfesseurAdminService;
import ma.sir.ocp.ws.converter.ProfesseurConverter;
import ma.sir.ocp.ws.dto.ProfesseurDto;
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

@Api("Manages professeur services")
@RestController
@RequestMapping("/api/admin/professeur/")
public class ProfesseurRestAdmin  extends AbstractController<Professeur, ProfesseurDto, ProfesseurHistory, ProfesseurCriteria, ProfesseurHistoryCriteria, ProfesseurAdminService, ProfesseurConverter> {



    @ApiOperation("upload one professeur")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple professeurs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all professeurs")
    @GetMapping("")
    public ResponseEntity<List<ProfesseurDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all professeurs")
    @GetMapping("optimized")
    public ResponseEntity<List<ProfesseurDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a professeur by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProfesseurDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  professeur")
    @PostMapping("")
    public ResponseEntity<ProfesseurDto> save(@RequestBody ProfesseurDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  professeur")
    @PutMapping("")
    public ResponseEntity<ProfesseurDto> update(@RequestBody ProfesseurDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of professeur")
    @PostMapping("multiple")
    public ResponseEntity<List<ProfesseurDto>> delete(@RequestBody List<ProfesseurDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified professeur")
    @DeleteMapping("")
    public ResponseEntity<ProfesseurDto> delete(@RequestBody ProfesseurDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified professeur")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple professeurs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by discipline id")
    @GetMapping("discipline/id/{id}")
    public List<Professeur> findByDisciplineId(@PathVariable Long id){
        return service.findByDisciplineId(id);
    }
    @ApiOperation("delete by discipline id")
    @DeleteMapping("discipline/id/{id}")
    public int deleteByDisciplineId(@PathVariable Long id){
        return service.deleteByDisciplineId(id);
    }
    @ApiOperation("Finds professeurs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ProfesseurDto>> findByCriteria(@RequestBody ProfesseurCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated professeurs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProfesseurCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports professeurs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProfesseurCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets professeur data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProfesseurCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets professeur history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets professeur paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProfesseurHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports professeur history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProfesseurHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets professeur history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProfesseurHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ProfesseurRestAdmin (ProfesseurAdminService service, ProfesseurConverter converter) {
        super(service, converter);
    }


}