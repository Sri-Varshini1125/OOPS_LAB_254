class BreakContinue {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
if (i == 3) {
continue;   // Skips 3
}
if (i == 7) {
break;      // Stops loop at 7
}
System.out.println(i);
}
}
}
