package practicequestions_set_2;

import practicequestions_set_1.CheckPerfectNumber_20;

import java.util.Scanner;

public class PerfectNosLimit_10 {

    public static void main(String[] args) {
        int range = 30, count = 0;

        for (int i = 2; i <= range; i++) { //1 is not a perfect number hence starting the loop from 2
            if (CheckPerfectNumber_20.isPerfect(i)) {
                //System.out.println(i);
                count++;
            }
        }

        System.out.println("Count of Perfect number till " + range + " is :" + count);
    }
}
