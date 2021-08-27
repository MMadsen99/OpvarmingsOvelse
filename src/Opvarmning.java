import java.util.ArrayList;
import java.util.Scanner;

public class Opvarmning {

    public static void main(String[] args) {
        Opvarmingsovelse();
    }
    public static void Opvarmingsovelse(){
        System.out.println("Hej med dig!");
        System.out.println("hvis du ville stoppe skriv stop");
        System.out.println("Indtast et tal: ");

        Scanner s = new Scanner(System.in);

        int tal = s.nextInt();
        int antalTalIndtastet = 0;
        int sum = 0;
        int gennemsnitEfterXTal;
        String stop;

        antalTalIndtastet++;
        sum += tal;

        for (int i = 0; i < 10; i--) {

            System.out.println("indtast endnu et tal: ");
            tal = s.nextInt();
            antalTalIndtastet++;
            sum += tal;


            gennemsnitEfterXTal = sum / antalTalIndtastet;
            System.out.println("Gennemsnittet er de indtastede tal er:  " + gennemsnitEfterXTal);


            System.out.println("Hvis du ville stoppe indtast Q ellers indtast et andet bogstav");
            stop = s.next();
            // System.out.println(stop);
            if (stop.equals("q")|| stop.equals("Q")) break;
            else System.out.println("Du indtastede ikke Q, så programmet forsætter");
        }
    }
}
