import java.util.Scanner;


public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program");
        System.out.println("Enter the Integer Value");
        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
        //Given input value
        Integer x1= input.nextInt();
        Integer x2= input.nextInt();
        Integer y1= input.nextInt();
        Integer y2= input.nextInt();

        Integer a1= input.nextInt();
        Integer a2= input.nextInt();
        Integer b1= input.nextInt();
        Integer b2= input.nextInt();

        //Length of line calculation
        Double lengthOne = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        Double lengthTwo = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

        //Given equal operator
        if (lengthOne == lengthTwo) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal");
        }

        //Given compare two value and use compareTo method
        int diffInLength = lengthOne.compareTo(lengthTwo);
        if (diffInLength == 0) {
            System.out.println("lengthOne and lengthTwo are Equal");
        } else if (diffInLength > 0) {
            System.out.println("Lengthone is geater than lengthtwo ");
        } else {
            System.out.println("Lengthone is less than  lengthTwo ");

        }


    }
}

