import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class Main extends  JFrame implements ActionListener {


    //将数据库中的表数据收集起来
    Vector rowData1, columnNames1;
    //显示数据库中表项的
    JTable jt1 = null;
    //布局组件的
    JScrollPane jsp1 = null;

    PreparedStatement ps1 = null ;
    Connection ct1 = null ;
    ResultSet rs1 = null ;

    JPanel jp1,jp2 ;
    JLabel jl1 ;
    JButton jb1,jb2,jb3,jb4;
    JTable jt ;
    JScrollPane jsp ;
    JTextField  jtf ;
    public static void main(String []args)
    {
        Main st = new Main();
    }

    public Main()
    {

        jp1 = new JPanel() ;
        jtf = new JTextField(10);
        jb1 = new JButton("查询");


        jl1 = new JLabel("请输入名字：");

        //将控件加入jpanel
        jp1.add(jl1);
        jp1.add(jtf);
        jp1.add(jb1) ;
        jb1.addActionListener(this);

        jp2 = new JPanel() ;

        jb2 = new JButton("添加");
        jb3 = new JButton("删除");
        jb4 = new JButton("修改");
        jb2.addActionListener(this);
        jp2.add(jb2) ;
        jp2.add(jb3) ;
        jp2.add(jb4) ;

        StuModel smo = new StuModel() ;
        jt = new JTable(smo) ;


        jsp = new JScrollPane(jt) ;
        this.add(jsp) ;
        this.add(jp1,"North");
        this.add(jp2, "South");

        this.setSize(400,300) ;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    //用户查询数据信息
    public void actionPerformed(ActionEvent arg0)
    {


        if(arg0.getSource() == jb1)
        {
            System.out.println("用户希望查询");
            String name = this.jtf.getText().trim() ;
            //写一个sql语句
//            String names = "zs" ;
            String sql = "select *from stu where sname='"+name+"'" ;
            StuModel smo= new StuModel(sql);
            //更新jtable
            jt.setModel(smo);
        }
        else if(arg0.getSource() == jb2)
        {
            System.out.println("添加操作");

            Dialog dd = new Dialog(this, "添加学生",true) ;
            //重新获得新的数据模型,显示出来
        }
    }
}
