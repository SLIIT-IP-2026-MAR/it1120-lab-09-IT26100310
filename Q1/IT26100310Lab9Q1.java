import java.util.Scanner;

public class IT26100310Lab9Q1 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double x1, x2;

        System.out.print("Enter a value: ");
        a = input.nextDouble();

        System.out.print("Enter b value: ");
        b = input.nextDouble();

        System.out.print("Enter c value: ");
        c = input.nextDouble();

        x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
		
		System.out.println("\nRoots are real and differnet: ");
        System.out.println("root 1:  " + x1);
        System.out.println("root 2:  " + x2);

        input.close();
    }
}