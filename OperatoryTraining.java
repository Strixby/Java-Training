
package operatorytraining;

import static java.util.function.Predicate.not;

public class OperatoryTraining {

   
    public static void main(String[] args) {
        
      /*
        OPERATORY ARYTMETYCZNE
        
            + dodawanie liczb
            , łączenie stringów
            - odejmowanie
            * mnożenie
            / dzielenie
            = przypisanie wartości

            a = a + 2 to inaczej a += 2 

            a = a - 7 to inaczej a -= 7 

            a = a / 4 to inaczej a /= 4

            a = a * 3 to inaczej a *= 3

            %
            reszta z dzielenia
            (dzielenie modulo)

            ++
            INKREMENTACJA (powiększ o 1)

            --
            DEKREMENTACJA (zmniejsz o 1)

            y++
            POST inkrementacja

            y--
            POST dekrementacja

            ++y
            PRE inkrementacja

            --y
            PRE dekrementacja
        */  
      
      
        int a = 5;
        a += 2;
        
        int b = 3;
        b++;
        
            System.out.println(a + " " + b);
        
        int c = 6;
        
        int d = 8;
         --d;
            
            System.out.println(++c);
            System.out.println(d);
            
            
            /*
            OPERATORY RELACYJNE (PORÓWNYWANIE)
            
                >     większe od 
                <     mniejsze od
                >=   większe bądź równe
                <=   mniejsze bądź równe
                ==   równe 
                !=    nierówne 
    
            */
            boolean isTrue = 4 == 8;
            
            System.out.println(isTrue);
            
            System.out.println(1 != 2);
            
            
            /*
            OPERATORY LOGICZNE
            
                 true false
                 ! - negacji (czy obie strony są różne) np if (!(a == b))
                 && - koniunkcja w polskim znaczeniu "i"
                 || - alternatywa polskim znaczeniu "lub" 
    
            */
            
            int e = 5,
                f = 5,
                g = 9;
            
            if (e == f)
                System.out.println("to jest równe to");
            if (e < g && g > f)
                System.out.println("koniunkcja sie zgadza");
            if (e < 0 || g > 5)
                System.out.println("alternatywa sie zgadza");
            
            
            /*
            OPERATORY BITOWE
            
             
            */
        
    }
    
}
