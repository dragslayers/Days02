package ex04;
import java.util.ArrayList;

public class CoucherDeSoleil {

    public static ArrayList<Integer> soleil(String direction, int tab[]) {
        // int tab2[] = new int[tab.length];
        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        int max = 0;
        if (direction == "Ouest") {
            for (int i = 0; i < tab.length; i++) {
                if (max < tab[i]) {
                    max = tab[i];
                    tab2.add(i);
                }
            }
        } 
        if (direction == "Est") {
            for (int i = tab.length; i >= 0; i--) {
                if (max < tab[i]) {
                    max = tab[i];
                    tab2.add(i);
                }
            }
        }

        return tab2;
    }

    public static void main(String[] args) {
        int immeubles[] = { 3, 5, 4, 4, 3, 1, 3, 2 };
        ArrayList<Integer> tab = soleil("Ouest", immeubles);
        for (int i = 0; i < tab.size(); i++) {
            System.out.print(tab.get(i) + " ");
        }
    }
}
