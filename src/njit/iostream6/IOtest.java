package njit.iostream6;
import java.io.*;
import java.awt.*;
import javax.swing.*;
 
import java.awt.event.*;
 
public class IOtest extends JFrame implements ActionListener
{
    //������Ҫ�����
    JTextArea jta=null;
    //����˵���
    JMenuBar jmb=null;
   
    //��һJMenu
    JMenu jm1=null;
 
    JMenuItem jmi1=null;
    JMenuItem jmi2=null;
   
    public static void main(String[] args)
    {
      
       IOtest notepad=new  IOtest();
        
    }
 
    public IOtest()
    {
        //����jta
       jta=new JTextArea();
       jmb=new JMenuBar();
       jm1=new JMenu("�ļ�");
       jm1.setMnemonic('F');
       jmi1=new JMenuItem("��",new ImageIcon("weixiao.gif"));
       jmi2=new JMenuItem("����",new ImageIcon("ziya.gif"));
 
        //ע�����
       jmi1.addActionListener(this);
        jmi1.setActionCommand("open");
      
        //�Ա���˵��Ĳ���
        jmi2.addActionListener(this);
        jmi2.setActionCommand("save");
       
       
       jm1.add(jmi1);
       jm1.add(jmi2);
      
       jmb.add(jm1);
      
       this.setJMenuBar(jmb);
      
       //���뵽JFrame
       this.add(jta);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setSize(400, 300);
       this.setVisible(true);
      
    }
 
    public void actionPerformed(ActionEvent e)
    {
       //�ж��ĸ��˵���ѡ��
       if(e.getActionCommand().equals("open"))
       {
           //System.out.println("open");
           //ʹ��JFileChooser
           JFileChooser jfc1=new JFileChooser();
           //��������
           jfc1.setDialogTitle("��ѡ���ļ���");
           jfc1.showOpenDialog(null);
           //��ʾ
           jfc1.setVisible(true);
           //�õ��û�ѡ����ļ�·��
           String filename=jfc1.getSelectedFile().getAbsolutePath();
           //System.out.println(filename);//��ʾ����·��
           FileReader fr=null;
           BufferedReader br=null;
           try
           {
              fr=new FileReader(filename);
              br=new BufferedReader(fr);
             
              //���ļ��ж�ȡ��Ϣ
              String s="";
              String allCon="";
              while((s=br.readLine())!=null)
              {
                  //�����JTextFile
                 
                  allCon+=(s+"\r\n");
                 
              }
              //���õ�JTextFile��
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
           jfc2.setDialogTitle("���Ϊ��");
           jfc2.showSaveDialog(null);
           //��Ĭ�ϵķ�ʽ��ʾ
           jfc2.setVisible(true);
          
           //�õ��û�ϣ�����ļ����浽�δ�
           String file=jfc2.getSelectedFile().getAbsolutePath();
           //׼��д�뵽ָ�����ļ�
          
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
 
