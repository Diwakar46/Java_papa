import java.util.*;

public class Main {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Choose Your Currency");
   System.out.println("1: " +CountriesCurrency.AmericanDollar +"\n"
           + "2: " + CountriesCurrency.KuwatiDinar  +"\n"
           + "3: " +CountriesCurrency.Euro + "\n"
           + "4: " +CountriesCurrency.INDRuppes );

   System.out.println("Choose a number : ");
        int choosen = scanner.nextInt();

   if(choosen <= 4 && choosen != 0){
        System.out.println("Amount : ");}
   else{
       System.out.println("Envalid Number Choosen");

   }
        float amount = scanner.nextFloat();
        switch (choosen){
            case 1:
                CurrencyConverter.americanDollar(amount);
                break;
            case 2:
                CurrencyConverter.KuwatiDinar(amount);
                break;
            case 3:
                CurrencyConverter.Euro(amount);
                break;
            case 4:
                CurrencyConverter.IndianRupee(amount);
                break;
            default:
                System.out.print("Cant convert give a valid amount");

        }


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}