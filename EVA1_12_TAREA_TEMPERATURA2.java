/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_tarea_temperatura2;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA1_12_TAREA_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //KELVIN A LAS OTRAS ESCALAS
         double cel, kelvin, far;
        Scanner captu = new Scanner(System.in);
         System.out.println("CAPTURA LOS GRADOS FAHRENHEIT: ");
         kelvin = captu.nextDouble();
         //CONVERSION
         cel = (kelvin - 32) / 1.8;//SI  IMPORTA EL PARENTESIS 
        far = (kelvin - 32) * (5/9.0) + 273.15;//OJO: 9 DA CERO, 5/9.0 DA 0.5
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(far + "grados F = " + cel + "grados C");
        System.out.println(far + "grados F = " + kelvin + "grados K");
    }
    
}
