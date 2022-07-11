/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablicetraining;

/**
 *
 * @author oskar
 */
public class TabliceTraining {

    public static void main(String[] args) {
        
        
        //TABLICE JEDNOWYMIAROWE
        //--------------------------------------------------------------------------
        
        /*
        tab = new int[5] - tak wygląda ta tablica
        ----------------------------------
        tab[0] tab[1] tab[2] tab[3] tab[4]
        
        ----------------------------------
        */
        
        int[] tab = new int[5];
        
       // tab = new int[5];
        
        tab[0] = 20;    
        tab[1] = 7;
        tab[2] = 27;
        tab[3] = 15;
        tab[4] = 77;
            System.out.println(tab[0]);
        
            
        int[] tab1 = {10, 20, 42, 67, 9};
            System.out.println(tab1.length); //dlugosc tablicy
            System.out.println(tab1[tab1.length - 1]); //odwolanie do ostatniego elementu tablicy
            
            
            //TABLICE WIELOWYMIAROWE
            //---------------------------------------------------------------------------------
            
            /*
            ----------------------------
            [0][0]  [0][1] [0][2] [0][3]
            ----------------------------
            ----------------------------
            [1][0]  [1][1] [1][2] [1][3] 
            ----------------------------
            ----------------------------
            [2][0]  [2][1] [2][2] [2][3]  
            ----------------------------
            ----------------------------
            [3][0]  [3][1] [3][2] [3][3] 
            ----------------------------
            */
            
            int[][] tab2 = new int[4][4]; 
            
            tab2 [0][3] = 21;
            tab2 [3][2] = 34;
                System.out.println(tab2[3][2]);
                
                
                int[][] tab3 = 
                {
                        {32, 43, 56},
                        {320, 430, 560},
                        {3200, 4300, 5600}
                };
                System.out.println(tab3[1][1]);
    }
    
}
