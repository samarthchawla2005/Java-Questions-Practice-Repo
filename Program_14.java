import java.util.Arrays;

public class Program_14 {
    public static void main(String[] args) {
        int arr[] = { 15, 8, 27, 4, 19, 27, 42 };
        int key = 27;
        int count = 0;

        System.out.println("Array =  " + Arrays.toString(arr));
        System.out.println("Key = " + key);

        System.out.print("Found at index(es): " );

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();

        if (count == 0) {
            System.out.println("Key not found");
        } else {

            System.out.println("Found " + count + " time(s)");
        }
    }
}
