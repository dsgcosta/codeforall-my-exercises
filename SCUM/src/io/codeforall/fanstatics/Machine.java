package io.codeforall.fanstatics;

import java.sql.SQLOutput;

public class Machine{
    public static void main(String[] args) {
        BiOperation bioperation = ((i1, i2) -> i1 + i2);
        MonoOperation monoOperation = ((i1) -> i1 * i1);

        int biAdd = bioperation.execute(5,5);
        int multiply = monoOperation.execute(5);

        System.out.println(biAdd);
        System.out.println(multiply);
    }




}
