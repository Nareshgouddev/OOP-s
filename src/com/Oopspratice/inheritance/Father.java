package com.Oopspratice.inheritance;

import java.sql.SQLOutput;

public class Father {
    static void main() {
        int[] arr={3,7,5};
        System.out.println(positive(arr,arr[0]));
    }
    private static int positive(int[] nums,int k) {
            int low = 1;
            int high = 0;
            for (int n : nums)
                high = Math.max(high, n);
            int ans = high;
            while (low <= high) {

                int mid = (low + high) / 2;

                int sum = 0;
                for (int n : nums) {
                    sum += Math.ceil((double)n / mid);
                }

                if (sum <= k) {
                    ans = mid;        // possible answer
                    high = mid - 1;   // try smaller
                } else {
                    low = mid + 1;
                }
            }

            return ans;
        }
}
