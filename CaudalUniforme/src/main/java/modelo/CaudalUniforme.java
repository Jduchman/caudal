/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package modelo;

import java.util.Scanner;
/**
 *
 * @author Duchman
 */
public class CaudalUniforme {

    public static void main(String[] args) {

        
        Trapezoide tr = new Trapezoide((float) 0.48,(float)  0.013 ,(float)  0.045 ,(float) 0, (float) 0.75);
        tr.calcularTirante();
        tr.calcularArea();
        tr.calcularPerimetro();
        tr.calcularRadioHidraulico();
        tr.calcularVelocidad();
        System.out.println(tr.getTirante());
        System.out.println(tr.getPerimetro());
        System.out.println(tr.getArea());
        System.out.println(tr.getRadioHidraulico());
        System.out.println(tr.getVelocidad());
    }
    
    //ta bien
}
