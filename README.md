# Matrix Chain Multiplication Algorithm

This Java program implements the Matrix Chain Multiplication algorithm, a dynamic programming approach that finds the most efficient way to multiply a sequence of matrices. The algorithm aims to minimize the total number of scalar multiplications required for the matrix multiplication.

## How to Use

1. Make sure you have Java installed on your machine.
2. Clone this repository to your local machine using the following command
3. Create a text file with a sequence of matrix dimensions. Each line should represent a single matrix's dimensions. For example:

    10 20

    20 30

    30 40
4. Run the program with the input text file as a command-line argument
5. The program will read the matrix dimensions from the input file, find the most efficient way to multiply the matrices, and print the optimal parenthesization of matrix multiplication.

## About the Matrix Chain Multiplication Algorithm
The Matrix Chain Multiplication algorithm uses dynamic programming to efficiently find the most optimal way to multiply a sequence of matrices. It builds a table of minimum scalar multiplications needed to multiply sub-matrices and utilizes the information to find the optimal parenthesization.



