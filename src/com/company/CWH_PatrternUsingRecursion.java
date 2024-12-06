package com.company;

public class CWH_PatrternUsingRecursion {

        static void printSpaces(int spaces) {         //   Recursive function to print spaces
            if (spaces == 0) return;
            System.out.print(" ");
            printSpaces(spaces - 1);
        }

        static void printStars(int stars) {            // Recursive function to print stars
            if (stars == 0) return;
            System.out.print("* ");
            printStars(stars - 1);
        }

        static void printPattern(int currentRow, int totalRows) {         // Recursive function to print each row
            if (currentRow == 0) return;

            // Print spaces before stars for each row
            printSpaces(totalRows - currentRow);

            // Print stars for the current row
            printStars(currentRow);

            // Move to the next line after printing stars
            System.out.println();

            // Recursive call for the next row
            printPattern(currentRow - 1, totalRows);
        }

        public static void main(String[] args) {
            int rows = 5; // Change this value to print more rows
            printPattern(rows, rows);
        }
    }
