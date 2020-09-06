/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author Desk-strako
 */
public class Sudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m=9;
        int n=9;
        Scanner in = new Scanner(System.in);
        int mat[][] = new int [m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                //System.out.println("ingresa valor en la posicion: "+i+","+j+":");
                //mat[i][j]=in.nextInt();
                mat[i][j]=0;
            }
        }
        mat[1][4]=9;
        mat[7][4]=9;
        mat[1][6]=9;
        
        for (int i = 0; i < mat.length; i++) {
            if (i==3 || i==6 || i==9) {
                    System.out.println("--------------------------------");
                }
            // -> │ 
            for (int j = 0; j < mat.length; j++) {
                System.out.print("["+mat[i][j]+"]");
                if (j==2 || j==5 || j==8) {
                    System.out.print("│");
                }
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]==9) {
                    System.out.println("La posicion del numero es: "+i+", "+j);
                }
            }
        }
    }
    
}
