package njit.iostream1;
import java.io.*;
 
public class IOtest
{
 
    public static void main(String[] args)
    {
       File f=new File("d:/a.txt");
       //得到文件的路劲
      
       System.out.println("文件路径："+f.getAbsolutePath());
       //得到文件的大小
       System.out.println("文件大小："+f.length());// 返回文件的字节大小
       System.out.println("可读："+f.canRead());//可不可读
       //创建文件和文件夹
       File f2=new File("d:\\hsp.txt");
       if(!f2.isFile()) 
       {
           //可以创建
           try {
              f2.createNewFile();
           } catch (IOException e) {
              e.printStackTrace();
           }
          
       }else
       {
           System.out.println("有文件不能创建");
       }
       //创建文件夹
       File f3=new File("d:\\ff");
       if(f3.isDirectory())
       {
           System.out.println("文件夹存在");
       }
       else
       {
           f3.mkdir();
       }
       //列出文件夹下面的所有文件
       File f4=new File("d:\\dd");    
      
       if(f4.isDirectory())
       {
           File lists[]=f4.listFiles();      
      
           for(int i=0;i<lists.length;i++)
           {
              System.out.println("文件名："+lists[i]);
           }
       }
       else
       {
           f4.mkdir();
       }     
    }
}

