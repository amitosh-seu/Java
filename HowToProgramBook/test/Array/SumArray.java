/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author amitoshseu
 */
public class SumArray {
    public static void main(String[] args) {
        int[] array = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;
        
        // add each element's value to total
        for(int counter = 0; counter<array.length; counter++)
            total += array[counter];
        System.out.printf("Total of the array elements: %d\n",total);
    }
}
