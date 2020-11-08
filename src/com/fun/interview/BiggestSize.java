package com.fun.interview;

/*
Find the biggest size of sub array which is continuity and sum this sub array is equal 0
For example, array = [4, 5, 0, 6, -6 , -7, 3, 4, 1]
sub array 1 = [0] size = 1
sub array 2 = [6, -6] size = 2
sub array 3 = [-7, 3, 4] size = 3
sub array 4 = [6, -6 , -7, 3, 4] = 5
then need to return 3
 */
public class BiggestSize {
    public static int getBiggestSize(int[] array) {
        int sum;
        int size = 0;
        for (int i = 0; i < array.length; i ++) {
            sum = array[i];
            for (int j = i + 1; j < array.length; j ++) {
                sum = sum + array[j];
                if (sum == 0) {
                    int sizeTemp = j - i + 1;
                    if (size < sizeTemp) {
                        size = sizeTemp;
                    }
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, -6 ,1, -7, 3, 4, 1};
        //int[] array = {4, 5, -7, 3, 4, 1};
        //int[] array = {4, 5, 6, -6, 1};
        int size = getBiggestSize(array);
        System.out.print(size);
    }
}
