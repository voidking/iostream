package njit.iostream5;
import java.io.*;
public class IOtest
{
 
    public static void main(String[] args)
    {
       //�ļ�ȡ���ַ�������
       FileReader fr=null;
       //д�뵽�ļ�
       FileWriter fw=null;
      
       try
       {
           //����fr����
           fr=new FileReader("c:\\ttt.txt");
           //�����������
           fw=new FileWriter("d:\\ccc.txt");
           int n=0;//��¼ʵ�ʶ�ȡ�����ַ���
           char c[]=new char[1024];
           while((n=fr.read(c))!=-1)
           //read�����Ѿ���ȡ����Ŀ�������ļ���ĩβ�ͷ���-1��read����������״̬��Ҫô�ն��귵��c.lengthҪô����-1�������൱��ֻ����������
           {
              System.out.println("n="+n);
              String s=new String(c,0,n);//��0��ʼ��ȡn��
              System.out.println(s);  
               //fw.write(c);//д�����е���������,1024��������
              fw.write(c, 0, n);//����ʵ�ʳ���д���������˷ѵ���
           }
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       finally
       {
           try {
              fw.close();
              fr.close();
           } catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
           }
          
          
       }
             
    }
}

