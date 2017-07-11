package com.huawei.zj.verify.practise.sort;

import java.util.Arrays;

/**
 * Created by intel on 2017/7/11.
 */
public class SortAlgorithm
{
    public static void main(String[] args)
    {
        int a[] = {3,1,5,7,2,4,9,6,10,8};

        selectSort(a);

        shellSort(a);

    }

    public static void selectSort(int[] array)
    {
        int position = 0;
        for (int i = 0; i < array.length; i++)
        {
            int j = i + 1;
            position = i;
            int temp = array[i];
            for (; j < array.length; j++)
            {
                if (array[j] < temp)
                {
                    temp = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array) + " selectSort");
    }

    public static void shellSort(int[] array)
    {
        int i;
        int j;
        int temp;
        int gap = 1;
        int len = array.length;
        while (gap < len / 3)
        {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3)
        {
            for (i = gap; i < len; i++)
            {
                temp = array[i];
                for (j = i - gap; j >= 0 && array[j] > temp; j -= gap)
                {
                    array[j + gap] = array[j];
                }
                array[j + gap] = temp;
            }
        }
        System.out.println(Arrays.toString(array) + " shellSort");
    }

}

