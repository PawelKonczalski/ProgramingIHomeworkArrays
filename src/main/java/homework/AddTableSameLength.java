package homework;

public class AddTableSameLength {

    private int[] tabC;

    public void addTabSamLen(int[] tabA, int[] tabB) {

        if (tabA.length > tabB.length) {
            tabC = new int[tabA.length];
        } else {
            tabC = new int[tabB.length];
        }

        for (int i = 0; i < tabC.length; i++) {
            tabC[i] = tabA[i] + tabB[i];
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
