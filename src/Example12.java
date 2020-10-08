import java.util.Scanner;
class Ecample9 {
    public static void main (String argc[]) {
        int x, y;
        System.out.println("Enter value 1:");

        //Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        System.out.println("Enter value 2:");
        y = inputValue.nextInt();
        if (x < y) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}