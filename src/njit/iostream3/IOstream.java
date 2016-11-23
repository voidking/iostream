package njit.iostream3;
import java.io.*;
 
public class IOstream
{
 
    public static void main(String[] args)
    {
       File f=new File("d:\\ss.txt");
      
       //字节输出流
       FileOutputStream fos=null;
       try
       {
           fos=new FileOutputStream(f);
           //如果数据量大的话，定义数组，把String转换成字节数组，这里就buy
          
           String s="12312231235555\r\n";//必须是回车再换行，注意顺序
           String s2="ddddddd";
 
           fos.write(s.getBytes());
           fos.write(s2.getBytes());
 
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       finally
       {
           try {
              fos.close();
           } catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
           }
       }
   
    }
 
}

