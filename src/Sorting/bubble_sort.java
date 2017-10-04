package Sorting;

class sort {
	void sorting(int[] ar) {
		int len = ar.length;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len-i; j++) {
				if (ar[j - 1] > ar[j]) {
					int temp = ar[j - 1];
					ar[j - 1] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
}

public class bubble_sort {

	public static void main(String[] args) {

		int ar[] = { 3, 5, 1, 6, 2, 4, 9, 10, 7, 8 };
		int len = ar.length;
		System.out.println("Before sorting :: ");
		for (int i = 0; i < len; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		sort object = new sort();
		object.sorting(ar);

		System.out.println("After sorting :: ");

		for (int i = 0; i < len; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

	}

}
