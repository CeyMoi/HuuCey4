/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import java.util.Arrays;

/**
 *
 * @author Tueminhpc
 */
public class Btvn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {2, 1, 3};
        int[] B = {9, 5, 6};
        int al = A.length;
        int bl = B.length;
        int[] C = new int[al + bl];

        System.arraycopy(A, 0, C, 0, bl);
        System.arraycopy(B, 0, C, al, bl);
        System.out.println("hợp thể hai mảng A và B là: " + Arrays.toString(C));

        for (int k = 0; k < C.length; k++) {
            for (int i = 0; i < C.length - 1 - k; i++) {
                if (C[i] > C[i + 1]) {
                    int t = C[i];
                    C[i] = C[i + 1];
                    C[i + 1] = t;

                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + "; "); /// đây là sắp xếp lại cái mảng C vừa đc hợp thể bởi A và B 
        }

    }

}
