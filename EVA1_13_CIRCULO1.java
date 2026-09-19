/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo1;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA1_13_CIRCULO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //AREA, PERIMETRO, VOLUMEN
        //PREGUNTAR DATOS, CALCULAR, MOSTRAR RESULTADOS 
        double peri, area, volu,radio;
         Scanner captu = new Scanner(System.in);
         System.out.println("INTRODUCE EL RADIO EN EL CIRCULO");
         radio = captu.nextDouble();

         peri = (2 * 3.1415 * radio);
         area = 3.1415 * (radio * radio);
         volu = (4/3.0) * 3.1415 * (radio * radio * radio);
         System.out.println(radio + " r = " + peri + "peri ");
         System.out.println(radio + " r = " + area + "area");
         System.out.println(radio + " r = " + volu + "volu");
    }
    
}
