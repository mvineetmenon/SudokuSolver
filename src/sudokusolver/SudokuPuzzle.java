/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Vineet
 */
public class SudokuPuzzle {

    private int[][] sudoku = new int[9][9];

    /**
     * Reads the configFile and configures the initializes the SudokuSOlver.
     *
     * @param configFile
     */
    public SudokuPuzzle(File configFile) throws FileNotFoundException {
        BufferedReader fin = new BufferedReader(new FileReader(configFile));
        try {
            String fileLine = fin.readLine();
            do {
                //fileLine is of the form x;y;v  : where x is row number, y is col number and v is value at that cordinate 
                //x and y starts at 1 not 0
                String[] param = fileLine.split(";");
                sudoku[Integer.parseInt(param[0]) + 1][Integer.parseInt(param[1]) + 1] = Integer.parseInt(param[2]);
                fileLine = fin.readLine();
            } while (fileLine != null);
        } catch (IOException | NumberFormatException e) {
            //e.printStackTrace();
            System.err.println(e + "Something wicked happened in Reading ConfigFile");
        }
    }

    @Override
    public String toString() {
        String outputString = "The state of te puzzle is \n";
        for (int[] row : sudoku) {
            for (int cell : row) {
                outputString += cell + "\t";
            }
            outputString += '\n';
        }
        return outputString;
    }
}
