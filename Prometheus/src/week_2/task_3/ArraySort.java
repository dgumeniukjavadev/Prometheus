package week_2.task_3;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = { 30, 2, 10, 4, 6 };
		int length = array.length;
		for (int k = length - 1; k >= 0; k--) {
			for (int i = 0; i < length - 1; i++) {
				int tmp;
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
