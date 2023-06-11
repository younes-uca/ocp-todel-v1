package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.ClasseRoomHistory;
import ma.sir.ocp.bean.core.ClasseRoom;
import ma.sir.ocp.ws.dto.ClasseRoomDto;

@Component
public class ClasseRoomConverter extends AbstractConverter<ClasseRoom, ClasseRoomDto, ClasseRoomHistory> {

    @Autowired
    private NiveauConverter niveauConverter ;
    private boolean niveau;

    public  ClasseRoomConverter(){
        super(ClasseRoom.class, ClasseRoomDto.class, ClasseRoomHistory.class);
    }

    @Override
    public ClasseRoom toItem(ClasseRoomDto dto) {
        if (dto == null) {
            return null;
        } else {
        ClasseRoom item = new ClasseRoom();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getAnneeScolaire()))
                item.setAnneeScolaire(dto.getAnneeScolaire());
            if(this.niveau && dto.getNiveau()!=null)
                item.setNiveau(niveauConverter.toItem(dto.getNiveau())) ;



        return item;
        }
    }

    @Override
    public ClasseRoomDto toDto(ClasseRoom item) {
        if (item == null) {
            return null;
        } else {
            ClasseRoomDto dto = new ClasseRoomDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getAnneeScolaire()))
                dto.setAnneeScolaire(item.getAnneeScolaire());
        if(this.niveau && item.getNiveau()!=null) {
            dto.setNiveau(niveauConverter.toDto(item.getNiveau())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.niveau = value;
    }


    public NiveauConverter getNiveauConverter(){
        return this.niveauConverter;
    }
    public void setNiveauConverter(NiveauConverter niveauConverter ){
        this.niveauConverter = niveauConverter;
    }
    public boolean  isNiveau(){
        return this.niveau;
    }
    public void  setNiveau(boolean niveau){
        this.niveau = niveau;
    }
}
