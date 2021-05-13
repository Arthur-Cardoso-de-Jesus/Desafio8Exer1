/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasafio8exer1;

import java.text.DecimalFormat;

/**
 *
 * @author Arthur Cardoso de Jesus
 */
public class Dasafio8Exer1 {

    
    public static void main(String[] args) {
        double chico, ze, anos;
        chico = 1.50;
        ze = 1.10;
        anos = 0;
        DecimalFormat f=new DecimalFormat("0.00");
        while (chico >= ze) {
            chico = chico + 0.02;
            ze = ze + 0.03;
            anos++;

        }
        System.out.println("Foram "+anos+" anos para zé alcançar chico!");
        System.out.println("Chico terminou com "+f.format(chico)+" de altura");
        System.out.println("zé terminou com "+f.format(ze)+" de altura");
    }

}
