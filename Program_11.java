public class Program_11 {
    public static void main(String[] args){
        int arr[] = {10, 22, 43, 5, 7, 100};
        int key = 43;
        int index = -1;

        for(int i = 0; i <= arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element Not found");
        } else{
            System.out.println("Element found at index " + index);
        }
    }
}
