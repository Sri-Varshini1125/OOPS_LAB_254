import java.util.Scanner;
public class Selection { 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
if (num > 0) {
System.out.println("IF: Number is positive");
}
if (num % 2 == 0) {
System.out.println("IF-ELSE: Number is even");
} else {
System.out.println("IF-ELSE: Number is odd");
}
if (num > 0) {
System.out.println("IF-ELSE-IF: Positive number");
} else if (num < 0) {
System.out.println("IF-ELSE-IF: Negative number");
} else {
System.out.println("IF-ELSE-IF: Zero");
}
if (num >= 0) {
if (num == 0) {
System.out.println("NESTED IF: Number is zero");
} else {
System.out.println("NESTED IF: Number is positive");
}
} else {
System.out.println("NESTED IF: Number is negative");
}
sc.close(); 
}  
} 