package homework;

public class Main {
    public static void main(String[] args) {
        sortingChecking();
        System.out.println("====================================================================================================");
        randomTab();
        System.out.println("====================================================================================================");
        addingTabSameLenght();
        System.out.println("====================================================================================================");
        addingTabDifferentLenght();
        System.out.println("====================================================================================================");
        smallerLargerThanAverage();
    }

    public static void sortingChecking() {
        SortUpCheck checking = new SortUpCheck();
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("Czy elementy tablicy są posortowane niemalejąco: " + checking.sorUpCheck(tab));

        int[] tabs = {1, 2, 9, 4, 5};
        System.out.println("Czy elementy tablicy są posortowane niemalejąco: " + checking.sorUpCheck(tabs));
    }

    public static void randomTab() {
        RandomTable randomTable = new RandomTable();
        randomTable.ranTab(10);
        randomTable.ranTab(15);
    }

    public static void addingTabSameLenght() {
        AddTableSameLength addTabSame = new AddTableSameLength();

        int[] tab = {1, 2, 3, 4, 5};
        int[] tabs = {1, 2, 9, 4, 5};

        addTabSame.addTabSamLen(tab, tabs);
    }

    public static void addingTabDifferentLenght() {
        AddTableDifferentLength addTabDif = new AddTableDifferentLength();

        int[] tab = {1, 2, 1, 4, 5, 5, 7};
        int[] tabs = {1, 2, 2, 4, 5};

        addTabDif.addTabDifLen(tab, tabs);
    }

    public static void smallerLargerThanAverage() {
        ValuesSmallerLargerThanAverage smaLarThanAve = new ValuesSmallerLargerThanAverage();
        smaLarThanAve.smaLarThanAve(20);
    }
}
