package  ma.sir.ocp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.ocp.bean.core.NoteDiscipline;
import ma.sir.ocp.bean.history.NoteDisciplineHistory;
import ma.sir.ocp.dao.criteria.core.NoteDisciplineCriteria;
import ma.sir.ocp.dao.criteria.history.NoteDisciplineHistoryCriteria;
import ma.sir.ocp.service.facade.admin.NoteDisciplineAdminService;
import ma.sir.ocp.ws.converter.NoteDisciplineConverter;
import ma.sir.ocp.ws.dto.NoteDisciplineDto;
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

@Api("Manages noteDiscipline services")
@RestController
@RequestMapping("/api/admin/noteDiscipline/")
public class NoteDisciplineRestAdmin  extends AbstractController<NoteDiscipline, NoteDisciplineDto, NoteDisciplineHistory, NoteDisciplineCriteria, NoteDisciplineHistoryCriteria, NoteDisciplineAdminService, NoteDisciplineConverter> {



    @ApiOperation("upload one noteDiscipline")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple noteDisciplines")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all noteDisciplines")
    @GetMapping("")
    public ResponseEntity<List<NoteDisciplineDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a noteDiscipline by id")
    @GetMapping("id/{id}")
    public ResponseEntity<NoteDisciplineDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  noteDiscipline")
    @PostMapping("")
    public ResponseEntity<NoteDisciplineDto> save(@RequestBody NoteDisciplineDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  noteDiscipline")
    @PutMapping("")
    public ResponseEntity<NoteDisciplineDto> update(@RequestBody NoteDisciplineDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of noteDiscipline")
    @PostMapping("multiple")
    public ResponseEntity<List<NoteDisciplineDto>> delete(@RequestBody List<NoteDisciplineDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified noteDiscipline")
    @DeleteMapping("")
    public ResponseEntity<NoteDisciplineDto> delete(@RequestBody NoteDisciplineDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified noteDiscipline")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple noteDisciplines by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by professeur id")
    @GetMapping("professeur/id/{id}")
    public List<NoteDiscipline> findByProfesseurId(@PathVariable Long id){
        return service.findByProfesseurId(id);
    }
    @ApiOperation("delete by professeur id")
    @DeleteMapping("professeur/id/{id}")
    public int deleteByProfesseurId(@PathVariable Long id){
        return service.deleteByProfesseurId(id);
    }
    @ApiOperation("find by classeRoom id")
    @GetMapping("classeRoom/id/{id}")
    public List<NoteDiscipline> findByClasseRoomId(@PathVariable Long id){
        return service.findByClasseRoomId(id);
    }
    @ApiOperation("delete by classeRoom id")
    @DeleteMapping("classeRoom/id/{id}")
    public int deleteByClasseRoomId(@PathVariable Long id){
        return service.deleteByClasseRoomId(id);
    }
    @ApiOperation("find by discipline id")
    @GetMapping("discipline/id/{id}")
    public List<NoteDiscipline> findByDisciplineId(@PathVariable Long id){
        return service.findByDisciplineId(id);
    }
    @ApiOperation("delete by discipline id")
    @DeleteMapping("discipline/id/{id}")
    public int deleteByDisciplineId(@PathVariable Long id){
        return service.deleteByDisciplineId(id);
    }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<NoteDiscipline> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds noteDisciplines by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<NoteDisciplineDto>> findByCriteria(@RequestBody NoteDisciplineCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated noteDisciplines by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody NoteDisciplineCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports noteDisciplines by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody NoteDisciplineCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets noteDiscipline data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody NoteDisciplineCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets noteDiscipline history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets noteDiscipline paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody NoteDisciplineHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports noteDiscipline history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody NoteDisciplineHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets noteDiscipline history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody NoteDisciplineHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public NoteDisciplineRestAdmin (NoteDisciplineAdminService service, NoteDisciplineConverter converter) {
        super(service, converter);
    }


}