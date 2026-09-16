/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, far, kelvin;
        Scanner captu = new Scanner(System.in);
        //SOLICITAA LOD DATOS AL USUARIO
        System.out.println("INTRODUCE LA TEMPERATURA EN CONTIGRADOS: ");
        temp = captu.nextDouble();
        //HACWER EL CALCULO
        far = (temp * 1.8) + 32;//GRADOS 
        kelvin = temp + 273.15;//KELVIN
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(temp + "grados C = " + far + "grados F");
        System.out.println(temp + "grados C = " + kelvin + "grados k");
        
        
    }
    
}
