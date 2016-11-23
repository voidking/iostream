package njit.iostream6;
import java.io.*;
import java.awt.*;
import javax.swing.*;
 
import java.awt.event.*;
 
public class IOtest extends JFrame implements ActionListener
{
    //定义需要的组件
    JTextArea jta=null;
    //定义菜单条
    JMenuBar jmb=null;
   
    //第一JMenu
    JMenu jm1=null;
 
    JMenuItem jmi1=null;
    JMenuItem jmi2=null;
   
    public static void main(String[] args)
    {
      
       IOtest notepad=new  IOtest();
        
    }
 
    public IOtest()
    {
        //创建jta
       jta=new JTextArea();
       jmb=new JMenuBar();
       jm1=new JMenu("文件");
       jm1.setMnemonic('F');
       jmi1=new JMenuItem("打开",new ImageIcon("weixiao.gif"));
       jmi2=new JMenuItem("保存",new ImageIcon("ziya.gif"));
 
        //注册监听
       jmi1.addActionListener(this);
        jmi1.setActionCommand("open");
      
        //对保存菜单的操作
        jmi2.addActionListener(this);
        jmi2.setActionCommand("save");
       
       
       jm1.add(jmi1);
       jm1.add(jmi2);
      
       jmb.add(jm1);
      
       this.setJMenuBar(jmb);
      
       //放入到JFrame
       this.add(jta);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setSize(400, 300);
       this.setVisible(true);
      
    }
 
    public void actionPerformed(ActionEvent e)
    {
       //判断哪个菜单被选中
       if(e.getActionCommand().equals("open"))
       {
           //System.out.println("open");
           //使用JFileChooser
           JFileChooser jfc1=new JFileChooser();
           //设置名字
           jfc1.setDialogTitle("请选择文件：");
           jfc1.showOpenDialog(null);
           //显示
           jfc1.setVisible(true);
           //得到用户选择的文件路径
           String filename=jfc1.getSelectedFile().getAbsolutePath();
           //System.out.println(filename);//显示绝对路径
           FileReader fr=null;
           BufferedReader br=null;
           try
           {
              fr=new FileReader(filename);
              br=new BufferedReader(fr);
             
              //从文件中读取信息
              String s="";
              String allCon="";
              while((s=br.readLine())!=null)
              {
                  //输出到JTextFile
                 
                  allCon+=(s+"\r\n");
                 
              }
              //放置到JTextFile中
              jta.setText(allCon);
           }
           catch (Exception e1)
           {
              e1.printStackTrace();
           }
           finally
           {
             
              try {
                  br.close();
                  fr.close();
              } catch (IOException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
              }
             
           }
          
       }
       else if (e.getActionCommand().equals("save"))
       {
           JFileChooser jfc2=new JFileChooser();
           jfc2.setDialogTitle("另存为…");
           jfc2.showSaveDialog(null);
           //按默认的方式显示
           jfc2.setVisible(true);
          
           //得到用户希望把文件保存到何处
           String file=jfc2.getSelectedFile().getAbsolutePath();
           //准备写入到指定的文件
          
           FileWriter fw=null;
           BufferedWriter bw=null;
          
           try
           {
              fw=new FileWriter(file);
              bw=new BufferedWriter(fw);
             
              bw.write(this.jta.getText());
           }
           catch (IOException e1)
           {
              e1.printStackTrace();
           }
           finally
           {
             
              try {
                  bw.close();
                  fw.close();
              } catch (IOException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
              }
             
           }
   
       }
    }
 
}
 
