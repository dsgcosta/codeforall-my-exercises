package io.codeforall.bootcamp;

public class ClosestNeighbours {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};

        int diff = Integer.MAX_VALUE;
        int[] neighbours = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int neighboursDiff = Math.abs(numbers[i] - numbers [i + 1]);
            if(neighboursDiff < diff){
                diff = neighboursDiff;
                neighbours[0] = numbers[i];
                neighbours[1] = numbers[i + 1];
            }
        }
        System.out.println("the closest neighbours are: " + neighbours[0] + " " + neighbours[1]);
    }
}

        /*

        for (int i = 0; i < numbers.length - 1; i++) {
            int sum = numbers[i] - numbers[i + 1];
            System.out.println(numbers[i] + " - " + numbers[i + 1] + " = " + Math.abs(sum));
            if (Math.abs(sum) < 2) {

            System.out.println("closest neighbours:  " + numbers[i] + " " + numbers[i + 1]);
            }
        }
        */



