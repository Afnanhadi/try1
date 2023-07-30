import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);
        try {


            int z = 0;
            int[] array = null;
            boolean e = false;

            while (true) {

                System.out.println("1. Accept elements of an array");
                System.out.println("2. Display elements of an array");
                System.out.println("3. Search element within array");
                System.out.println("4. Sort the array");
                System.out.println("5. Stop");
                System.out.print("Enter choice: ");
                int A = 0;
                A = scenner.nextInt();
                System.out.println();
                switch (A) {
                    case 1:
                        System.out.print("Enter number size of the array: ");
                        z = scenner.nextInt();
                        try {
                            array = new int[z];
                            System.out.println("Enter elements of the array:");
                        }catch (InputMismatchException e1){
                            System.out.println(e1.getMessage());
                        }catch (Exception e3){
                            System.out.println(e3.getMessage());
                        }finally {
                            System.out.println(":)");
                        }
                        System.out.println("Enter the ِArray numbers");
                        for (int i = 0; i < z; i++) {
                            System.out.print("Element Arrays " + (i + 1) + ": ");
                            array[i] = scenner.nextInt();
                        }
                        System.out.println("Array elements accepted.");
                        break;
                    case 2:
                        if (array != null) {
                            System.out.println("Array elements:");
                            for (int i = 0; i < z; i++) {
                                System.out.print(array[i] + " ");
                            }
                            System.out.println();
                        } else {
                            System.out.println("Array hasn't been initialized yet.");
                        }
                        break;
                    case 3:
                        System.out.print("Search element within array ");
                        int search = scenner.nextInt();
                        if (array !=null) {
                            boolean o = false;
                            for (int i = 0; i < z; i++) {
                                if (array[i] == search) {
                                    System.out.println(search + " found at index " + i);
                                    o = true;
                                    break;
                                }
                            }
                            if (true) {
                                System.out.println(search+ " not the array.");
                            }
                        } else {
                            System.out.println("Array hasn't been initialized yet.");
                        }
                        break;
                    case 4:
                        if (array != null) {
                            Arrays.sort(array);
                            for (int i=0;i<array.length; i++)
                                System.out.println("Sort the array."+array[i]);

                        } else {
                            System.out.println("Array hasn't been initialized yet.");
                        }
                        break;
                    case 5:
                        e = true;
                        System.out.println("stop");
                        break;
                    default:
                        System.out.println("Invalid ");
                }
                System.out.println();
            }}catch (InputMismatchException i1){
            System.out.println(i1.getMessage());
        }catch (Exception i2){
            System.out.println(i2.getMessage());
        }finally {
            System.out.println(":)");
        }


    }
}

