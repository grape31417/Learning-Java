package com.company;

public class Main {


        public static void main(String[] args) {
            int[][] cords = {
                    {1, 2, 3},
                    {4, 5, 6}
            };
            for(int x = 0; x < cords.length; x++) {
                for(int y = 0; y < cords[x].length; y++) {
                    System.out.printf("%2d", cords[x][y]);
                }
                System.out.println();
            }

            for(int[] x:cords)//增強FOR迴圈
            {
                for (int y:x)
                    System.out.printf("%2d", y);
                System.out.println();
            }
    }
}
