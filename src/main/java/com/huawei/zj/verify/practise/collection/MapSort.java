package com.huawei.zj.verify.practise.collection;

import java.util.*;

/**
 * Created by intel on 2017/7/11.
 */
public class MapSort
{
    public static void main(String[] args)
    {
        keySortAsc();
        keySortDesc();
        valueSort();
    }

    public static void keySortAsc()
    {
        System.out.println("keySortAsc()");

        Map<String, String> map = new TreeMap<String, String>();
        map.put("b", "ccccc");
        map.put("d", "aaaaa");
        map.put("c", "bbbbb");
        map.put("a", "ddddd");

        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext())
        {
            String key = iter.next();
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void keySortDesc()
    {
        System.out.println("keySortDesc()");

        Map<String, String> map = new TreeMap<String, String>(
                new Comparator<String>()
                {
                    public int compare(String obj1, String obj2)
                    {
                        // 降序排序
                        return obj2.compareTo(obj1);
                    }
                });
        map.put("b", "ccccc");
        map.put("d", "aaaaa");
        map.put("c", "bbbbb");
        map.put("a", "ddddd");

        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext())
        {
            String key = iter.next();
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void valueSort()
    {
        System.out.println("keySortDesc()");

        Map<String, String> map = new TreeMap<String, String>();
        map.put("a", "ddddd");
        map.put("c", "bbbbb");
        map.put("d", "aaaaa");
        map.put("b", "ccccc");

        //这里将map.entrySet()转换成list
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<String, String>>()
        {
            //升序排序
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2)
            {
                return o1.getValue().compareTo(o2.getValue());
            }

        });

        for (Map.Entry<String, String> mapping : list)
        {
            System.out.println(mapping.getKey() + ":" + mapping.getValue());
        }
    }

}
