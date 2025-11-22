public class Program_8 {
    public static void main(String[] args){
        int[] arr = {11, 4, 27, 89, 55};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest: " + max);
    }
}
