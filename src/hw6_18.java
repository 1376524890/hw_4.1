import java.util.Scanner;
public class hw6_18 {
    public static boolean is8num(String password){
        return password.length()>=8;
    }
    public static boolean isNumAndLetter(String password){
        for (int i = 0; i < password.length(); i++) {
            if(((int)password.charAt(i)>='0'&&(int)password.charAt(i)<='9')||((int)password.charAt(i)>='a'&&(int)password.charAt(i)<='z')||((int)password.charAt(i)>='A'&&(int)password.charAt(i)<='Z')){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static boolean contain2numbers(String password){
        int numOfNumber = 0;
        for (int i = 0; i < password.length(); i++) {
            if(((int)password.charAt(i)>='0'&&(int)password.charAt(i)<='9')){
                numOfNumber++;
            }
        }
        return numOfNumber>=2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password =  scan.next();
        if(is8num(password)&&isNumAndLetter(password)&&contain2numbers(password)){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
