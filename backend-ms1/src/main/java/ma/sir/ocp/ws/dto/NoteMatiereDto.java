package  ma.sir.ocp.ws.dto;

import ma.sir.ocp.zynerator.audit.Log;
import ma.sir.ocp.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteMatiereDto  extends AuditBaseDto {

    private BigDecimal note  ;

    private ProfesseurDto professeur ;
    private ClasseRoomDto classeRoom ;
    private MatiereDto matiere ;
    private EtudiantDto etudiant ;



    public NoteMatiereDto(){
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
    public MatiereDto getMatiere(){
        return this.matiere;
    }

    public void setMatiere(MatiereDto matiere){
        this.matiere = matiere;
    }
    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }




}
