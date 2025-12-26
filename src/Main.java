import java.util.Scanner;
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER 1ST VARIABLE:");
        double a = sc.nextDouble();

        Scanner inp = new Scanner(System.in);
        System.out.print("ENTER 2ND VARIABLE:");
        double b = inp.nextDouble();
        double c = a * b;
        System.out.print("THE MULTIPLICATION OF 2 VARIABLE IS: ");
        System.out.println(c);
    }
}