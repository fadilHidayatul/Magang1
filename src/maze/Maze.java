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
public class Maze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f;
        // TODO code application logic here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Masukkan Angka : ");
            f = Integer.parseInt(bf.readLine());
            int n=0;
            if(f%2==0){
                System.out.println("Bilangan yang diinputkan harus ganjil");
            }else if(f<0){
                System.out.println("Bilangan harus positif");
            }else{
                for(int i=0; i<f; i++){
                    for (int j = 0; j < f; j++) {
                        if (i%2!=0 && i!=0) {
                            if(j==0 || j==f-1){
                                System.out.print("@");
                            }else{
                                System.out.print(" ");
                            }
                        }else if(i==0){
                            if(j == 1){
                                System.out.print(" ");
                            }else{
                                System.out.print("@");
                            }
                        }else{
                            if(n%2==0){
                                if(j==f-2){
                                    System.out.print(" ");
                                }else{
                                    System.out.print("@");
                                }
                            }
                            else{                                               //n%2 != 0
                                if(j==1){
                                    System.out.print(" ");
                                }else{
                                    System.out.print("@");
                                }
                            }
                        }
                    }System.out.println("");
                    if(i%2==0 && i!=0){
                        n++;
                    }
                }
               
            }
        } catch (IOException ex) {
            Logger.getLogger(Maze.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
