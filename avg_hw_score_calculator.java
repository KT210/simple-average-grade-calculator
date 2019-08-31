import java.util.Scanner;
public class avg_hw_score_calculator{

public static void main (String args[]){
int a = 0;
int b = 0;
int c = 0;
int d = 0;

Scanner scan = new Scanner(System.in);
System.out.println("Welcome User! :)" + "\n" + "Tell me how many HW scores would u like to calculate? " + "\n" + "Print 0 to quit!");
a = scan.nextInt();
score_clac_fun obj1 = new score_clac_fun();
if (a == 0){
System.out.println("Good Bye!!!");
}
else{

for(int i = 1; i<= a; i++){


System.out.println("Enter your HW " + i + " Score");
b = scan.nextInt();
c = obj1.add_fun(b);



}//for
score_clac_fun obj2 = new score_clac_fun();
d = obj2.div_fun(c,a);
System.out.println("Your Average HW score is" + d);




}//if else
}//main
}//class