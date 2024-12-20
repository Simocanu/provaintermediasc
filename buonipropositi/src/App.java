import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
       List<String> propositi = new ArrayList<>();
        propositi.add("Fare più attività fisica");
        propositi.add("Esercitarsi su Java");
        propositi.add("Leggere più libri");
        propositi.add("Iscriversi in palestra");
        propositi.add("Dedicare più tempo alla famiglia");
        
        // Lista di Array per tenere traccia dei propositi conseguiti
        List<String> propositiCompletati = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Benvenuto e buone feste! Ecco i tuoi buoni propositi per l'anno prossimo:");
        
        while (propositi.size() > 0) {
            // Mostriamo i propositi non ancora completati
            System.out.println("\nPropositi da completare:");
            for (int i = 0; i < propositi.size(); i++) {
                System.out.println((i + 1) + ". " + propositi.get(i));
            }
            
            // Chiediamo all'utente di selezionare un proposito che ha completato
            System.out.print("\nInserisci il numero del proposito che hai completato (1-" + propositi.size() + "): ");
            int scelta = scanner.nextInt();
            
            // Controlliamo se la scelta è valida
            if (scelta >= 1 && scelta <= propositi.size()) {
                String completato = propositi.remove(scelta - 1); // Rimuoviamo il proposito completato
                propositiCompletati.add(completato); // Aggiungiamo alla lista dei propositi completati
                System.out.println("Complimenti! Hai completato: " + completato);
            } else {
                //Oppure comunichiamo all'utente di fare una scelta di numeri valida tra 1 e la dimensione dei propositi rimasti
                System.out.println("Scelta non valida. Per favore, inserisci un numero tra 1 e " + propositi.size() + ".");
            }
        }
        
        // Quando tutti i propositi sono completati
        System.out.println("\nCongratulazioni! Hai completato tutti i tuoi buoni propositi!");
        scanner.close();
    }
}

// ho usato le array list per esercitarmi su uno degli ultimi argomenti affrontati a lezione, tuttavia sarebbe stato possibile
// anche con gli array normali, sapendo già il numero di buoni propositi (5);