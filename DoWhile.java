import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num;
do 
{
System.out.print("Enter a number (0 to exit): ");
num = sc.nextInt();
System.out.println("You entered: " + num);
} 
while (num != 0);  
System.out.println("Program ended. You entered 0.");
sc.close();
}
}
