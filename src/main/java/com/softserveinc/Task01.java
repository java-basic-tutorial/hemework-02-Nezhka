package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
                              //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = { -1.7, -1.0, 2.6,  9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9,  1.4 };
        double sum = 0;
        for (int i = 0; i < temperature.length; i++) {
            sum = sum+temperature[i];
        }
        double average = sum/temperature.length;
        System.out.println("Average annual temperature: " + average);
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > temperature[maxIndex]){
                maxIndex = i;
            } else if (temperature[i] < temperature[minIndex]){
                minIndex = i;
            }
        }
        int[] monthIndex = {minIndex, maxIndex};
        String[] descriptions = {"Month with the lowest temperature in a year: ", "The month with the highest temperatures in a year: "};
        for (int i = 0; i < monthIndex.length; i++) {
            String month = null;
            switch (monthIndex[i]){
                case 0: month = "I";
                    break;
                case 1: month = "II";
                    break;
                case 2: month = "III";
                    break;
                case 3: month = "IV";
                    break;
                case 4: month = "V";
                    break;
                case 5: month = "VI";
                    break;
                case 6: month = "VII";
                    break;
                case 7: month = "VIII";
                    break;
                case 8: month = "IX";
                    break;
                case 9: month = "X";
                    break;
                case 10: month = "XI";
                    break;
                case 11: month = "XII";
            }
            System.out.println(descriptions[i] + month);
        }
    }
}
