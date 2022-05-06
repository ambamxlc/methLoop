import java.util.Scanner;

// public class DivideMethod {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int numA = in.nextInt();

//         System.out.println("Enter another number: ");
//         int numB = in.nextInt();

//         divide(numA, numB);
        
//         in.close();
//     }

//     public static void divide(int x, int y) {
//         System.out.println(x + " / " + y + " = " + (double)x / (double)y);
//     }
// }

// public class MethodReturnTypes {

//     public static String input;

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.println("Pick a BTS member (Jimin, JK, RM, J-Hope, Suga, Jin, V)");
//         input = in.nextLine();

//         System.out.println("You chose the cute and adorable " + stringy());
//         System.out.println("How many letters are in his name? " + count());
//         System.out.println("He is the best member. " + eval());

//         in.close();
//     }

//     public static String stringy() {
//         String r = input;
//         return r;
//     }

//     public static int count() {
//         int r = input.length();
//         return r;
//     }

//     public static boolean eval() {
//         boolean r;

//         int m = input.length() % 2;

//         if (m == 0) {
//             r = true;
//         } else {
//             r = false;
//         }

//         return r;
//     }
// }

// public class AverageMethod {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.println("Enter a num:");
//         int numA = in.nextInt();

//         System.out.println("Enter another num:");
//         int numB = in.nextInt();

//         System.out.println("Enter one more num:");
//         int numC = in.nextInt();

//         System.out.println("Your avg is: " + average(numA, numB, numC));

//         in.close();
//     }

//     public static int sum(int x, int y, int z) {
//         return x + y + z;
//     }

//     public static double average(int x, int y, int z) {
//         return (double)sum(x, y, z) / 3.0;
//     }
// }
