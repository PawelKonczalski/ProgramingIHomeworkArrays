package homework;

public class SortUpCheck {

    public boolean sorUpCheck(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] >= tab[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
