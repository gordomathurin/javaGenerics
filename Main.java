package com.gordon_workspace;


public class Main {
    public static void main(String[] args) {

        int checkingElementPosition = Routine.findElementPosition(new Integer[] {1,2,3,4,5,6}, 4);
        int checkingGreaterThan = Routine.greaterThan(100000, 102020);

        System.out.println(checkingGreaterThan);
        System.out.println(checkingElementPosition);


    }
}
