import java.util.Scanner;

class A {
    public void Length() {
        System.out.println("Welcome To Line Comparison Program");
        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Values");
        //Given input value
        Integer x1 = input.nextInt();
        Integer x2 = input.nextInt();
        Integer y1 = input.nextInt();
        Integer y2 = input.nextInt();

        Integer a1 = input.nextInt();
        Integer a2 = input.nextInt();
        Integer b1 = input.nextInt();
        Integer b2 = input.nextInt();

        //Length of line calculation
        Double lengthOne = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double lengthTwo = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

        //Given equal operator
        if (lengthOne == lengthTwo) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal");
        }
   }
}

public class LineComparison {
    public static void main(String[] args)
    {
        A lengthOne=new A();
        A lengthTwo=new A();
        A a1=new A();
        a1.Length();

        if(lengthOne.equals(lengthTwo)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //Given compare two value and use compareTo method
        boolean diffInLength = lengthOne.equals(lengthTwo);
        if (diffInLength == true) {
            System.out.println("Equal of line length");
        } else if (diffInLength = false) {
            System.out.println("Line1 is greater in length than lengthOne ");
        } else {
            System.out.println("Line1 is smaller in length than lengthTwo ");

        }


    }
}
