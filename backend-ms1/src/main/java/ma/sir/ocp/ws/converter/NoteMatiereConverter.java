package  ma.sir.ocp.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.ocp.zynerator.util.StringUtil;
import ma.sir.ocp.zynerator.converter.AbstractConverter;
import ma.sir.ocp.zynerator.util.DateUtil;
import ma.sir.ocp.bean.history.NoteMatiereHistory;
import ma.sir.ocp.bean.core.NoteMatiere;
import ma.sir.ocp.ws.dto.NoteMatiereDto;

@Component
public class NoteMatiereConverter extends AbstractConverter<NoteMatiere, NoteMatiereDto, NoteMatiereHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private MatiereConverter matiereConverter ;
    @Autowired
    private ClasseRoomConverter classeRoomConverter ;
    @Autowired
    private ProfesseurConverter professeurConverter ;
    private boolean professeur;
    private boolean classeRoom;
    private boolean matiere;
    private boolean etudiant;

    public  NoteMatiereConverter(){
        super(NoteMatiere.class, NoteMatiereDto.class, NoteMatiereHistory.class);
    }

    @Override
    public NoteMatiere toItem(NoteMatiereDto dto) {
        if (dto == null) {
            return null;
        } else {
        NoteMatiere item = new NoteMatiere();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNote()))
                item.setNote(dto.getNote());
            if(this.professeur && dto.getProfesseur()!=null)
                item.setProfesseur(professeurConverter.toItem(dto.getProfesseur())) ;

            if(this.classeRoom && dto.getClasseRoom()!=null)
                item.setClasseRoom(classeRoomConverter.toItem(dto.getClasseRoom())) ;

            if(this.matiere && dto.getMatiere()!=null)
                item.setMatiere(matiereConverter.toItem(dto.getMatiere())) ;

            if(this.etudiant && dto.getEtudiant()!=null)
                item.setEtudiant(etudiantConverter.toItem(dto.getEtudiant())) ;



        return item;
        }
    }

    @Override
    public NoteMatiereDto toDto(NoteMatiere item) {
        if (item == null) {
            return null;
        } else {
            NoteMatiereDto dto = new NoteMatiereDto();
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
        if(this.matiere && item.getMatiere()!=null) {
            dto.setMatiere(matiereConverter.toDto(item.getMatiere())) ;
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
        this.matiere = value;
        this.etudiant = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public MatiereConverter getMatiereConverter(){
        return this.matiereConverter;
    }
    public void setMatiereConverter(MatiereConverter matiereConverter ){
        this.matiereConverter = matiereConverter;
    }
    public ClasseRoomConverter getClasseRoomConverter(){
        return this.classeRoomConverter;
    }
    public void setClasseRoomConverter(ClasseRoomConverter classeRoomConverter ){
        this.classeRoomConverter = classeRoomConverter;
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
    public boolean  isMatiere(){
        return this.matiere;
    }
    public void  setMatiere(boolean matiere){
        this.matiere = matiere;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
