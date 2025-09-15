package entities;
import java.util.Random;

public class Array {
    private int[] num = new int[5];
    Random random = new Random();

    public Array() {
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10) + 1;
        }
    }

    public void stampaArray() {
        for (int number : num) {
            System.out.print(number + " ");
        }
    }

    public void modificaElemento(int pos, int newNum) {
        if(pos >= 0 && pos < num.length) {
            num[pos] = newNum;
        } else {
            System.out.println("Posizione non valida!");
        }
    }
}
