import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fraction> list = new ArrayList<>();
        Methods mt = new Methods();
        do {
            System.out.println("1. Add fraction");
            System.out.println("2. Plus");
            System.out.println("3. Minus");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");
            System.out.println("6. Find greatest common divisor");
            System.out.println("7. Check minimal fractions");
            System.out.println("8. Find minimal fractions");
            System.out.println("0. Exit");
            System.out.println("---------------------------------");
            System.out.println("Please input option (1-7) :");
            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 :
                    System.out.println("Input number of fraction :");
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        list.add(mt.inputValue());

                    }
                    break;
                case 2:
                    mt.add(list.get(0), list.get(1) );
                    break;
                case 3:
                    mt.minus(list.get(0), list.get(1) );
                    break;
                case 4:
                    mt.multiply(list.get(0), list.get(1) );
                    break;
                case 5:
                    mt.divide(list.get(0), list.get(1) );

                    break;
                case 6:
                    if(mt.check_minimal_fractions(list.get(0) )){
                        System.out.println(mt.greatest_common_divisor(list.get(0) ));
                    }else{
                        System.out.println("Fraction is minimal");
                    }


                    break;
                case 7:
                    System.out.println(mt.check_minimal_fractions(list.get(0) ));

                    break;
                case 8:
                    mt.Minimal_fractions(list.get(0));

                    break;
                case 0:
                    System.exit(0);

                    break;

            }


        } while (true);
    }
}
