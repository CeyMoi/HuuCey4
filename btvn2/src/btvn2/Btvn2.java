/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

/**
 *
 * @author Tueminhpc
 */
public class Btvn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] hoten = {
            "To Quang Trung",
            "Hoang Minh Tuan",
            "Nguyen Huu Phuc",
            "Tran An",
            "Tran Truong Giang"
        };
        int[] diem = {4, 6, 3, 5, 2};
        /// dùng bubble sort để sắp xếp
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( j > 0 && diem[j] < diem[j - 1]){
                    int t = diem[j];
                    diem[j] = diem[j - 1];
                    diem[j - 1] = t;
                    String l = hoten[j];
                    hoten[j] = hoten[j-1];
                    hoten[j-1] = l;
                    
                }
            }
        }
        for ( int i = 0 ; i < 5 ; i ++ ) {
            System.out.println(hoten[i] + ": " + diem[i]);
        
        }

    }

}
