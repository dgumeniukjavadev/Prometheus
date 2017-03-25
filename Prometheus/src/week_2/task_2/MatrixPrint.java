package week_2.task_2;

public class MatrixPrint {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 25; i++) {
			if (((i - 1) % 6 != 0) && ((i - 5) % 4 != 0)) {
				if ((i < 9) && (i != 6)) {
					System.out.print(i + "  ");
				} else if (i == 6) {
					System.out.print(" " + i);
				} else {
					System.out.print(i + " ");
				}
			} else {
				if (i == 1) {
					System.out.print(" *" + "  ");
				} else if (i == 5 || i == 9) {
					System.out.print("*" + " ");
				} else if(i==7){
					System.out.print("  *" + "  ");
				} else {
					System.out.print(" *" + " ");
				}

			}
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
