package com.gordon_workspace;

public class Routine {

    public static int positionOfElement;

    public static <T> int findElementPosition(T array[], T element) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                positionOfElement =  i;
            }
        }
        return positionOfElement;
    }

    public static <V extends Number> V greaterThan(V num1, V num2) {
        if (num1.intValue() > num2.intValue()) {
            return num1;
        } else {
            return num2;
        }
    }

}
