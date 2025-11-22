//Count Even & Odd Numbers

import java.util.Arrays;

public class Program_10 {
    public static void main(String[] args){
        int[] arr = {10,22,43,55,7,100};
        int even = 0, odd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        // System.out.println("The array is " + arr); // It prints int the form of [classType @ memoryAddress]
        /*The array is [I@1dbd16a6 => This means [I → integer array & @1dbd16a6 → memory address type output*/
        System.out.println("The array is " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Total Even Number in array are = " + even);
        System.out.println();
        System.out.println("Total Odd Numbers in array are = " + odd);
    }
}
