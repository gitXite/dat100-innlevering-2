package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println("----------");
		System.out.print("Tall i tabell:");
		for (int tall : tabell) {
			System.out.print(" " + tall);
		}
		System.out.println("\n----------");
	}

	// b)
	public static String tilStreng(int[] tabell) {		
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < tabell.length; i++) {
			sb.append(tabell[i]);
			if (i < tabell.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
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
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] resTabell = new int[tabell.length];
		int index = 0;

		for (int revIndex = tabell.length - 1; revIndex >= 0; revIndex--) {
			resTabell[index] = tabell[revIndex];
			index++;
		}
		return resTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			if (i < tabell.length - 1 && tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] resTabell = new int[tabell1.length + tabell2.length];
		int index = 0;
		
		for (int i = 0; i < resTabell.length; i++) {
			if (i < tabell1.length) {
				resTabell[i] = tabell1[i];
			} else {
				resTabell[i] = tabell2[index];
				index++;
			}
		}
		return resTabell;
	}
}
