package secondshangji;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class wu2 {



	 public static void main(String[] args) throws IOException {
	  int n = 5; 
	  double[] arr = new double[n]; //���������
	  String[]arr2 = new String[n]; //��ȡ��������
	 
	  //�����ʼ��
	    arr[0] = 1.23;
	    arr[1] = 69.88;
	    arr[2] = 34.45;
	    arr[3] = 67.98;
	    arr[4] = 2345.67;
	  File file = new File("F:\\array3.txt");  //����������ݵ��ļ�
	 
	  FileWriter out = new FileWriter(file);  //�ļ�д����
	 
	  //�������е�����д�뵽�ļ��С�ÿ�и�����֮��TAB���
	  for(int i=0;i<n;i++){
	    out.write(Long.toBinaryString(Double.doubleToLongBits(arr[i]))+"\t");
	   }
	  out.close();

}}