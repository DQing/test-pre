package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> list = new ArrayList<>();
        List<String> collection3 = collection2.get(0);
        for (int i = 0; i < collection1.size(); i++) {
            boolean temp = false;
            for (int j = 0; j < collection3.size(); j++){
                if (collection1.get(i).equals(collection3.get(j)))
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
