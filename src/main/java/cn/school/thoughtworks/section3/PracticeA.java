package cn.school.thoughtworks.section3;

import com.sun.javafx.scene.control.skin.LabeledSkinBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> collection2 = object.get("value");
        for(int i = 0; i < collection2.size(); i++) {
            if(collectionA.get(collection2.get(i)) != null){
                int temp = collectionA.get(collection2.get(i)) - 1;
                collectionA.put(collection2.get(i),temp);
            }
        }
        return collectionA;
    }
}
