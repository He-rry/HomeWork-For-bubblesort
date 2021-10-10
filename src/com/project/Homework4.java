package com.project;

public class Homework4 {
    public static void main(String[] args) {
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= 7; col++) {
                if (row == 1 || row == 7 || col == 1 || col == 7 || row ==7-3 && col==7-1 ||
                        row==col-6 && col==7-1|| row==col-6 && col==7-6 ) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
