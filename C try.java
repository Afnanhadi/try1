import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Ca {

    private static List<Double> all = new ArrayList<>();
    private static double last = 0;


    public static void main(String[] args)  {

        while (true) {
            Scanner S = new Scanner(System.in);
            menu();
            int w = 0;
            try {
                w = S.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }catch (Exception e0){
                System.out.println(e0.getMessage());
            }finally {
                System.out.println(":)");
            }

            if (w == 9) {
                System.out.println("Last Solutions  " + last);
            } else if (w== 10) {
                System.out.println("All Solutions " + all);
            } else if (w >= 1 && w <= 8) {
                double number1 = 0;
                double number2 = 0;
                try {
                    System.out.print("Pleas Enter first number: ");
                   number1 = S.nextDouble();
                    System.out.print("Pleas Enter second number: ");
                    number2= S.nextDouble();
                } catch (InputMismatchException e1) {
                    System.out.println(e1.getMessage());
                }
                  v(w,number1,number2);
                all.add(last);
                System.out.println("Result: " + last);
            } else {
                System.out.println("Error please wait");
            }
            String e = " ";
            try {
                System.out.println("Do you want to exit");
                e = S.next();

            } catch (InputMismatchException e2) {
                System.out.println(e2.getMessage());
                S.nextLine();
            }catch (Exception e8){
                System.out.println(e8.getMessage());
            }finally {
                System.out.println(":)");
            }
        }
    }
    private static void menu() {
        System.out.println("Enter 1 to addition the numbers:" +
                "\n" +
                "Enter 2 to subtraction the numbers:" +
                "\n" +
                "Enter 3 to multiplication the numbers:" +
                "\n" +
                "Enter 4 to division the numbers:" +
                "\n" +
                "Enter 5 to modulus the numbers:" +
                "\n" +
                "Enter 6 to find minimum number:" +
                "\n" +
                "Enter 7 to find maximum number:" +
                "\n" +
                "Enter 8 to find the average of numbers:" +
                "\n" +
                "Enter 9 to print the last result in calculator:" +
                "\n" +
                "Enter 10 to print the list of all results in calculator:");
        System.out.print("Enter your number chose: ");
    }
    public static double addition(double number1, double number2) {
        return number1 + number2;

    }

    public static double subtract(double number1, double number2) {

        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {

        return number1 * number2;
    }

    public static double divide(double number1, double number2) {

            return number1 / number2;
        }


    public static double modulus(double number1, double number2) {

        return number1 % number2;
    }

    public static double min(double number1, double number2) {
        return Math.min(number1,number2);
    }
    public static double max(double number1, double number2){

        return Math.max(number1,number2);
    }
    public static double avg(double number1, double number2){

        return number1 + number2/2;
}
public static void v(int w, double number1,double number2){
    switch (w) {
        case 1:
            last = addition(number1, number2);
            break;
        case 2:
            last= subtract(number1, number2);
            break;
        case 3:
            last = multiply(number1, number2);
            break;
        case 4:
            last = divide(number1, number2);
            break;
        case 5:
            last = modulus(number1, number2);
            break;
        case 6:
            last = min(number1, number2);
            break;
        case 7:
            last = max(number1, number2);
            break;
        case 8:
            last = avg(number1, number2);
            break;
    }
}
}