package thirdshangji;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//add()���������򼯺������Ԫ�أ�set()���������޸ļ����е�Ԫ�أ����������ڱ��������е�Ԫ�ز����
//����������޸ļ���Ԫ��
public class ListDemo {

    public static void main(String[] args) {
        String aString = "A", bString = "B", cString = "C", dString = "D";
        
        List<String> list = new LinkedList<>();        // ����list���϶���
        list.add(aString);        // �򼯺������Ԫ��
        list.add(bString);
        list.add(dString);
        // �����䣬�õ�����
        Iterator<String> iter = list.iterator();        // �������ϵ�����
        while(iter.hasNext()) {        // ���������е�Ԫ��
            System.out.print(iter.next() + " ");
        }
        
        System.out.println();        // ����
        list.set(1, cString);        // ������λ��1�Ķ����޸�Ϊ����bString
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}