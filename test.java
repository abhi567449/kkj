package com.imageinfo.expressgst.extracts;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class test {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int N = scanner.nextInt();
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int X = scanner.nextInt();
	        
	        int[] result = addToLargeNumber(arr, X);

	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }

	    private static int[] addToLargeNumber(int[] arr, int X) {
	        int N = arr.length;
	        int carry = X;

	        for (int i = N - 1; i >= 0; i--) {
	            int newValue = arr[i] + carry;
	            arr[i] = newValue % 10;
	            carry = newValue / 10;
	        }

	        if (carry > 0) {
	            int[] newArr = new int[N + 1];
	            newArr[0] = carry;
	            System.arraycopy(arr, 0, newArr, 1, N);
	            return newArr;
	        } else {
	            return arr;
	        }
	    }
}
