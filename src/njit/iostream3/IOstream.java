package njit.iostream3;
import java.io.*;
 
public class IOstream
{
 
    public static void main(String[] args)
    {
       File f=new File("d:\\ss.txt");
      
       //�ֽ������
       FileOutputStream fos=null;
       try
       {
           fos=new FileOutputStream(f);
           //�����������Ļ����������飬��Stringת�����ֽ����飬�����buy
          
           String s="12312231235555\r\n";//�����ǻس��ٻ��У�ע��˳��
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

