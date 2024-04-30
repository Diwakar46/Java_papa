public class CurrencyConverter {

    static void americanDollar(float amount){
        final double INR = 83.32; //These final value are just for USD
        final double Euro = 0.93;
        final double Dinar = 0.31;
    System.out.println( "$ " + amount + " in " + "Euro = " + amount*Euro + "€"
    + "\n"  + "Ruppee = " + amount*INR  + "INR" + "\n"  + "Dinar = " + amount*Dinar  + "KuwatiDinar"
    );

    }
    static void Euro(float amount){
        final double INR = 89.45;
        final double USD = 1.07;
        final double Dinar = 0.33;
        System.out.println( "Euro " + amount + " in " + "USD = " + amount*USD + "$"
                + "\n"  + "Ruppee = " + amount*INR  + "INR" + "\n"  + "Dinar = " + amount*Dinar  + "KuwatiDinar"
        );

    }
    static void IndianRupee(float amount){
        final double USD = 0.012;
        final double Euro = 0.011 ;
        final double Dinar = 0.0037;
        System.out.println( "INR " + amount + " in " + "USD = " + amount*USD + "$"
                + "\n"  + "Euro = " + amount*Euro  + "€" + "\n"  + "Dinar = " + amount*Dinar  + "SerbianDinar"
        );

    }
    static void KuwatiDinar(float amount){
        final double USD = 3.25;
        final double Euro = 3.03 ;
        final double INR = 270.78 ;
        System.out.println( "KuwatiDinar " + amount + " in " + "USD = " + amount*USD + "$"
                + "\n"  + "Euro = " + amount*Euro  + "€" + "\n"  + "Dinar = " + amount*INR  + "SerbianDinar"
        );

    }

}
