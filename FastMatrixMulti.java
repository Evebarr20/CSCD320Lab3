import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class FastMatrixMulti {
    static int[][] M;
    static int[][] S;

    public static void main(String[] args) throws FileNotFoundException {
       Scanner input = new Scanner(new File(args[0])); // create scanner to open file that user enters as a command parameter
       int count = 0; // create a counter variable
       while(input.hasNextLine()) { //create a while loop that will go through and count each line of the file
            input.nextLine();
            count++;
       }
       input.close(); //close the input scanner
       int[] arrays = new int[count]; //create an integer array that is the same size as the number of lines in the file
       Scanner insert = new Scanner(new File(args[0])); //create a new scanner to reopen the file
        int i = 0; // create another counter variable
       while(insert.hasNextInt()) { // going through to each integer in txt file
            arrays[i++] = insert.nextInt(); // putting every integer into the array
        }
        insert.close(); //close insert scanner
        matrix_chain_order(arrays); //call the matrix_chain_order method
        System.out.println("\n" + print_optimal_parens(S, 0, S.length - 1)); //print and call the print_optimal_parens method
    }

        public static int matrix_chain_order(int[] A) {
            int n = A.length -1; //make n set to array length minus 1
            M = new int [n][n]; //create 2d array m
            S = new int[n][n]; //create 2d array s
            for(int h = 1; h < n; h++) {
                for(int i = 0; i < n - h; i++) {
                    int j = i + h;
                    M[i][j] = Integer.MAX_VALUE; //set to infinity
                    for(int k = i; k < j; k++) {
                        int q = M[i][k] + M[k+1][j] + (A[i] * A[k+1] * A[j+1]);
                        if(q < M[i][j]) {
                            M[i][j] = q;
                            S[i][j] = k;
                        }
                    }
                }
            }
            return M[1][n-1];
        }
        public static int print_optimal_parens(int[][] S, int i, int j) {
            if(i == j) {
                System.out.print("A" + (i +1));
            }
            else {
                System.out.print("(");
                print_optimal_parens(S, i, S[i][j]); //recursive calls
                System.out.print(" ");
                print_optimal_parens(S,S[i][j]+1,j);
                System.out.print(")");
            }
            return M[i][j]; //return M

        }

    }
