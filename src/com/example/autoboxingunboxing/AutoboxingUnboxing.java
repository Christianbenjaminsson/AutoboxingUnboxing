package com.example.autoboxingunboxing;

import java.util.ArrayList;

public class AutoboxingUnboxing {

    class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //Autoboxing

        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //Unboxing
        }

        //This is a shortcut for autoboxing and unboxing
        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue; //myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for ( double dbl = 0.0; dbl <= 10.0; dbl += 0.5 ) {
            myDoubleValues.add((dbl)); //Autoboxing
        }

        for ( int i = 0; i < myDoubleValues.size(); i ++) {
            double value = myDoubleValues.get(i); //Unboxing
            System.out.println(i + " --> " + value);
        }
    }
}
