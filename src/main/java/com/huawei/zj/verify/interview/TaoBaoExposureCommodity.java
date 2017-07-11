package com.huawei.zj.verify.interview;

import java.util.Scanner;

/**
 * Created by intel on 2017/7/11.
 *
 * 实现计算曝光商品在一次曝光列表的位置，淘宝搜索页用户可选择排序类型，比如按销量从高到低，现采集到搜索结果页的日志数据包包括如下字段：
 * item_list（商品id列表），item_price_list(商品价格列表，跟商品id一一对应)，根据item_id和item_price计算商品在一次曝光中出现的位置，
 * 从0开始计数，要求时间负责度不能为O(N)，N为商品列表长度，item_price存在多个商品几个相同的情况，当商品id列表长度跟商品价格列表长度不一致返回-1，这里注意商品价格并不一定是有序的
 */
public class TaoBaoExposureCommodity
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int res;

        String itemList;
        try
        {
            itemList = in.nextLine();
        }
        catch (Exception e)
        {
            itemList = null;
        }

        String itemPriceList;
        try
        {
            itemPriceList = in.nextLine();
        }
        catch (Exception e)
        {
            itemPriceList = null;
        }

        String itemId;
        try
        {
            itemId = in.nextLine();
        }
        catch (Exception e)
        {
            itemId = null;
        }

        double itemPrice;
        itemPrice = Double.parseDouble(in.nextLine().trim());

        res = position(itemList, itemPriceList, itemId, itemPrice);
        System.out.println(String.valueOf(res));

    }

    private static int position(String itemList, String itemPriceList,
                                String itemId, double itemPrice)
    {
        // TODO Auto-generated method stub
        String[] ids = itemList.split(" ");
        String[] priceStr = itemPriceList.split(" ");

        if (ids.length != priceStr.length)
        {
            return -1;
        }

        double[] prices = new double[priceStr.length];
        for (int i = 0; i < priceStr.length; i++)
        {
            prices[i] = Double.parseDouble(priceStr[i]);
        }

        int idIndex = -1;

        //System.out.println(itemId+" "+itemPrice);
        for (int i = 0; i < ids.length; i++)
        {
            //这个if语句根本没有执行满足条件的，为啥
            if (ids[i].equals(itemId))
            {
                idIndex = i;
                //System.out.println("idindex:"+idIndex);
            }
        }

        //System.out.println("idIndex:"+idIndex);
        if (idIndex != -1)
        {
            if (itemPrice == prices[idIndex])
            {
                return idIndex + 1;
            }
        }
        return -1;
    }

}
