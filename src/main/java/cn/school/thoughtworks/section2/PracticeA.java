package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        for (int i = 0; i < collection1.size(); i++) {
            if(i==0) {
                int count = Collections.frequency(collection1, collection1.get(i));
                expectedResult.put(collection1.get(i),count);
            }
            else if(collection1.get(i).equals(collection1.get(i-1))) {
                int count = Collections.frequency(collection1, collection1.get(i));
                expectedResult.put(collection1.get(i),count);
            }
        }
        return expectedResult;
    }
}
