public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Nome1", "Cognome1", 20);
        Studente studente2 = new Studente("Nome2", "Cognome2", 23);

        Studente[] arrayStudenti = {studente1, studente2};

        Universita universita = new Universita(arrayStudenti);
        System.out.println();
        Universita.etaMinima(arrayStudenti);

        System.out.println();

        int[] numeri = {2, 3, 5, 6, 8, 9};
        String[] stringhe = {"ciao@", "hola!", "buongiorno"};
        mediaArray(numeri);
        caratteriSpeciali(stringhe);
        moltiplicazione(numeri);

    }
    public static void mediaArray(int[] numeri) {
        int somma = 0;
        int media = 0;
        for(int numero : numeri) {
            somma += numero;
        }
        media = somma / numeri.length;
        System.out.println("Media numeri: " + media);
        //stampi tutti i numeri che sono maggiori della media calcolata
        for( int numero : numeri) {
            if(numero > media) {
                System.out.println(" Numero maggiore della media: " + numero);
            }
        }
    }
    public static void caratteriSpeciali(String[] stringhe) {
        for(String stringa : stringhe) {
            if(stringa == "@" || stringa == "!" || stringa == "#") {
                System.out.println("Stringhe con caratteri speciali" + stringa);
            }
        }
    }
    public static void moltiplicazione(int[] numeri) {
        int multi = numeri[0];
        for(int numero : numeri) {
            if(numero % 2 == 0) {
                multi *= numero;
            }
        }
        System.out.println("Moltiplicazione numeri pari: " + multi);
    }
    public static void moltiplicazionePosizioniPari(int[] numeri) {
        int risultatoMoltiplicazione = 1;
        //controlla se l'array è valido e se ha almeno due elementi
        if(numeri != null && numeri.length >= 2) {
            // Itera attraverso gli elementi nelle posizioni pari dell'array
            for( int i = 0; i < numeri.length; i += 2) {
                risultatoMoltiplicazione += numeri[i];
            }
            System.out.println("La moltiplicazione degli elementi nelle posizioni pari dell'array è: " + risultatoMoltiplicazione);
        } else {
            System.out.println("L'array non è valido o non ha abbastanza elementi per calcolare la moltiplicazione.");
        }
    }
}