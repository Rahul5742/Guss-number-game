import java.util.Random;
import java.util.Scanner;



import java.util.Random;
import java.util.Scanner;
class guss{
    int r;
    int n;
    //method logic of guss number game .
    public void gussGame(){
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {
            //input of user number .
            System.out.print("Enter your number : ");
            n=sc.nextInt();
            //condition of correct number guss :
            if (n == r) {
                System.out.println("Congratulations! You guessed the correct number! ");
                System.out.println("Random number is :"+r);
                System.out.println("Attemp :"+i);
                return; // Exit the method after correct guess .

            } else if (n > r) { //condition of higher number  .
                System.out.println("The number is higher. Try again.");

            } else { //condition of lower number  .
                System.out.println("The number is lower. Try again.");
            }
        }
        System.out.println("Sorry, you've used all your attempts. The correct number was: " + r); //u not guss the number then print this line .
    }
}

    public class Guss_number_game {
    public static void main(String[] args) {
        Random r=new Random();
        guss g=new guss(); //class .
        g.r=r.nextInt(1,100); //Random number generator .
        g.gussGame(); //method called .
    }
}
