package hello;

public class Removedublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10, 20, 10, 30, 20};
	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                System.out.println(arr[i]);
	            }

	}

	}
}
