public class Principessa {
    private String nome;
    private Drago carceriere;
    private String stato; // "libera", "prigioniera", "liberata"

    public Principessa(String nome) {
        this.nome = nome;
        this.stato = "libera"; 
    }

    // Metodo sincronizzato per evitare che due draghi la catturino nello stesso istante
    public synchronized boolean tentaCattura(Drago drago) {
        if ("libera".equals(this.stato)) {
            this.stato = "prigioniera";
            this.carceriere = drago;
            return true;
        }
        return false;
    }

    // Getter e Setter
    public String getNome() { return nome; }
    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }
    public Drago getCarceriere() { return carceriere; }
}
