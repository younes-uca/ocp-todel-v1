package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.NoteDisciplineHistory;
import ma.sir.ocp.bean.core.NoteDiscipline;
import ma.sir.ocp.ws.dto.NoteDisciplineDto;

@Component
public class NoteDisciplineConverter extends AbstractConverter<NoteDiscipline, NoteDisciplineDto, NoteDisciplineHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private ClasseRoomConverter classeRoomConverter ;
    @Autowired
    private DisciplineConverter disciplineConverter ;
    @Autowired
    private ProfesseurConverter professeurConverter ;
    private boolean professeur;
    private boolean classeRoom;
    private boolean discipline;
    private boolean etudiant;

    public  NoteDisciplineConverter(){
        super(NoteDiscipline.class, NoteDisciplineDto.class, NoteDisciplineHistory.class);
    }

    @Override
    public NoteDiscipline toItem(NoteDisciplineDto dto) {
        if (dto == null) {
            return null;
        } else {
        NoteDiscipline item = new NoteDiscipline();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNote()))
                item.setNote(dto.getNote());
            if(this.professeur && dto.getProfesseur()!=null)
                item.setProfesseur(professeurConverter.toItem(dto.getProfesseur())) ;

            if(this.classeRoom && dto.getClasseRoom()!=null)
                item.setClasseRoom(classeRoomConverter.toItem(dto.getClasseRoom())) ;

            if(this.discipline && dto.getDiscipline()!=null)
                item.setDiscipline(disciplineConverter.toItem(dto.getDiscipline())) ;

            if(this.etudiant && dto.getEtudiant()!=null)
                item.setEtudiant(etudiantConverter.toItem(dto.getEtudiant())) ;



        return item;
        }
    }

    @Override
    public NoteDisciplineDto toDto(NoteDiscipline item) {
        if (item == null) {
            return null;
        } else {
            NoteDisciplineDto dto = new NoteDisciplineDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNote()))
                dto.setNote(item.getNote());
        if(this.professeur && item.getProfesseur()!=null) {
            dto.setProfesseur(professeurConverter.toDto(item.getProfesseur())) ;
        }
        if(this.classeRoom && item.getClasseRoom()!=null) {
            dto.setClasseRoom(classeRoomConverter.toDto(item.getClasseRoom())) ;
        }
        if(this.discipline && item.getDiscipline()!=null) {
            dto.setDiscipline(disciplineConverter.toDto(item.getDiscipline())) ;
        }
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.professeur = value;
        this.classeRoom = value;
        this.discipline = value;
        this.etudiant = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public ClasseRoomConverter getClasseRoomConverter(){
        return this.classeRoomConverter;
    }
    public void setClasseRoomConverter(ClasseRoomConverter classeRoomConverter ){
        this.classeRoomConverter = classeRoomConverter;
    }
    public DisciplineConverter getDisciplineConverter(){
        return this.disciplineConverter;
    }
    public void setDisciplineConverter(DisciplineConverter disciplineConverter ){
        this.disciplineConverter = disciplineConverter;
    }
    public ProfesseurConverter getProfesseurConverter(){
        return this.professeurConverter;
    }
    public void setProfesseurConverter(ProfesseurConverter professeurConverter ){
        this.professeurConverter = professeurConverter;
    }
    public boolean  isProfesseur(){
        return this.professeur;
    }
    public void  setProfesseur(boolean professeur){
        this.professeur = professeur;
    }
    public boolean  isClasseRoom(){
        return this.classeRoom;
    }
    public void  setClasseRoom(boolean classeRoom){
        this.classeRoom = classeRoom;
    }
    public boolean  isDiscipline(){
        return this.discipline;
    }
    public void  setDiscipline(boolean discipline){
        this.discipline = discipline;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
