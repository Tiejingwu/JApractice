package secondshangji;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WU {

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
  File file = new File("F:\\array2.txt");  //存放数组数据的文件
 
  FileWriter out = new FileWriter(file);  //文件写入流
 
  //将数组中的数据写入到文件中。每行各数据之间TAB间隔
  for(int i=0;i<n;i++){
    out.write(Long.toBinaryString(Double.doubleToLongBits(arr[i]))+"\t");
   }
  out.close();
 
  BufferedReader in = new BufferedReader(new FileReader(file));  //
  String line;  //一行数据
  //逐行读取，并将每个数组放入到数组中
  while((line = in.readLine()) != null){
   String[] temp = line.split("\t"); 
   for(int i=0;i<5;i++){
    arr2[i] = temp[i];
   }
  }
  in.close();
 
  //显示读取出的数组
  for(int i=0;i<n;i++){
    System.out.print(arr2[i]+"\n");
   
  // System.out.println();
  }
 }
}