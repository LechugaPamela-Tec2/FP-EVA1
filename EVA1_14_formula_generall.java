/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_generall;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA1_14_formula_generall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //DECLAR
        //CAPTURAR
        //CALCULAR
        //MOSTRAR RESULTADOS
        //DECLAR
        double a,b,c,x1,x2;
        Scanner captu = new Scanner(System.in);
        //
        System.out.println("COLOCA EL VALOR EN LA A: ");
        a = captu.nextDouble();
        System.out.println("COLOCA EL VALOR EN LA B: ");
        b = captu.nextDouble();
        System.out.println("COLOCA EL VALOR EN LA C: ");
        c = captu.nextDouble();
        
        x1 = (-1 * b + Math.sqrt(( b * b) - (4 * a * c))) / (2 * a);
        x2 = (-1 * b - Math.sqrt(( b * b) - (4 * a * c))) / (2 * a);
        
        //MOSTRAR RESULATADOS
        System.out.println("RAIZ 1 = " + x1);
        System.out.println("RAIZ 2 = " + x2);
        
        
     
    }
    
}
