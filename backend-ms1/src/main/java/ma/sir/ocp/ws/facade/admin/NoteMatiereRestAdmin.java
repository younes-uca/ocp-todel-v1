package  ma.sir.ocp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.ocp.bean.core.NoteMatiere;
import ma.sir.ocp.bean.history.NoteMatiereHistory;
import ma.sir.ocp.dao.criteria.core.NoteMatiereCriteria;
import ma.sir.ocp.dao.criteria.history.NoteMatiereHistoryCriteria;
import ma.sir.ocp.service.facade.admin.NoteMatiereAdminService;
import ma.sir.ocp.ws.converter.NoteMatiereConverter;
import ma.sir.ocp.ws.dto.NoteMatiereDto;
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

@Api("Manages noteMatiere services")
@RestController
@RequestMapping("/api/admin/noteMatiere/")
public class NoteMatiereRestAdmin  extends AbstractController<NoteMatiere, NoteMatiereDto, NoteMatiereHistory, NoteMatiereCriteria, NoteMatiereHistoryCriteria, NoteMatiereAdminService, NoteMatiereConverter> {



    @ApiOperation("upload one noteMatiere")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple noteMatieres")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all noteMatieres")
    @GetMapping("")
    public ResponseEntity<List<NoteMatiereDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a noteMatiere by id")
    @GetMapping("id/{id}")
    public ResponseEntity<NoteMatiereDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  noteMatiere")
    @PostMapping("")
    public ResponseEntity<NoteMatiereDto> save(@RequestBody NoteMatiereDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  noteMatiere")
    @PutMapping("")
    public ResponseEntity<NoteMatiereDto> update(@RequestBody NoteMatiereDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of noteMatiere")
    @PostMapping("multiple")
    public ResponseEntity<List<NoteMatiereDto>> delete(@RequestBody List<NoteMatiereDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified noteMatiere")
    @DeleteMapping("")
    public ResponseEntity<NoteMatiereDto> delete(@RequestBody NoteMatiereDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified noteMatiere")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple noteMatieres by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by professeur id")
    @GetMapping("professeur/id/{id}")
    public List<NoteMatiere> findByProfesseurId(@PathVariable Long id){
        return service.findByProfesseurId(id);
    }
    @ApiOperation("delete by professeur id")
    @DeleteMapping("professeur/id/{id}")
    public int deleteByProfesseurId(@PathVariable Long id){
        return service.deleteByProfesseurId(id);
    }
    @ApiOperation("find by classeRoom id")
    @GetMapping("classeRoom/id/{id}")
    public List<NoteMatiere> findByClasseRoomId(@PathVariable Long id){
        return service.findByClasseRoomId(id);
    }
    @ApiOperation("delete by classeRoom id")
    @DeleteMapping("classeRoom/id/{id}")
    public int deleteByClasseRoomId(@PathVariable Long id){
        return service.deleteByClasseRoomId(id);
    }
    @ApiOperation("find by matiere id")
    @GetMapping("matiere/id/{id}")
    public List<NoteMatiere> findByMatiereId(@PathVariable Long id){
        return service.findByMatiereId(id);
    }
    @ApiOperation("delete by matiere id")
    @DeleteMapping("matiere/id/{id}")
    public int deleteByMatiereId(@PathVariable Long id){
        return service.deleteByMatiereId(id);
    }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<NoteMatiere> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds noteMatieres by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<NoteMatiereDto>> findByCriteria(@RequestBody NoteMatiereCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated noteMatieres by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody NoteMatiereCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports noteMatieres by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody NoteMatiereCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets noteMatiere data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody NoteMatiereCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets noteMatiere history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets noteMatiere paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody NoteMatiereHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports noteMatiere history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody NoteMatiereHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets noteMatiere history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody NoteMatiereHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public NoteMatiereRestAdmin (NoteMatiereAdminService service, NoteMatiereConverter converter) {
        super(service, converter);
    }


}