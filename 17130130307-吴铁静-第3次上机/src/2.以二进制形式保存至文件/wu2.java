package secondshangji;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class wu2 {



	 public static void main(String[] args) throws IOException {
	  int n = 5; 
	  double[] arr = new double[n]; //插入的数组
	  String[]arr2 = new String[n]; //读取出的数组
	 
	  //数组初始化
	    arr[0] = 1.23;
	    arr[1] = 69.88;
	    arr[2] = 34.45;
	    arr[3] = 67.98;
	    arr[4] = 2345.67;
	  File file = new File("F:\\array3.txt");  //存放数组数据的文件
	 
	  FileWriter out = new FileWriter(file);  //文件写入流
	 
	  //将数组中的数据写入到文件中。每行各数据之间TAB间隔
	  for(int i=0;i<n;i++){
	    out.write(Long.toBinaryString(Double.doubleToLongBits(arr[i]))+"\t");
	   }
	  out.close();

}}