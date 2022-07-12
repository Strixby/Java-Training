/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objmetody;

/**
 *
 * @author oskar
 */
public class ObjMetody 
{

    
    public static void main(String[] args) 
    {
        
        Godność a = new Godność();
        a.wypisz("Oskar", "Boniakowski");
        
        int wynikDodawania = a.dodawanie(18, 3);
        System.out.println(wynikDodawania);
        
        double wynikDzielenia = a.dzielenie(7, 3);
        System.out.println(wynikDzielenia);
        
        double wynik = a.dodawanie(2.34, 3.13); //int/double metoda musi zostac przeciazona zeby zadzialala
                                                //linijka 47
        System.out.println(wynik);
    }                                       
    
}



class Godność
    {
        void wypisz(String imie, String nazwisko) //tworzenie nowej metody
            {
                System.out.println("imie: " + imie);
                System.out.println("nazwisko: " + nazwisko);
            }
        
        
        int dodawanie(int a, int b)//tworzenie metody na dodawanie
            {
                return a + b;  
            }
        double dodawanie(double a, double b)//powielenie metody z dodawaniem tylko ze double
            {                               //program w linijce 27 automatycznie skorzysta z metody z doublem przez wpisany double
                return a + b;
                
            }
        
        
        double dzielenie(double a, double b)
            {
                if (b == 0)
                {
                    System.out.println("nie dzielimy przez 0");
                    return 0;
                }
                return a / b;
            }
    }