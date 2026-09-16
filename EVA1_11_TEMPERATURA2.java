/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA1_11_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cel, kelvin, far;
        Scanner captu = new Scanner(System.in);
         System.out.println("CAPTURA LOS GRADOS FAHRENHEIT: ");
         far = captu.nextDouble();
         //CONVERSION
         cel = (far - 32) / 1.8;//SI  IMPORTA EL PARENTESIS 
        kelvin = (far - 32) * (5/9.0) + 273.15;//OJO: 9 DA CERO, 5/9.0 DA 0.5
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(far + "grados F = " + cel + "grados C");
        System.out.println(far + "grados F = " + kelvin + "grados K");
        
    }
    
}
