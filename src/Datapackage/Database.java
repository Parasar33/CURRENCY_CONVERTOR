package Datapackage;
import java.util.Objects;

public class Database
{
        float unit;
        public void Currency(String type1,String type2, Double n)
        {
            if (Objects.equals(type1, "dollar"))
            {
                unit = 1;
            }
            else if (Objects.equals(type1, "euro"))
            {
                unit = 1.00675f;
            }
            else if (Objects.equals(type1, "rupee"))
            {
                unit = 81.82f;
            }
            else if (Objects.equals(type1, "pound"))
            {
                unit = 0.878764f;
            }
            else if (Objects.equals(type1, "ruble"))
            {
                unit = 61.625f;
            }

            switch (type2)
            {
                case "euro" :
                {
                    System.out.println("Value in Euro : "+(1.00675f*n)/unit + " €");//Euro Copied from google
                    break;
                }case "rupee" :
                {
                    System.out.println("Value in Rupee : "+(81.82f*n)/unit + " ₹");//ctrl+alt+4
                    break;
                }
                case "pound" :
                {
                    System.out.println("Value in Pound : "+(0.878764f*n)/unit + " £");//alt+0163
                    break;
                }
                case "ruble" :
                {
                    System.out.println("Value in Ruble : "+(61.625f*n)/unit + " ₽");//Ruble Copied from google
                    break;
                }case "dollar" :
                {
                    System.out.println("Value in Dollar : "+(1.000f*n)/unit + " $");//shift+4
                }
                default :
                    System.out.println("Choose Correct Currency");
            }
        }
}
