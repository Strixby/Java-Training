package training;

import java.io.PrintStream;



//ZMIENNE

/*
CTRL + S (save) - zapisanie pliku

CTRL + C (copy) - kopiowanie
CTRL + V - wklejenie

CTRL + X - wycięcie 

CTRL + Z - cofnięcie tego co przed chwilą zrobiliśmy
CTRL + Y - cofnięcie cofnięcia ^^

CTRL + F (find) szukanie w pliku

CTRL + backspace - usuwanie pojedynczego poprzedniego wyrazu

TAB - wcięcie
SHIFT + TAB - cofnięcie wcięcia

END / HOME - przeskoczenie na koniec / początek linii

CTRL + A (all) - zaznaczenie całego pliku

SHIFT + END / SHIFT + HOME - zaznaczenie całej linii do końca / zaznaczenie całej linii do początku

SHIFT + STRZAŁKI góra i dół - zaznaczenie całej linii
SHIFT + STRZAŁKI lewa/prawa - zaznaczenie literki w lewo i w prawo

CTRL + SHIFT + strzałki lewa/prawa - zaznaczenie lewa/prawa całego słowa
CTRL + SHIFT + strzałka w dół / górę - skopiowanie całej linii w dół

CTRL + HOME - przeskoczenie na początek pliku
CTRL + END - przeskoczenie na koniec pliku

CTRL + SHIFT + HOME - zaznaczenie całej treści od zaznaczenie do jego początku
CTRL + SHIFT + END -- zaznaczenie całej treści od zaznaczenie do końca 
*/



public class zmienneTraining {

    public static void main(String[] args) {
        
  /*
ZMIENNE

ZMIENNE CAŁKOWITE

int = 32 bity = integer liczby całkowite
long = 64 bity = liczby o zakresie do 2^63 - 1
byte = 8 bitów = -128 do 127 
short = 16 bitów = -32,768 do 32.767 

ZMIENNE ZMIENNOPRZECINKOWE

float = 32 bity
double = 64 bity wiekszy precyzja UZYWAJ TEGO

Ciągi znaków

char = 2 bajty = 1 znak np. ('A') 
String = zmienne tekstowe



*/
   
 
        long Long = 1342151532521L;
        
        int a = 5;
        int b = 6;
        
        double c = 8.2;
        double d;
        
        final double LICZBA_PI = 3.14;
        
        d = a + b + c;
        
            System.out.println(d);
        
        if (a == 5) 
            System.out.println("Siemano kocury");
        
        
        
        String imie = "Oskar";
        String nazwisko = "Boniakowski";
        int wiek = 21;
        char prawoJazdy = 'B';
        String daneOsobowe = imie + " " + nazwisko + " " + wiek + " " + prawoJazdy;
        
        imie = "Oski";
        
            System.out.println(daneOsobowe);

            
            //RZUTOWANIE ZMIENNYCH
            
            
            int x = 5;
            int y = 2;
            
            System.out.println(x / y); //wyjdzie liczba całkowita int
            System.out.println((double) x / y); //wyjdzie dokladny wynik double
            
           
    }
    
}


