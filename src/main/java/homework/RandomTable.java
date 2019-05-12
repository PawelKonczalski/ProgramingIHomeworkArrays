package homework;

import java.util.Random;

public class RandomTable {

    public void ranTab(int tabSize) {
        Random random = new Random();
        int[] tab = new int[tabSize];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
            if (tabSize == 1) {
                System.out.print("[" + tab[i] + "]");
            } else if (i == 0) {
                System.out.print("[" + tab[i] + ", ");
            } else if (i < tabSize - 1) {
                System.out.print(tab[i] + ", ");
            } else {
                System.out.println(tab[i] + "]");
            }
        }

    }
}
