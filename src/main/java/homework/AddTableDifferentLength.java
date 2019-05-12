package homework;

public class AddTableDifferentLength {
    private int[] tabC;

    public void addTabDifLen(int[] tabA, int[] tabB) {

        int longer[];
        int shorter[];

        if (tabA.length >= tabB.length) {
            longer = tabA;
            shorter = tabB;
        } else {
            longer = tabB;
            shorter = tabA;
        }

        tabC = new int[longer.length];

        for (int j = 0; j < tabC.length; j++) {
            if (j < shorter.length) {
                tabC[j] = longer[j] + shorter[j];
            } else {
                tabC[j] = longer[j];
            }
        }

        for (int i = 0; i < tabC.length; i++) {
            if (tabC.length == 1) {
                System.out.print("[" + tabC[i] + "]");
            } else if (i == 0) {
                System.out.print("[" + tabC[i] + ", ");
            } else if (i < tabC.length - 1) {
                System.out.print(tabC[i] + ", ");
            } else {
                System.out.println(tabC[i] + "]");
            }
        }
    }
}
