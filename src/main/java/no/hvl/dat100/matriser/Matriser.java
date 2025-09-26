package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.println("----------");
		for (int[] tabell : matrise) {
			for (int tall : tabell) {
				System.out.print(tall + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (j < matrise[i].length - 1) {
					sb.append(matrise[i][j] + " ");
				} else {
					sb.append(matrise[i][j] + " \n");
				}
			}
		}
		return sb.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		if (matrise == null || matrise.length == 0 || matrise[0].length == 0) return new int[0][0];
		int[][] resMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return resMatrise;
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
