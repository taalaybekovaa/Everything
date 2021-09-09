package Loops;

public class NestedPractice {

    public static void main(String[] args) {

        /*print the months for the every year for the years from 2020 to 2023

        2020

        1,2,3,......12

        2021
        1,2,3,......12

      2022

      1, 2, 3 ........12

      2023
      1,2,3,4,.........12

         */

        for (int a = 0;a<12; a++ ){
            for (int b=0; b<12; b++){
                for(int c=0; c<12; c++){
                    System.out.print("2020" +a);
                }

            }
        }

    }
}
