package njit.iostream1;
import java.io.*;
 
public class IOtest
{
 
    public static void main(String[] args)
    {
       File f=new File("d:/a.txt");
       //�õ��ļ���·��
      
       System.out.println("�ļ�·����"+f.getAbsolutePath());
       //�õ��ļ��Ĵ�С
       System.out.println("�ļ���С��"+f.length());// �����ļ����ֽڴ�С
       System.out.println("�ɶ���"+f.canRead());//�ɲ��ɶ�
       //�����ļ����ļ���
       File f2=new File("d:\\hsp.txt");
       if(!f2.isFile()) 
       {
           //���Դ���
           try {
              f2.createNewFile();
           } catch (IOException e) {
              e.printStackTrace();
           }
          
       }else
       {
           System.out.println("���ļ����ܴ���");
       }
       //�����ļ���
       File f3=new File("d:\\ff");
       if(f3.isDirectory())
       {
           System.out.println("�ļ��д���");
       }
       else
       {
           f3.mkdir();
       }
       //�г��ļ�������������ļ�
       File f4=new File("d:\\dd");    
      
       if(f4.isDirectory())
       {
           File lists[]=f4.listFiles();      
      
           for(int i=0;i<lists.length;i++)
           {
              System.out.println("�ļ�����"+lists[i]);
           }
       }
       else
       {
           f4.mkdir();
       }     
    }
}

