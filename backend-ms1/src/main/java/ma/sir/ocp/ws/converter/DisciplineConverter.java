package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.DisciplineHistory;
import ma.sir.ocp.bean.core.Discipline;
import ma.sir.ocp.ws.dto.DisciplineDto;

@Component
public class DisciplineConverter extends AbstractConverter<Discipline, DisciplineDto, DisciplineHistory> {


    public  DisciplineConverter(){
        super(Discipline.class, DisciplineDto.class, DisciplineHistory.class);
    }

    @Override
    public Discipline toItem(DisciplineDto dto) {
        if (dto == null) {
            return null;
        } else {
        Discipline item = new Discipline();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public DisciplineDto toDto(Discipline item) {
        if (item == null) {
            return null;
        } else {
            DisciplineDto dto = new DisciplineDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
