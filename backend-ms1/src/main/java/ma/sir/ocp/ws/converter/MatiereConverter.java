package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.MatiereHistory;
import ma.sir.ocp.bean.core.Matiere;
import ma.sir.ocp.ws.dto.MatiereDto;

@Component
public class MatiereConverter extends AbstractConverter<Matiere, MatiereDto, MatiereHistory> {


    public  MatiereConverter(){
        super(Matiere.class, MatiereDto.class, MatiereHistory.class);
    }

    @Override
    public Matiere toItem(MatiereDto dto) {
        if (dto == null) {
            return null;
        } else {
        Matiere item = new Matiere();
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
    public MatiereDto toDto(Matiere item) {
        if (item == null) {
            return null;
        } else {
            MatiereDto dto = new MatiereDto();
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
