import java.util.Scanner;
import java.util.*;
class game
{
/*
create a class game,which allows a user to play "guess the number"
game once. Game should have the following methods:
1. constructor to generate the random number
2. takeuserInput to take a user input of number
3. iscorrectNumber() to detect whether the number enterred by the user is true 
*/
int a;
public game()
{
Random r = new Random();
a= r.nextInt(100);
//System.out.println("the value is"+a);
}
public void get()
{
	int n,c=0 ;
do{
System.out.println("enter the number between 0 to 100");
Scanner sn = new Scanner(System.in);
n=sn.nextInt();
if(n>a)
System.out.println("sorry your number is wrong ,it is greater number,write a number smaller than it");
else if(n<a)
System.out.println("sorry your number is wrong ,it is smaller number,write a number greater than it");
else {
System.out.println("you win you guess right number");
c++;
break;
}
c++;
}while(n!=-1);
System.out.println("you guess the number in " +c+ "th time");
}
}
class cho_game
{
public static void main(String arg[])
{
	String s;
	Scanner sn = new Scanner(System.in);
	
	do{
		game obj = new game();
		obj.get();
		System.out.println("Do u want to play again?");
		
		
		 s=sn.nextLine();
		
	  }while(s.equals("yes"));
}
}