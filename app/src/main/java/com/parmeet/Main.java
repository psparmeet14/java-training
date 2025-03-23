package com.parmeet;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

//        try {
//            int arr[] = {1, 2};
//           for (int i = 0 ; i <= 2; i++) {
//               System.out.println(arr[i]);
//           }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception caught");
//        }
//        System.out.println("Hello World!");
//

        Map<Integer, List<String>> testMap = new HashMap<>(1);
        System.out.println(testMap.get(1));
        var stringList = testMap.get(1);
        if (stringList == null) {
            stringList = new ArrayList<>();
            testMap.put(1, stringList);
        }
        
        stringList.add("test");
        System.out.println(testMap.get(1));
        System.out.println("SIZE: " + testMap.get(1).size());
        System.out.println(testMap.get(2));
        System.out.println(testMap);
        var stringListTest = testMap.get(1);
        if (stringListTest == null) {
            stringList = new ArrayList<>();
            testMap.put(1, stringList);
        }
        stringList.add("test2");
        System.out.println(testMap.get(1));
        System.out.println(testMap);
        System.out.println("SIZE: " + testMap.get(1).size());
//        System.out.println("Hello World!");
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("key1", "value1");
//        map.put("key2", "value2");
//        map.put("key3", "value3");
//        map.put("key4", "value4");
//        map.put("key0", "value0");
//        System.out.println(map);
//        System.out.println(new ObjectMapper().writeValueAsString(map));
        //        int test = 10;
//        List<Integer> list = List.of(1, 2, 3, 4, 10, 5, 6);
//        System.out.println(list);
//        var anyMatch = list.stream().anyMatch(i -> i == test);
//        System.out.println(anyMatch);
//
//        var contains = list.contains(test);
//        System.out.println(contains);
    }
}
