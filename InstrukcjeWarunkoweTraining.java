/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrukcjewarunkowetraining;

/**
 *
 * @author oskar
 */
public class InstrukcjeWarunkoweTraining {

  
    public static void main(String[] args) {
        
        /*
        INTRUKCJE WARUNKOWE
        
        if, else if, else
        
        switch, case, default
        
        
        */
        
        //IF, ELSE IF, ELSE
        
        int a = 7,
            b = 6,
            c = 8;
        
        System.out.println(c - b == a);
        if (a + b == c && a != c)
            System.out.println("wszystko sie zgadza");
        
        if (a < b)
            System.out.println("a < b");
        
        else if (a > b)
        {
            System.out.println("a > b");
            System.out.println("zgdza się");
        }
        
        else
            System.out.println("a = b");
        
        //SWITCH, CASE, DEFAULT
        
        
        int x = 5;
        switch(x){
        
            case 50:
                    System.out.println("x równe 50");
                    break;
            case 100:
                    System.out.println("x równe 100");
                    break;
            default:
                    System.out.println("x nie jest równe 50 ani 100, tylko "+ x);
                    break;  
                  }
        
        //WYRAZENIE WARUNKOWE
        
        
        //int y = 827622362;
        /* 
        if(y % 2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");
        */
       
       // String czyParzysta = y % 2 == 0 ? "parzysta" : "nieparzysta";
        //System.out.println(czyParzysta);
       
        
        //CWICZENIE 
        //SPRAWDZ CZY DANE LICZBY SA PARZYSTE
        
        int liczba1 = 103,
                liczba2 = 56,
                liczba3 = 123,
                liczba4 = 33;
        //1
        if (liczba1 % 2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");
        //2
        String czyParzysta2 = liczba2 % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(czyParzysta2);
        //3
        if (liczba3 % 2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");
        //4
        String czyParzysta4 = liczba4 % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(czyParzysta4);
        
        //UDANE
       
    }
    
}
