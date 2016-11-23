package njit.iostream5;
import java.io.*;
public class IOtest
{
 
    public static void main(String[] args)
    {
       //文件取出字符流对象
       FileReader fr=null;
       //写入到文件
       FileWriter fw=null;
      
       try
       {
           //创建fr对象
           fr=new FileReader("c:\\ttt.txt");
           //创建输出对象
           fw=new FileWriter("d:\\ccc.txt");
           int n=0;//记录实际读取到的字符数
           char c[]=new char[1024];
           while((n=fr.read(c))!=-1)
           //read返回已经读取的数目，到了文件的末尾就返回-1，read本身有两种状态，要么刚读完返回c.length要么返回-1，所以相当于只有两个过程
           {
              System.out.println("n="+n);
              String s=new String(c,0,n);//从0开始读取n个
              System.out.println(s);  
               //fw.write(c);//写了所有的整块数据,1024的整数倍
              fw.write(c, 0, n);//按照实际长度写，不会有浪费的码
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

