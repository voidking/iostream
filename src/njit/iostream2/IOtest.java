package njit.iostream2;
import java.io.*;
 
public class IOtest
{
 
    public static void main(String[] args)
    {
       File f=new File("d:\\test.txt");
       FileInputStream fis=null;
       try {
           //��ΪFileû�ж�д�����������ø�FileInputStream
           fis=new FileInputStream(f);
          
           //����һ���ֽ�����,�൱���ǻ���
           byte []bytes=new byte[1024];
           //�õ�ʵ�ʶ�ȡ�����ֽ���
           int n=0;
           //ѭ����ȡ
           while((n=fis.read(bytes))!=-1)//read����ֻ����������ֵ��Ҫô���ֽڳ��ȣ�Ҫô��-1
           {
              //���ֽ�ת����String
              String s=new String(bytes,0,n);//0����ת����ʼ���±꣬n����ת���ֽڵĳ���
              System.out.println(s);         
           }
 
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       finally
       {
           //�ر��ļ���Ҫ��������
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

