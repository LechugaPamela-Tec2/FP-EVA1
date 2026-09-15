/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_2;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA1_5_CAPTURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARAMOS LAS VAARIABLES
        String nombre;
        int edad;
        double salario;
        //scanner
        Scanner captu = new Scanner(System.in);
        //captura
        System.out.println("Captura el nombre del ususario:");
        nombre = captu.nextLine();//lee texto hasta el #ENter#
        System.out.println("Captura la edad:");
        edad = captu.nextInt();
        System.out.println("Captura el salario:");
        salario = captu.nextDouble();
        System.out.println("DATOS CAPTURADOS:");
        System.out.println("Nombre:");
        System.out.println(nombre);
        System.out.println("Edad:");
        System.out.println(edad);
        System.out.println("Salario:");
        System.out.println(salario);
        
        
        
    }
    
}
