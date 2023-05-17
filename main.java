import java.math.BigInteger;

/**
 * Beschreiben Sie hier die Klasse main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class main
{
    public static void main(String args[])
    {
        int obereGrenze = 50;
        int summe = 0;
        for(int i = 0; i <= obereGrenze; i++)
        {
            summe += i;
        }
        
        BigInteger multi = new BigInteger("1");
        for(int i = 2; i <= obereGrenze; i++)
        {
            multi = multi.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Summe: " + summe + "\n" + "Multiplikation: " + multi);
    }
}
