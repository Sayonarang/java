import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
 
 
public class JTextTest extends JFrame
{
    JLabel lbl,la1,la2,la3;
    JTextField id;
    JPasswordField passwd;
    JPanel idPanel,paPanel,loginPanel;
    JButton b1,b2;
    JTextArea content;
 
    public JTextTest()
    {
          super( "JText�׽�Ʈ" );
          // FlowLayout���
          setLayout( new FlowLayout() );
          // Border�� ���� ����
          EtchedBorder eborder =  new EtchedBorder();
          // ���̺� ����     
          lbl = new JLabel( "���̵�� �н����带 �Է��� �ּ���" );
          // ���̺� ���� �����
          lbl.setBorder(eborder);
          // ���̺� �߰�
          add( lbl );
          // id�гΰ� pw �гλ���
          idPanel = new JPanel();
          paPanel = new JPanel();
          la3 = new JLabel("���̵�");
          la2 = new JLabel("�н�����");
          // id�ؽ�Ʈ�ʵ�� pw�ؽ�Ʈ �ʵ� ����
          id = new JTextField(10);
          passwd = new JPasswordField(10);
          idPanel.add(la3);
          idPanel.add(id);
          paPanel.add( la2 );
          paPanel.add( passwd );
          // �α��ΰ� ȸ�������� ���� �г� ����
          loginPanel = new JPanel();
          b1 = new JButton("�α���");
          b2 = new JButton("ȸ������");
          loginPanel.add( b1 );
          loginPanel.add( b2 );
          add(idPanel);
          add(paPanel);
          add(loginPanel);
          // 3�� 20�� ������ �ؽ�Ʈ����� 
          content = new JTextArea(3,20);
          JScrollPane s= new JScrollPane(content);
          add(s);
          setSize( 250, 350 );
          setVisible(true);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main( String args[] )
       { 
        new JTextTest();
       }
 
    
}