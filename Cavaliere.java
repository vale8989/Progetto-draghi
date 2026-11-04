import java.util.ArrayList;
import java.util.List;

public class Cavaliere {
    private int idCavaliere;
    private String nome;
    private String livello;
    private String armaPrincipale;
    
    private Cavaliere maestro; // 0..1 maestro
    private List<Cavaliere> guide; // 0..* guide / subordinati
    private List<Drago> draghiUccisi; // 0..* draghi cacciati e uccisi

    public Cavaliere(int idCavaliere, String nome, String livello, String armaPrincipale) {
        this.idCavaliere = idCavaliere;
        this.nome = nome;
        this.livello = livello;
        this.armaPrincipale = armaPrincipale;
        this.guide = new ArrayList<>();
        this.draghiUccisi = new ArrayList<>();
    }

    public void aggiungiDragoUcciso(Drago drago) {
        this.draghiUccisi.add(drago);
    }

    public void impostaMaestro(Cavaliere maestro) {
        this.maestro = maestro;
        if (maestro != null) {
            maestro.getGuide().add(this);
        }
    }

    // Getter e Setter
    public int getIdCavaliere() { return idCavaliere; }
    public String getNome() { return nome; }
    public Cavaliere getMaestro() { return maestro; }
    public List<Cavaliere> getGuide() { return guide; }
    public List<Drago> getDraghiUccisi() { return draghiUccisi; }
}
