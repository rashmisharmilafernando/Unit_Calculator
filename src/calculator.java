import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\t\t***************");
            System.out.println("\t\tUNIT CALCULATOR\t\t\t\t");
            System.out.println("\t\t***************");
            System.out.println();
            System.out.println("1. Meter to centimerter \n2. Liter t0 milliliter\n3. feet to inches\n4. Gigabyte to megabyte\n");
            //options  in unit calculator
            System.out.print("Enter an option to continue : ");    //Enter the  option 1 number
            int option = input.nextInt();
            System.out.println();
            final int exit = 0; //value cannot be changed
            //--------------------option 1--------------------------------------

            if (option == 1) {
                System.out.print("Enter value in metre : ");
                double m = input.nextDouble(); // Enter the number
                double cm = m * 100; //Conversion FormulaCentimeters=metres*100
                System.out.println("Answer is : " + (int) cm + "cm\n");
                //narrow casting( assign int to double)
                System.out.print("[ Enter 0 to exit ] ");
                int e = input.nextInt();
                //int exit=0;
                if (e == 0) {
                    cls();  // clear method
                }
//--------------------option 2--------------------------------------

            } else if (option == 2) {
                System.out.print("Enter value in liter : ");
                double l = input.nextDouble(); // Enter the number
                double ml = l * 1000; //Conversion FormulaMilliters=Litres*1000
                System.out.println("Answer is : " + (int) ml + "ml\n");
                //narrow casting( assign int to double)

                System.out.print("[ Enter 0 to exit ] ");
                int e = input.nextInt();//int exit=0;
                if (e == 0) {
                    cls();    // clear method
                }

//--------------------option 3--------------------------------------
            } else if (option == 3) {
                System.out.print("Enter value in Steps : ");
                double f = input.nextDouble(); // Enter the number
                double inches = f * 12; //Conversion FormulaInches=Feet*12
                System.out.println("Answer is :   " + (int) inches + "inches\n"); //narrow casting (
//narrow casting( assign int to double)

                System.out.print("[ Enter 0 to exit ] ");
                int e = input.nextInt();
                //int exit=0;
                if (e == 0) {
                    cls();    // clear method
                }
                //--------------------option 4--------------------------------------

            } else if (option == 4) {
                System.out.print("Enter value in Gigabyte : ");
                int gb = input.nextInt(); // Enter the number
                int mb = gb * 1024; //Conversion FormulaMegaByte=Gigabyte*1024
                System.out.println("Answer is : " + mb + "MB");
                System.out.print("[ Enter 0 to exit ] ");
                int e = input.nextInt();
                //int exit=0;
                if (e == 0) {
                    cls();    // clear method
                }
            }
        }

    }

    public static void cls() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
// Handle any exceptions.

        }
    }
}
