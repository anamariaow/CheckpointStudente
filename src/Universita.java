public class Universita {
    private Studente[] studenti;

    public Universita(Studente[] studenti) {
        this.studenti = studenti;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }
    public static void etaMinima(Studente[] studenti) {
        Studente studentePiuGiovane = studenti[0];
        for(Studente studente : studenti) {
            if(studente.getEta() < studentePiuGiovane.getEta()) {
                studentePiuGiovane = studente;
            }
        }
        System.out.println("Studente più giovane: " + studentePiuGiovane);
    }
}
