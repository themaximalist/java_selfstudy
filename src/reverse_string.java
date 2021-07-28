import java.util.Scanner;

public class reverse_string {
    public static void main(String [] args){
        Scanner user_input = new Scanner(System.in);
        while (true){
            String reversed_string = "" ;
            System.out.println("PLEASE ENTER YOUR STRING:");
            String raw_string = user_input.nextLine();

            for (int i = raw_string.length()-1 ; i >= 0; --i ){
                reversed_string += raw_string.charAt(i);
            }
            System.out.println(reversed_string);
            System.out.println("==========================");
        }
    }
}
