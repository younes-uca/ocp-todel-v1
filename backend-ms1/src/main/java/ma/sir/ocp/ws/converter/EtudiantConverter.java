package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.EtudiantHistory;
import ma.sir.ocp.bean.core.Etudiant;
import ma.sir.ocp.ws.dto.EtudiantDto;

@Component
public class EtudiantConverter extends AbstractConverter<Etudiant, EtudiantDto, EtudiantHistory> {


    public  EtudiantConverter(){
        super(Etudiant.class, EtudiantDto.class, EtudiantHistory.class);
    }

    @Override
    public Etudiant toItem(EtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        Etudiant item = new Etudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getAnneeDinscription()))
                item.setAnneeDinscription(dto.getAnneeDinscription());
            if(StringUtil.isNotEmpty(dto.getCodeMassar()))
                item.setCodeMassar(dto.getCodeMassar());
            if(StringUtil.isNotEmpty(dto.getPassword()))
                item.setPassword(dto.getPassword());


        return item;
        }
    }

    @Override
    public EtudiantDto toDto(Etudiant item) {
        if (item == null) {
            return null;
        } else {
            EtudiantDto dto = new EtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getAnneeDinscription()))
                dto.setAnneeDinscription(item.getAnneeDinscription());
            if(StringUtil.isNotEmpty(item.getCodeMassar()))
                dto.setCodeMassar(item.getCodeMassar());
            if(StringUtil.isNotEmpty(item.getPassword()))
                dto.setPassword(item.getPassword());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
