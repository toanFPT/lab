/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_1;

import java.util.Random;

public class LinearSearch {
    private int[] array;
    
    public LinearSearch(int size) {
        array = new int[size];
        generateRandomArray();
    }
    
    private void generateRandomArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
    
    public void displayArray() {
        System.out.print("Generated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public int linearSearch(int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1;
    }

}