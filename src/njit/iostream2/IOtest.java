package njit.iostream2;
import java.io.*;
 
public class IOtest
{
 
    public static void main(String[] args)
    {
       File f=new File("d:\\test.txt");
       FileInputStream fis=null;
       try {
           //因为File没有读写能力，所以用个FileInputStream
           fis=new FileInputStream(f);
          
           //定义一个字节数组,相当于是缓存
           byte []bytes=new byte[1024];
           //得到实际读取到的字节数
           int n=0;
           //循环读取
           while((n=fis.read(bytes))!=-1)//read函数只有两个返回值，要么是字节长度，要么是-1
           {
              //把字节转化成String
              String s=new String(bytes,0,n);//0代表转换开始的下标，n代表转换字节的长度
              System.out.println(s);         
           }
 
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       finally
       {
           //关闭文件流要放在这里
           try
           {
              fis.close();
           }
           catch (IOException e)
           {
              e.printStackTrace();
           }
       }  
    }
}

