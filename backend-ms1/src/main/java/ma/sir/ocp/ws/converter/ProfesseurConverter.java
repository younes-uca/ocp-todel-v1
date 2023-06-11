package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.ProfesseurHistory;
import ma.sir.ocp.bean.core.Professeur;
import ma.sir.ocp.ws.dto.ProfesseurDto;

@Component
public class ProfesseurConverter extends AbstractConverter<Professeur, ProfesseurDto, ProfesseurHistory> {

    @Autowired
    private DisciplineConverter disciplineConverter ;
    private boolean discipline;

    public  ProfesseurConverter(){
        super(Professeur.class, ProfesseurDto.class, ProfesseurHistory.class);
    }

    @Override
    public Professeur toItem(ProfesseurDto dto) {
        if (dto == null) {
            return null;
        } else {
        Professeur item = new Professeur();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getPassword()))
                item.setPassword(dto.getPassword());
            if(this.discipline && dto.getDiscipline()!=null)
                item.setDiscipline(disciplineConverter.toItem(dto.getDiscipline())) ;



        return item;
        }
    }

    @Override
    public ProfesseurDto toDto(Professeur item) {
        if (item == null) {
            return null;
        } else {
            ProfesseurDto dto = new ProfesseurDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getPassword()))
                dto.setPassword(item.getPassword());
        if(this.discipline && item.getDiscipline()!=null) {
            dto.setDiscipline(disciplineConverter.toDto(item.getDiscipline())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.discipline = value;
    }


    public DisciplineConverter getDisciplineConverter(){
        return this.disciplineConverter;
    }
    public void setDisciplineConverter(DisciplineConverter disciplineConverter ){
        this.disciplineConverter = disciplineConverter;
    }
    public boolean  isDiscipline(){
        return this.discipline;
    }
    public void  setDiscipline(boolean discipline){
        this.discipline = discipline;
    }
}
