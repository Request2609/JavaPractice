import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//产生子窗口
class Dialog extends JDialog implements ActionListener {

    JLabel jl1,jl2,jl3,jl4,jl5 ;

    JButton jb1,jb2 ;

    JTextField jtf1,jtf2,jtf3,jtf4 ;


    JPanel jp1,jp2,jp3 ;
    //Owner父窗口
    //窗口名称
    //制定模式与非模式窗口
    public Dialog(Frame owner, String title, boolean model)
    {

        super(owner, title, model);

        jl1 = new JLabel("姓名");
        jl2 = new JLabel("性别");
        jl3 = new JLabel("年龄");
        jl4 = new JLabel("专业");

        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        jtf4 = new JTextField();



        jb1 = new JButton("添加") ;
        jb2 = new JButton("取消");

        jp1 = new JPanel();
        jp2 = new JPanel() ;
        jp3 = new JPanel() ;

        jp1.add(jl1) ;
        jp1.add(jl2) ;
        jp1.add(jl3);
        jp1.add(jl4);

        jp2.add(jtf1) ;
        jp2.add(jtf2) ;
        jp2.add(jtf3) ;
        jp2.add(jtf4) ;

        jp3.add(jb1) ;
        jp3.add(jb2) ;

        this.add(jp1, BorderLayout.WEST) ;
        this.add(jp2, BorderLayout.CENTER) ;
        this.add(jp3, BorderLayout.SOUTH);

        jb1.addActionListener(this);

        this.setSize(300,200) ;
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0)
    {

    }
}
