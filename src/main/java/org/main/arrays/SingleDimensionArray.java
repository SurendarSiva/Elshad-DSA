package org.main.arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;


    public SingleDimensionArray(int sizeOfArray){       //constructor taking in size of array
        arr = new int[sizeOfArray];                     //passed inside square bracket to mention size of array
        for (int i = 0; i < arr.length; i++) {          //traversing through the size and assigning minimum value to elements
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int valueToBeInserted){       //insert() taking in index value and insertion value
        try {
            if (arr[index] == Integer.MIN_VALUE){               //if the index has min value as assigned before, assign new value
                arr[index] = valueToBeInserted;
                System.out.println("Successfully inserted");
            }
            else {
                System.out.println("This cell is already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }

    //Traversing the array elements and printing on console
    public void traverse(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        catch (Exception e){
            System.out.println("Array not exists");
        }

    }

    public static void main(String[] args) {
        SingleDimensionArray array = new SingleDimensionArray(5);
        array.insert(3,10);
        array.insert(3,4);
        array.insert(5,12);
        //finding elements
        var i = array.arr[3];                       //using var keyword
        System.out.println(i);
        //traverse
        array.traverse();
    }
}
