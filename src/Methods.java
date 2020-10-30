import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public Fraction inputValue(){
        Fraction fraction = new Fraction();
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input fraction :");
            System.out.println("Please input ts :");
            fraction.setTs(Integer.parseInt(sc.nextLine())) ;
            System.out.println("Please input ms :");
            fraction.setMs(Integer.parseInt(sc.nextLine())) ;
        }while(fraction.getMs() == 0);

        return fraction;
    }

    public boolean check_ms(Fraction fraction) {
        if (fraction.getMs() != 0) return true;
        return false;
    }

    public void display(Fraction fraction) {
        if (fraction.getTs() == 0 || fraction.getMs() == 1) System.out.println(fraction.getTs());
        else {
            System.out.println(fraction.toString());
        }
    }

    public void add(Fraction ps1, Fraction ps2) {
        Fraction fraction = new Fraction();
        fraction.setTs(ps1.getTs() * ps2.getMs() + ps2.getTs() * ps1.getMs());
        fraction.setMs(ps1.getMs() * ps2.getMs());

        display(fraction);
    }

    public void minus(Fraction ps1, Fraction ps2) {
        Fraction fraction = new Fraction();
        fraction.setTs(ps1.getTs() * ps2.getMs() - ps2.getTs() * ps1.getMs());
        fraction.setMs(ps1.getMs() * ps2.getMs());

        display(fraction);
    }

    public void multiply(Fraction ps1, Fraction ps2) {
        Fraction fraction = new Fraction();
        fraction.setTs(ps1.getTs() * ps2.getTs());
        fraction.setMs(ps1.getMs() * ps2.getMs());
        display(fraction);
    }

    public void divide(Fraction ps1, Fraction ps2) {
        Fraction fraction = new Fraction();
        fraction.setTs(ps1.getTs() * ps2.getMs());
        fraction.setMs(ps1.getMs() * ps2.getTs());
        display(fraction);
    }

    public int greatest_common_divisor(Fraction ps) {

         Fraction ps1 = new Fraction();

        while (ps.getTs() != ps.getMs()) {
            if (ps.getTs() > ps.getMs()) {
                ps.setTs(ps.getTs() - ps.getMs());
            } else {
                ps.setMs(ps.getMs() - ps.getTs());
            }
        }
        //if(ps.getTs() != 1) display(ps);

        ps1.setTs(ps.getTs());
        return ps1.getTs();

    }

    public boolean check_minimal_fractions(Fraction ps){
        if(greatest_common_divisor(ps) != 1){
            return true;
        }
        return false;
    }

        public void Minimal_fractions(Fraction ps){
            Fraction ps1 = new Fraction();
            ps1.setTs(ps.getTs());
            ps1.setMs(ps.getMs());
            int Greatest_common_divisor1 = greatest_common_divisor(ps);

            if(Greatest_common_divisor1 !=1){
                ps1.setTs(ps1.getTs() / Greatest_common_divisor1);
                ps1.setMs(ps1.getMs() / Greatest_common_divisor1);

               display(ps1);
            }else{
                System.out.println("Fraction is minimal >>");
            }



        }


    }

