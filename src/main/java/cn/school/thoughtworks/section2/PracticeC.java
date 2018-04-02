package cn.school.thoughtworks.section2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        Map<String, Integer> temp = new HashMap<String, Integer>();
        for (int i = 0; i < collection1.size(); i++) {
            if (collection1.get(i).length() == 1) {
                if (expectedResult.get(collection1.get(i))==null) {
                    int count = Collections.frequency(collection1, collection1.get(i));
                    expectedResult.put(collection1.get(i), count);
//                } else if (collection1.get(i).equals(collection1.get(i - 1))) {
//                    int count = Collections.frequency(collection1, collection1.get(i));
//                    expectedResult.put(collection1.get(i), count);
                }
            } else {
                String str = collection1.get(i);
                String str2 = "";
                if (str != null && !"".equals(str)) {
                    for (int k = 0; k < str.length(); k++) {
                        if (str.charAt(k) >= 48 && str.charAt(k) <= 57) {
                            str2 += str.charAt(k);
                        }
                    }
                }
                int count = Integer.valueOf(str2);
                String key = String.valueOf(collection1.get(i).charAt(0));
                if (expectedResult.get(key) == null) {
                    expectedResult.put(key, count);
                }
                else {
                    count += expectedResult.get(key);
                    expectedResult.put(key, count);
                }


            }
        }
                return expectedResult;
            }
        }