// Tic Tac Toe - Assignment 7 (Apr.2.2025)
import java.util.Scanner;

public class TicTacToe {
   
    public static void gridPrint(int row, int col, char[][] grid){
        for (row = 0; row < grid.length; row++) {
            for (col = 0; col < grid[row].length; col++) {
                System.out.println(grid[row][col] + " | ");
            }
        }
    }
     
    
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        char[][] grid = new char[3][3];
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
            grid[row][col] = ' ';
            }
        }
        gridPrint(0, 0, grid);
    
    }
}
// grid
// player's turn
// look for wins 