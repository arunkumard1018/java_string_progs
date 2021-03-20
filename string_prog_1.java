import java.util.Scanner;
import javax.print.event.PrintEvent;

/*1. Write a program to compute the frequency of each lowercase letter in the string.

Sample Input:

Enter the input string
innovate
Sample Output:

The letter frequency is
a 1
e 1
i 1
n 2
o 1
t 1
v 1
*/
public class day14a {
    public static void main(String[] args) {
        int j,k;
        String s;
        char c;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the input String :");
        s = sc.nextLine();
        System.out.println("The Letter Frequency Is");
        for(c = 'a' ; c <= 'z'; c++)
        {
            k = 0;
            for(j = 0; j < s.length() ; j++){
                if(s.charAt(j) == c){
                    k++;
                }
            }
            if(k > 0){
                System.out.println(c + " " + k);
                k = 0;
            }
           

        }
    }
}
