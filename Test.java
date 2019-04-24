import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Test extends JFrame implements ActionListener {

    //colData存的是列名，rowData存的是rowData
    Vector rowData,colData ;

    JTable jtb=null ;
    JScrollPane jsp = null ;
    //查询数据库
    PreparedStatement ps = null ;
    //连接数据库
    Connection con =null ;
    //结果集
    ResultSet rst = null ;

    JPanel jp1=null,jp2=null ;

    JLabel jlb = null;
    JButton jb1,jb2,jb3,jb4 ;
    JTable jt =null ;

    JTextField jtf=null ;

    public static void main(String []args)
    {
        Test tt = new Test() ;
    }

    public Test()
    {
        jp1 = new JPanel() ;
        jlb= new JLabel("请输入查询") ;
        jtf = new JTextField(10) ;
        jb1= new JButton("查询") ;


        jp1.add(jlb);
        jp1.add(jtf) ;
        jp1.add(jb1) ;
        jb1.addActionListener(this);

        jp2 = new JPanel() ;
        jb2 = new JButton("添加") ;
        jb3 = new JButton("删除") ;
        jb4 = new JButton("修改") ;

        jp2.add(jb2);
        jp2.add(jb3) ;
        jp2.add(jb4) ;

        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);


        Model smo = new Model() ;
        jt = new JTable(smo) ;
        jsp = new JScrollPane(jt) ;


        this.add(jp1, "North") ;
        this.add(jp2, "South") ;
        this.add(jsp) ;
        this.setSize(400,300) ;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource() == jb1)
        {
            System.out.println("用户希望查询") ;
            String name = this.jtf.getText().trim() ;
            String sql = "select *from student where sname='"+name+"'" ;
            Model mo = new Model(sql) ;
            jt.setModel(mo);
        }
    }
}
