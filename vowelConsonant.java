import java.util.Scanner;
public class vowelConsonant {
    public static void main(String[] args) {
        int i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        char ch= scan.next().charAt(0);

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
                ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("The character entered is VOWEL");
        }
    else if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
            System.out.println("The character entered is CONSONANT");
        }
    else {
            System.out.println("Not an Alphabet");
        }
    }
}
