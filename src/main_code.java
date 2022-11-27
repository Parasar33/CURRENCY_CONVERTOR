import Datapackage.Database;
import java.util.Scanner;
public class main_code
{
    public static void main(String[] args)
    {
        String Cfrom, Cto;
        double Camount;
        Database Code = new Database();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("WELCOME TO THE CURRENCY CONVERTER");
        System.out.println("Following are the list of Currencies that we convert : \n->dollar\n->euro\n->pound\n->rupee\n->ruble");

        System.out.print("Enter the Currency to convert from : ");
        Cfrom = sc.nextLine();
        System.out.print("Enter the Currency to convert to : ");
        Cto = sc.nextLine();
        System.out.print("Enter the Amount in " + Cfrom + " : ");
        Camount = sc2.nextDouble();
        Code.Currency(Cfrom,Cto,Camount);
        System.out.println("--------------------------------------------- thanks :) ");
    }
}