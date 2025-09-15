import entities.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Esercizio 1
        Array arr = new Array();
        System.out.print("Array iniziale: ");
        arr.stampaArray();

        while (true) {
            try {
                System.out.print("\nScegli la posizione da modificare (tra 1 e 5, o 0 per uscire): ");
                int pos = scanner.nextInt();

                if (pos >= 1 && pos <= 5) {
                    System.out.print("Inserisci il nuovo numero: ");
                    int newNumber = scanner.nextInt();
                    arr.modificaElemento(pos - 1, newNumber);
                } else if (pos == 0) {
                    System.out.println("Programma terminato!");
                    break;
                } else {
                    System.out.println("Posizione non valida!");
                }

                System.out.print("\nArray aggiornato: ");
                arr.stampaArray();

            } catch (Exception e) {
                System.out.println("Errore: devi inserire un numero!");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}