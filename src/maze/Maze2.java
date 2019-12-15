/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Maze2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f;
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
             
        try {
            System.out.println("Masukkan Ukuran : ");
            f = Integer.parseInt(bf.readLine());
            
            if(f%2==0){
                System.out.println("Nilai Tidak Boleh Genap");
            }else{
                for (int i = 0; i < f; i++) {
                    for (int j = 0; j < f; j++) {
                        if(i%2==0){
                            
                        }

                    }System.out.println("");
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Maze2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
