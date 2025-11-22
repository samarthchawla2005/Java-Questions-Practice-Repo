public class Program_12 {
    public static void main(String[] args) {
        int arr[] = { 5, 12, 7, 20, 3, 50 };
        int key = 20;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Key not found"); 
        } else {
            System.out.println("Key Found at index " + index);
        }
    }
}