package objstatycznoscpolmetod;

/**
 *
 * @author oskar
 */
public class ObjStatycznoscPolMetod 
{

    
    public static void main(String[] args) 
    {
        //Matematyka test = new Matematyka();  //instancja niepotrzebna ze wzgledu na uzycie static w metodzie
        
        double wynik = Matematyka.dodaj(132.3, 23.43); //mozemy od razu odwolac sie do klasy Matematyka i metody dodaj
        System.out.println(wynik);
        
        System.out.println(Matematyka.PI); //dzieki wpisaniu static do final double PI mozna odwolac sie bezposrednio
        
        
        Klient a = new Klient("Oskar");
        Klient b = new Klient("Diego");
        Klient c = new Klient("Burbon");
        
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        
        System.out.println(Klient.nastepneID);
        
        
    }
    
}
class Matematyka
{
    //final double PI = 3.14; //nie mozna odwolac sie bezposrednio
    static final double PI = 3.14;
    static double dodaj(double a , double b) //dzieki static metoda jest stala istniejaca zawsze
    {
       return(a + b); 
    }
    
}
class Klient
{
    Klient(String imie)
    {
        this.imie = imie;
        id = nastepneID;
        nastepneID++;
    }    
    String imie;
    int id = 1;
    static int nastepneID = 1;
}