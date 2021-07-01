import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program");
        System.out.println("Enter the input value");
        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
        //Given input value
        int x1= input.nextInt();
        int x2= input.nextInt();
        int y1= input.nextInt();
        int y2= input.nextInt();

        Integer a1= input.nextInt();
        Integer a2= input.nextInt();
        Integer b1= input.nextInt();
        Integer b2= input.nextInt();

        //Length of line calculation
        double lengthOne = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double lengthTwo = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

        //Given equal operator
        if (lengthOne == lengthTwo) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal");
        }


    }
}
