package week_2.task_2;

public class MatrixPrint {

	public static void main(String[] args) {
//		System.out.println("Start!");
		int i;
		for (i = 1; i <= 25; i++) {
			if (((i - 1) % 6 != 0) && ((i - 5) % 4 != 0)) {
				if (i < 9) {
					System.out.print(i + "  ");
				} else {
					System.out.print(i + " ");
				}
			} else {
				if (i < 9) {
					System.out.print("*" + "  ");
				} else {
					System.out.print("*" + " ");
				}

			}
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
 