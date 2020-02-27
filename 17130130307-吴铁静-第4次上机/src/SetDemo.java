package thirdshangji;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//用addAll()方法把List集合对象存入到Set集合中并除掉重复值
public class SetDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();        // 创建List集合对象
        list.add("dog");
        list.add("cat");
        list.add("fish");
        list.add("cat");    //重复值
        
        Set<String> set = new HashSet<>();        // 创建List对象集合
        set.addAll(list);        // 将List集合对象添加到Set集合中
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}