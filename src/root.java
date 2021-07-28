import java.util.Scanner;

public class root {
    public static void main(String [] args){
        Scanner myscanner = new Scanner(System.in); // create Scanner object
        System.out.println("Enter a");
        int a = myscanner.nextInt();
        System.out.println("Enter b");
        int b = myscanner.nextInt();
        System.out.println("Enter c");
        int c = myscanner.nextInt();

        if (a != 0) {
            double delta = (Math.pow(b, 2) - (4 * a * c));

            if (delta > 0){
                double root1 = ( (-1 * b) + Math.sqrt(delta)) / (2 * a);
                double root2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
                String str = String.format("first root is %f and second root is %f", root1, root2);
                System.out.println(str);
                }

            else if (delta == 0) {
                double root = (-1 * b) / (2 * a);

                System.out.println(String.format("only %f is root",root));

            }
            else {
                System.out.println("there is on root for this equation");
            }
        }
        else {
           System.out.println("your equation is not second degree");
        }
    }
}
