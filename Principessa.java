public class Principessa {
    private int idPrincipessa;
    private String nome;
    private Drago dragoImprigionato; // Associazione 0..1

    public Principessa(int idPrincipessa, String nome) {
        this.idPrincipessa = idPrincipessa;
        this.nome = nome;
    }

    public int getIdPrincipessa() {
        return idPrincipessa;
    }

    public String getNome() {
        return nome;
    }

    public Drago getDragoImprigionato() {
        return dragoImprigionato;
    }

    public void setDragoImprigionato(Drago dragoImprigionato) {
        this.dragoImprigionato = dragoImprigionato;
    }
}
