package  ma.sir.ocp.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.ocp.bean.core.ClasseRoom;
import ma.sir.ocp.bean.history.ClasseRoomHistory;
import ma.sir.ocp.dao.criteria.core.ClasseRoomCriteria;
import ma.sir.ocp.dao.criteria.history.ClasseRoomHistoryCriteria;
import ma.sir.ocp.service.facade.admin.ClasseRoomAdminService;
import ma.sir.ocp.ws.converter.ClasseRoomConverter;
import ma.sir.ocp.ws.dto.ClasseRoomDto;
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

@Api("Manages classeRoom services")
@RestController
@RequestMapping("/api/admin/classeRoom/")
public class ClasseRoomRestAdmin  extends AbstractController<ClasseRoom, ClasseRoomDto, ClasseRoomHistory, ClasseRoomCriteria, ClasseRoomHistoryCriteria, ClasseRoomAdminService, ClasseRoomConverter> {



    @ApiOperation("upload one classeRoom")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple classeRooms")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all classeRooms")
    @GetMapping("")
    public ResponseEntity<List<ClasseRoomDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all classeRooms")
    @GetMapping("optimized")
    public ResponseEntity<List<ClasseRoomDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a classeRoom by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ClasseRoomDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  classeRoom")
    @PostMapping("")
    public ResponseEntity<ClasseRoomDto> save(@RequestBody ClasseRoomDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  classeRoom")
    @PutMapping("")
    public ResponseEntity<ClasseRoomDto> update(@RequestBody ClasseRoomDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of classeRoom")
    @PostMapping("multiple")
    public ResponseEntity<List<ClasseRoomDto>> delete(@RequestBody List<ClasseRoomDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified classeRoom")
    @DeleteMapping("")
    public ResponseEntity<ClasseRoomDto> delete(@RequestBody ClasseRoomDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified classeRoom")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple classeRooms by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by niveau id")
    @GetMapping("niveau/id/{id}")
    public List<ClasseRoom> findByNiveauId(@PathVariable Long id){
        return service.findByNiveauId(id);
    }
    @ApiOperation("delete by niveau id")
    @DeleteMapping("niveau/id/{id}")
    public int deleteByNiveauId(@PathVariable Long id){
        return service.deleteByNiveauId(id);
    }
    @ApiOperation("Finds classeRooms by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ClasseRoomDto>> findByCriteria(@RequestBody ClasseRoomCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated classeRooms by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClasseRoomCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classeRooms by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ClasseRoomCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets classeRoom data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ClasseRoomCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets classeRoom history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets classeRoom paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClasseRoomHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classeRoom history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClasseRoomHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets classeRoom history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClasseRoomHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ClasseRoomRestAdmin (ClasseRoomAdminService service, ClasseRoomConverter converter) {
        super(service, converter);
    }


}