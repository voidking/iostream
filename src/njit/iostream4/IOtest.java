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
       //�Ȱ�ͼƬ���뵽�ڴ棬����취����д��ĳ���ļ�
       //��Ϊ�Ƕ������ļ������ֻ�����ֽ������
       FileInputStream fis=null;
       //���������
       FileOutputStream fos=null;
       try
       {
           File f1=new File("c:\\a.jpg");
           fis=new FileInputStream(f1);
           fos=new FileOutputStream("d:\\a.jpg");
          
           byte buf[]=new byte[1024];
           int n=0;//��¼ʵ�ʶ�ȡ���ֽ���
           //ѭ������
       while((n=fis.read(buf))!=-1)
           {
              //�����ָ���ļ�
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

