
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
        int summe = 0;
        for(int i = 0; i <= 10; i++)
        {
            summe += i;
        }
        
        int multi = 1;
        for(int i = 2; i <= 10; i++)
        {
            multi *= i;
        }
        
        System.out.println("Summe: " + summe + "\n" + "Multiplikation: " + multi);
    }
}
