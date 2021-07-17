import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int arrayLength;

        System.out.print("Enter the array's length: ");
        arrayLength = keyboard.nextInt();

        int[] userArray = new int[arrayLength];

        System.out.println("Enter the elements of array: ");

        for (int i=0;i< userArray.length;i++){

            System.out.print((i+1)+".Element : ");
            userArray[i] = keyboard.nextInt();

        }

        Arrays.sort(userArray);

        System.out.println("Array is sorted from minimum to maximum : " + Arrays.toString(userArray));



    }
}
