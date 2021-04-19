
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Count {

    public static void count(int[] arr, int k) {
        int a, b;
        int[] new_arr = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            new_arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            new_arr[arr[i]]++;
        }
        for (int i = 1; i < k + 1; i++) {
            new_arr[i] = new_arr[i] + new_arr[i - 1];
        }
        System.out.println("Please enter the a and b");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if (a > 0) {
            int count = new_arr[b] - new_arr[a - 1];
            System.out.println(count);
        } else {
            System.out.println("Range must be between 0 and k");
        }

    }


    public static void main(String[] args) {

        int[] arr = {6, 7, 9, 1, 4, 6, 3};

        count(arr, 9);

    }

}
