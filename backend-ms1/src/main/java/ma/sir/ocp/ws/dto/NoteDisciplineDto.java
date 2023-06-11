package  ma.sir.ocp.ws.dto;

import ma.sir.ocp.zynerator.audit.Log;
import ma.sir.ocp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteDisciplineDto  extends AuditBaseDto {

    private BigDecimal note  ;

    private ProfesseurDto professeur ;
    private ClasseRoomDto classeRoom ;
    private DisciplineDto discipline ;
    private EtudiantDto etudiant ;



    public NoteDisciplineDto(){
        super();
    }



    @Log
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }


    public ProfesseurDto getProfesseur(){
        return this.professeur;
    }

    public void setProfesseur(ProfesseurDto professeur){
        this.professeur = professeur;
    }
    public ClasseRoomDto getClasseRoom(){
        return this.classeRoom;
    }

    public void setClasseRoom(ClasseRoomDto classeRoom){
        this.classeRoom = classeRoom;
    }
    public DisciplineDto getDiscipline(){
        return this.discipline;
    }

    public void setDiscipline(DisciplineDto discipline){
        this.discipline = discipline;
    }
    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }




}
