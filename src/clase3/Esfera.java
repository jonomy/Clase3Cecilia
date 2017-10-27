/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3Cecilia;

import javax.swing.JOptionPane;

/**
 *
* @author LAB06
 */
public class Esfera 
{
    public static void main (String[]args)
    {
       float radio, volumen;
    final float pi ;//final define una constante 
    //convertimos el string a entero antes de guardarlo 
    radio = Float .parceFloat(JOptionPane.show.InputDialog("Ingrese radio"));
    if (radio>0)
    {
    volumen =(4/3)*PI*(radio*radio*radio);
    JoptionPane.showMessageDialog(null,"El volumen de su esfera es:"+volumen;
}  
    }
   
}