package cn.school.thoughtworks.section3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        for (int i = 0; i < collectionA.size(); i++) {
            if(collectionA.get(i).length() == 1) {
                if (i == 0) {
                    int count = Collections.frequency(collectionA, collectionA.get(i));
                    expectedResult.put(collectionA.get(i), count);
                } else if (collectionA.get(i).equals(collectionA.get(i - 1))) {
                    int count = Collections.frequency(collectionA, collectionA.get(i));
                    expectedResult.put(collectionA.get(i), count);
                }
            }
            else {
                int count = Integer.valueOf(String.valueOf(collectionA.get(i).charAt(2)));
                String str = String.valueOf(collectionA.get(i).charAt(0));
                expectedResult.put(str,count);
            }
        }
        List<String> collection2 = object.get("value");
        for(int i = 0; i < collection2.size(); i++) {
            if(expectedResult.get(collection2.get(i)) != null){
                int temp = expectedResult.get(collection2.get(i));
                temp = temp - temp/3;
                expectedResult.put(collection2.get(i),temp);
            }
        }
        return expectedResult;
    }
}
