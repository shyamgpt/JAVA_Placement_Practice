package youTube_Java_Program_2026;

public class Move_all_Zero_at_end {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 0, 2, 0, 3, 0, 0, 2, 3};
        int index = 0;

        // Step 1: Put non-zero elements in front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill remaining places with 0
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        // Step 3: Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
