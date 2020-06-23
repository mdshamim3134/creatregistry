package allbase;

public class Duplicate {

	public static void main(String[] args) {
		String[] a = { "asma", "salma", "runa", "asma" };
		int count = 0;
		int size = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] == a[j]) {
					count++;
					System.out.println("times of duplicate value" + " " + count);
					System.out.println("this is duplicate value" + " " + a[i]);

				} else if (count == 0) {
					System.out.println("there is no dublicate value");

				}

			}
		}

	}

}
