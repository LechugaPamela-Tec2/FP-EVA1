/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA1_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI VAMOS A USAR VARIABLES, SE TIENEN QUE DECLARAR ANTES DE USSA
        //DECLARAR --> CREAR LA VARIABLE PARA USO EMN EL PROGRTAMA
        //TIPO_DATO_ NOMBRE_IDENTIFICADO;
        //USAR NOMBRES SIGNIFICATIVOS --> DEBE DECIR PARA QUE SE USA
        String nombre;//DECLARCACION DE LA VARIABLE
         //ENTRADA DE DATOS DEL TECLADO (JAVA)
        Scanner captu = new Scanner(System.in);//otra variable--> captu tipo scanner
        System.out.println("Captura el nombre:");
        //capturar del tecladp y ponerlo en la variavble nombre
        //escribir en ña variable ((poner un valor )asignación 
        nombre = captu.nextLine();
        System.out.println("El valor capturado es:");
        System.out.println(nombre);//uso de la varible--> lectura
        
    }
    
}
