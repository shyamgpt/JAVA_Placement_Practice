package Array_Placement;

public class UniqueElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2 };

		System.out.print("Unique elements: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;

			// Check if this element appears anywhere else
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}

			// If it's unique, print it
			if (isUnique== true) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
