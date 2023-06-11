package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.NiveauHistory;
import ma.sir.ocp.bean.core.Niveau;
import ma.sir.ocp.ws.dto.NiveauDto;

@Component
public class NiveauConverter extends AbstractConverter<Niveau, NiveauDto, NiveauHistory> {


    public  NiveauConverter(){
        super(Niveau.class, NiveauDto.class, NiveauHistory.class);
    }

    @Override
    public Niveau toItem(NiveauDto dto) {
        if (dto == null) {
            return null;
        } else {
        Niveau item = new Niveau();
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
    public NiveauDto toDto(Niveau item) {
        if (item == null) {
            return null;
        } else {
            NiveauDto dto = new NiveauDto();
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
