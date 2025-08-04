package hello;

public class SmallestAndlargestnumber {
	 public static void main(String[] args) {
	int[] arr = {50, 2, 100, 11, 37};
    int min = arr[0], max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
    }

    System.out.println("Smallest: " + min);
    System.out.println("Largest: " + max);

	 }
}
