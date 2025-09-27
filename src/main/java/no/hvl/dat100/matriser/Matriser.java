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
		// null sjekk for å trygt bruke index, antar at radene er like store
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
		// robust null sjekk og tidlig return
		if ((a == null || a.length == 0) && (b == null || b.length == 0)) return true;
		if (a == null || b == null || a.length == 0 || b.length == 0) return false;
		if (a.length != b.length) return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) return false;
			
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		if (matrise == null || matrise.length == 0 || matrise[0].length == 0) return new int[0][0];
		int[][] resMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resMatrise[i][j] = matrise[j][i];
			}
		}
		return resMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (a[0].length != b.length) return new int[0][0];
        int[][] resMatrise = new int[a.length][b[0].length];
        
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					resMatrise[i][j] += a[i][k] * b[k][j];
				}
		    }
		}
		return resMatrise;
	}
}
