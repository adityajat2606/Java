import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle");
        Float p = sc.nextFloat();

        System.out.println("Enter rate of intrest");
        Float r = sc.nextFloat();

        System.out.println("Enter time");
        Float t = sc.nextFloat();

        Float si = p * r * t/100;

        System.out.println("principle" +p);
        System.out.println("rate" +r);
        System.out.println("time" +t);

        System.out.println("Simple Interset" +si);




    }
}
