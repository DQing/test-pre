package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> list = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            boolean temp = false;
            for (int j = 0; j < collection2.size(); j++){
                if (collection1.get(i).equals(collection2.get(j)))
                    temp = true;
            }
            if (temp) {
                String str = collection1.get(i);
                list.add(str);
            }
        }
        return list;
    }
}
