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
    //int mat[][] = new int [9][9];
    int [][] mat={{5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}};
    public void imprime(int mat[][]){
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
    
    public boolean posible(int mat[][],int x, int y,int n){
        for (int i = 0; i < mat.length; i++) {
            if (mat[x][i]==n) {
                return false;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][y]==n) {
                return false;
            }
        }
        int x0 = (x/3);
        int y0 = (y/3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[(x0*3)+i][(y0*3)+j]==n) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void resolver(){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]==0) {
                    for (int k = 1; k < 10; k++) {
                        if (posible(mat, i, j, k)) {
                            mat[i][j]=k;
                            resolver();
                            mat[i][j]=0;
                        }
                    }
                }
            }
        }
        imprime(mat);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sudoku sudoku = new Sudoku();
        sudoku.imprime(sudoku.mat);
        System.out.println("resolviendo");
        sudoku.resolver();
        System.out.println("resuelto");
        //System.out.println(sudoku.posible(mat, 4, 4, 5));
        //System.out.println(sudoku.posible(mat, 4, 4, 3));
        // TODO code application logic here
    }
    
}

