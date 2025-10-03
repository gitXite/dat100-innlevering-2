package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)

    public static void skrivUt(int[] tabell) {
        for (int t : tabell) {
            System.out.println(t);
        }
    }

    // b)

    public static String tilStreng(int[] tabell) {
        StringBuilder s1 = new StringBuilder();
        s1.append("[");

        for (int i = 0; i < tabell.length; i++) {
            s1.append(tabell[i]);
            if (i < tabell.length - 1) s1.append(",");
        }
        s1.append("]");
        return s1.toString();
    }

    // c)

    public static int summer(int[] tabell) {
        int sum = 0;
        for (int tall : tabell) {
            sum += tall;
        }
        return sum;

    }

    // d)

    public static boolean finnesTall (int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

    // e)

    public static int posisjonTall (int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i ++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    // f)

    public static int[] reverser(int[] tabell) {
        int[] nyTabell = new int[tabell.length];
        int t1 = 0;

        for (int m = tabell.length - 1; m >= 0; m--) {
            nyTabell[t1] = tabell[m];
            t1++;
        }

        return nyTabell;
    }

    // g)

    public static boolean erSortert(int[] tabell) {

        // TODO
        throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
    }

    // h)

    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        // TODO
        throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

    }
}
