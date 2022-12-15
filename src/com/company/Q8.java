package com.company;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[][] matrix_1 = {{1,1,1}, {2,2,2}, {3,3,3}};
        int[][] matrix_2 = matrix_1.clone();
        int[][] matrix_answer = new int[matrix_1.length][matrix_1.length];

        for (int rows = 0; rows < matrix_1.length; rows++){
            for (int column = 0; column < matrix_1.length; column++ ){
                int answer = 0;
                for (int k = 0; k < matrix_1.length; k++){
                    answer = answer + matrix_1[rows][k]*matrix_2[k][column];
                }
                matrix_answer[rows][column] = answer;
            }
        }

        System.out.println(Arrays.deepToString(matrix_answer));
    }
}
