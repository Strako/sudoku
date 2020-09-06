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
    public static int[][] rellenaMat(int mat[][]){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                //System.out.println("ingresa valor en la posicion: "+i+","+j+":");
                //mat[i][j]=in.nextInt();
                mat[i][j]=0;
            }
        }
        return mat;
    }
    public static boolean busqueda(int mat[][]){
        boolean res=false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                int [] valor =new int[9];
                if (mat[i][j]>0) {
                    valor[0]=mat[i][j];
                    valor[1]=i;
                    valor[2]=j;
                    System.out.println("el valor guardado es: "+mat[i][j]+", "+i+", "+j);
                }
            }
        }
        return res;
    }

    public static void imprime(int mat[][]){
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
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m=9;
        int n=9;
        
        int mat[][] = new int [m][n];
        rellenaMat(mat);
        mat[1][4]=9;
        //mat[7][4]=9;
        //mat[1][6]=9;
        busqueda(mat);
        
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]==9) {
                    int valor = mat[i][j];
                    System.out.println("La posicion del numero es: "+i+", "+j);
                }
            }
        }
    }
    
}
