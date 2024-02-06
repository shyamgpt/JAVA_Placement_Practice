package Array_Placement;

public class frequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {1,2,8,3,2,2};
		int fr[] = new int[arr.length];
		
		int visited = -1;
		
		for(int i =0; i<arr.length; i++) {
			int count =1;
			for(int j=i+1; j<arr.length; j++) {
				
				
				if(arr[i] == arr[j]) {
					System.out.println("i ->" +i);
					System.out.println("j ->" +j);
					count++;
					fr[j] = visited;
					System.out.println("count is -->"+count);
					System.out.println("j->"+j);
					System.out.println("fr[j]->"+fr[j]);
					
				}
			}
			if(fr[i]!=visited) {
//				System.out.println("outside if");
//				System.out.println("fr[i]->"+fr[i]);
				fr[i] =count;
//				System.out.println("fr[i]->"+fr[i]);
			}
				
		}

	}

}
