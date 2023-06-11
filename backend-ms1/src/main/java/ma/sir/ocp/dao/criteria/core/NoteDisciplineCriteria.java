package  ma.sir.ocp.dao.criteria.core;


import ma.sir.ocp.zynerator.criteria.BaseCriteria;
import java.util.List;

public class NoteDisciplineCriteria extends  BaseCriteria  {

    private String note;
    private String noteMin;
    private String noteMax;

    private ProfesseurCriteria professeur ;
    private List<ProfesseurCriteria> professeurs ;
    private ClasseRoomCriteria classeRoom ;
    private List<ClasseRoomCriteria> classeRooms ;
    private DisciplineCriteria discipline ;
    private List<DisciplineCriteria> disciplines ;
    private EtudiantCriteria etudiant ;
    private List<EtudiantCriteria> etudiants ;


    public NoteDisciplineCriteria(){}

    public String getNote(){
        return this.note;
    }
    public void setNote(String note){
        this.note = note;
    }   
    public String getNoteMin(){
        return this.noteMin;
    }
    public void setNoteMin(String noteMin){
        this.noteMin = noteMin;
    }
    public String getNoteMax(){
        return this.noteMax;
    }
    public void setNoteMax(String noteMax){
        this.noteMax = noteMax;
    }
      

    public ProfesseurCriteria getProfesseur(){
        return this.professeur;
    }

    public void setProfesseur(ProfesseurCriteria professeur){
        this.professeur = professeur;
    }
    public List<ProfesseurCriteria> getProfesseurs(){
        return this.professeurs;
    }

    public void setProfesseurs(List<ProfesseurCriteria> professeurs){
        this.professeurs = professeurs;
    }
    public ClasseRoomCriteria getClasseRoom(){
        return this.classeRoom;
    }

    public void setClasseRoom(ClasseRoomCriteria classeRoom){
        this.classeRoom = classeRoom;
    }
    public List<ClasseRoomCriteria> getClasseRooms(){
        return this.classeRooms;
    }

    public void setClasseRooms(List<ClasseRoomCriteria> classeRooms){
        this.classeRooms = classeRooms;
    }
    public DisciplineCriteria getDiscipline(){
        return this.discipline;
    }

    public void setDiscipline(DisciplineCriteria discipline){
        this.discipline = discipline;
    }
    public List<DisciplineCriteria> getDisciplines(){
        return this.disciplines;
    }

    public void setDisciplines(List<DisciplineCriteria> disciplines){
        this.disciplines = disciplines;
    }
    public EtudiantCriteria getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantCriteria etudiant){
        this.etudiant = etudiant;
    }
    public List<EtudiantCriteria> getEtudiants(){
        return this.etudiants;
    }

    public void setEtudiants(List<EtudiantCriteria> etudiants){
        this.etudiants = etudiants;
    }
}
