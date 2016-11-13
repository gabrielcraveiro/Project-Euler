/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p004.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Gabriell
 */
public class P0042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listaDePalindromes = new ArrayList();
        int temp = 0;
        int tempMaiorInt = 0;
        
        
        for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                temp = i * j;
                if (temp == reverterInt(temp)) {
                    listaDePalindromes.add(temp);
                }

            }
        }

        for (Integer procurarInt : listaDePalindromes) {
            if (procurarInt.intValue() >= tempMaiorInt) {
                tempMaiorInt = procurarInt.intValue();
            }
        }
        System.out.println(tempMaiorInt);
    }

    public static int reverterInt(int value) {
        int numeroReverso = 0;
        int temp = 0;

        while (value > 0) {
            temp = value % 10;
            numeroReverso = numeroReverso * 10 + temp;
            value = value / 10;

        }
        return numeroReverso;
    }

}
