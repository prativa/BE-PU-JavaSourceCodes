import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter String : ");
        String stringDataType = input.nextLine();
        System.out.printf("Entered string type %s%n",stringDataType);

        System.out.println("Enter integer : ");
        int intDataType = input.nextInt();
        System.out.println("Enter char");
        char charDataType = input.next().charAt(0);
        System.out.println("Enter boolean : ");
        boolean booleanDataType = input.nextBoolean();
        System.out.println("Enter long");
        long longDataType = input.nextLong();
        float floatDataType = input.nextFloat();
        double doubleDataType = input.nextDouble();





    }
}