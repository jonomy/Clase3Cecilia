/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3; 
import java.util.Scanner;

/**
 *
 * @author LAB06
 */
public class inpuesto 
{
            public static void main(String[] args)   
             {
                 int sueldo;
                 Scanner escaner = new Scanner(System.in);
                 System.out.println("Ingrese su salario:");
                 sueldo = escaner.nextInt();
                 if(sueldo>600000)
                 {
                     System.out.println("Debe pagar impuesto");
                 }  
                     
          
             }                 
}
