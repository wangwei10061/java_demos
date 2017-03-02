package algorithm;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangw on 2016/4/5.
 * 最大子序列问题：
 * 三种方式解决
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums = new int[]{12, -1, -2, 3, 11, 5, -9, 6};
        System.out.println(maxSum0(nums));
    }

    /**
     * 双重循环遍历求解
     * @param array
     * @return
     */
    public static int maxSum0(int [] array)
    {
        int maxSum = 0;
        for(int i=0,len = array.length;i<len;i++ )
        {
            int currentSum = 0;
            for(int j=i;j<len;j++)
            {
                currentSum += array[j];
                if(currentSum>maxSum)
                    maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static int maxSum1(int [] array)
    {
        int maxSum = 0;

        return maxSum;
    }
}
