package no.hvl.dat100.matriser;

public class Matriser {

    // a)

    public static void skrivUt(int[][] matrise){
        for (int[] i : matrise){
            for (int t : i){
                System.out.print(t + " ");
            }
        }
    }

    // b)

    public static String tilStreng(int[][] matrise) {
        StringBuilder s1 = new StringBuilder();

        for(int i = 0 ; i < matrise.length; i++) {
            for (int k = 0; k < matrise[i].length; k++) {
                s1.append(matrise[i][k]);
                if (k < matrise[i].length - 1){
                    s1.append(" ");
                }
            }
            s1.append("\n");
        }

        return s1.toString();
    }

    // c)

    public static int[][] skaler(int tall, int[][] matrise) {
        int rader = matrise.length;
        int kolonner = matrise[0].length;


        int[][] nyMatrise = new int[rader][kolonner];


        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }

        return nyMatrise;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        // TODO
        throw new UnsupportedOperationException("Metoden erLik ikke implementert");

    }

    // e)
    public static int[][] speile(int[][] matrise) {

        // TODO

        throw new UnsupportedOperationException("Metoden speile ikke implementert");

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        // TODO
        throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

    }
}
