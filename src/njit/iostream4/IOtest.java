package njit.iostream4;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class IOtest
{
 
    public static void main(String[] args)
    {
       //先把图片读入到内存，再想办法将其写入某个文件
       //因为是二进制文件，因此只能用字节流完成
       FileInputStream fis=null;
       //定义输出流
       FileOutputStream fos=null;
       try
       {
           File f1=new File("c:\\a.jpg");
           fis=new FileInputStream(f1);
           fos=new FileOutputStream("d:\\a.jpg");
          
           byte buf[]=new byte[1024];
           int n=0;//记录实际读取的字节数
           //循环次数
       while((n=fis.read(buf))!=-1)
           {
              //输出到指定文件
              fos.write(buf);            
           }
          
          
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       finally
       {
           try {
              fis.close();
              fos.close();
           } catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
           }
          
       }
      
    }
 
}  

