/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petletraining;

/**
 *
 * @author oskar
 */
public class PetleTraining {

    
    public static void main(String[] args) {
        
/*
WHILE, DO WHILE

while - warunek jest sprawdzany na samym początku
do while - warunek nie musi byc sprawdzany na poczatku
*/
        
        String[] samochody =
        {
        "VolksWagen", 
            "BMW",
            "Toyota",
            "Mercedes",
            "Ford",
            "Jaguar"
        };
        int s = 0;
        while(s < samochody.length)
        {
            System.out.println(samochody[s]);
            s++;
        }
        
//         do
//        {
//            System.out.println(samochody[i]);
//            i++;
//        }
//        while(i < samochody.length);
        

//Zadanie - tablica 10 elementowa od 10-100

int[] tablica = {10, 20, 30 ,40 ,50, 60 ,70 ,80, 90 ,100};

        int t = 0;
        while(t < tablica.length)
        {
            System.out.println(tablica[t]);
            t++;
        }
    
/*
FOR
    for (inicjalizacja zmiennych; warunek pętli; co ma się stać po wykonaniu instrukcji)

*/
        for(t = 0; t < tablica.length; t++)
        {
            System.out.println(tablica[t]);
        }
        
/*
ENHANCED FOR
         for ( typ tablicy nazwa zmiennej, która będzie przechowywać wartości przy każdym przejściu pętli: nazwa tablicy po której chcemy przejść)
*/
        for(String samochodyMarki: samochody)
        {
            System.out.println(samochodyMarki);
        }
        
/*
PĘTLE W PĘTLACH
*/
        for(int j = 0; j <= 10; j++) //tabliczka mnożenia 10x10
            {
                for(int i = 0; i <= 10; i++)
                {
                    System.out.print(i * j + " ");
                }
                System.out.println();
            }

    
/*
    BREAK, CONTINUE
*/
        for(int x = 0; x < 10; x++)
        {
            if(x % 2 != 0)
                continue;
            System.out.println(x);
        }
    
/*
       CWICZENIE WYPISZ COD RUGI WIERSZ Z ATBLICZKI MNOZENIA 
*/
        for(int b = 1; b <= 10; b++) 
            {
                for(int a = 1; a <= 10; a++)
                {
                    if(b % 2 != 0)
                        continue;
                    System.out.print(a * b + " ");
                    
                }
                System.out.println();
            }
        
        //DODAWANIE WSZYSTKICH LICZB W NAWIASIE
        int [] liczby = {1, 12, 41, 51, 12};
        
           int suma = 0;
          
           for (int i = 0; i < liczby.length; i++)
           { 
               suma = suma + liczby[i];
           }

           System.out.println(suma);
    
    }
    
}
