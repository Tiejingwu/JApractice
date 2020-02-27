package thirdshangji;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//��addAll()������List���϶�����뵽Set�����в������ظ�ֵ
public class SetDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();        // ����List���϶���
        list.add("dog");
        list.add("cat");
        list.add("fish");
        list.add("cat");    //�ظ�ֵ
        
        Set<String> set = new HashSet<>();        // ����List���󼯺�
        set.addAll(list);        // ��List���϶�����ӵ�Set������
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}