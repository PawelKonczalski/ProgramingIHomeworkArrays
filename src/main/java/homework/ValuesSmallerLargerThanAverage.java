package homework;

import java.util.Random;

public class ValuesSmallerLargerThanAverage {

    public void smaLarThanAve(int tabSize) {
        Random random = new Random();
        int[] tab = new int[tabSize];
        int sum = 0;
        int average;
        int smaller = 0;
        int larger = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);

            if (tabSize == 1) {
                System.out.print("[" + tab[i] + "]");
            } else if (i == 0) {
                System.out.print("[" + tab[i] + ", ");
            } else if (i < tabSize - 1) {
                System.out.print(tab[i] + ", ");
            } else {
                System.out.print(tab[i] + "]\n");
            }

            sum += tab[i];
        }

        average = sum / tabSize;
        System.out.println("Srednia z wszytkich wartości: " + average);

        for (int tabValue : tab) {
            if (tabValue < average)
                smaller++;
            else
                larger++;
        }

        System.out.println("Ilość liczb większych od średniej: " + larger);
        System.out.println("Ilość liczb mniejszych od średniej: " + smaller);
    }
}
