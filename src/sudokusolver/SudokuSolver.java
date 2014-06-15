/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Vineet
 */
public class SudokuSolver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fin = new File("config");
        try{
            System.out.println(new SudokuPuzzle(fin).toString());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        
    }
}