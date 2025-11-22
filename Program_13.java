public class Program_13 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int key = 6;
        int index = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element Found At Index " + index);
        }
    }
}
