import java.util.Scanner;

/* 2. Write a program to delete all vowels present in a string.

Sample Input:

Enter the input string
rooman

Sample Output: 

The output string is rmn */

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Input String");
        String s = sc.nextLine();
        for(int i=0; i<s.length() ; i++ ){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c == 'i' || c == 'o' || c=='u' ){
                continue;
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}