public class Main {
    public static void main(String[] args) {
        // Creiamo la principessa condivisa
        Principessa principessa = new Principessa("Aurora");

        // Creiamo i tre draghi passandole la stessa principessa
        D_SputaFuoco dragoFuoco = new D_SputaFuoco("Ignis", principessa);
        D_SputaGhiaccio dragoGhiaccio = new D_SputaGhiaccio("Glacius", principessa);
        D_LanciaRocce dragoRocce = new D_LanciaRocce("Petros", principessa);

        System.keyout = System.out;
        System.out.println("=== INIZIA LA CRONACA DELLA CACCIA ALLA PRINCIPESSA ===");

        // Avviamo i thread in contemporanea con .start()
        dragoFuoco.start();
        dragoGhiaccio.start();
        dragoRocce.start();
    }
}
