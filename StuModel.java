import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.Vector;

public class StuModel extends AbstractTableModel
{

    //存放某行数据
    Vector rowData1 = null ,columnNames1 = null;
    PreparedStatement ps1 = null ;
    Connection ct1 = null ;
    ResultSet rs = null ;
    JTable jt =null ;


    public void init(String sql)
    {


        rowData1 = new Vector() ;
        columnNames1 = new Vector() ;


        //连接数据库
        //驱动名称
        String driver ="com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名
        String url= "jdbc:mysql://localhost:3306/student?useSSL=true";
        //配置时的用户名
        String user = "root" ;
        String password = "mysql" ;


        //遍历查询结果
        try
        {
            Class.forName(driver);

            ct1 = DriverManager.getConnection(url, user, password);

            if (! ct1.isClosed()) {
                System.out.println("Succeed to connect databases ");
            }


            //创建statement类对象，执行sql语句
            Statement sm = ct1.createStatement();

            ps1 = ct1.prepareStatement(sql) ;
            //结果集
            ResultSet rs = ps1.executeQuery();


            rowData1 = new Vector();
            columnNames1= new Vector() ;
            columnNames1.add("学号");
            columnNames1.add("姓名");
            columnNames1.add("性别");
            columnNames1.add("年龄");
            columnNames1.add("专业");


            while(rs.next())
            {

                Vector hang = new Vector();
                //将结果集存入行和列中
                hang.add(rs.getInt(1));
                hang.add(rs.getString(2));
                hang.add(rs.getString(3)) ;
                hang.add(rs.getInt(4));
                hang.add(rs.getString( 5)) ;
                rowData1.add(hang) ;
            }

            if(rs != null)
                rs.close() ;
            if(ct1 != null)
                ct1.close();
            if(ps1!=null)
                ps1.close();

        }catch(ClassNotFoundException cfe)
        {
            System.out.println("sorry,not find");
            cfe.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            System.out.println(;
        }
    }
    //通过传递sql语句获取模型
    public StuModel(String sql)
    {
        this.init(sql) ;
    }

    //做一个构造函数，用于初始化数据模型
    public StuModel()
    {
        String sql = "select* from stu;" ;
        this.init(sql);
    }


    @Override
    //得到共有多少行
    public int getRowCount() {

        return this.rowData1.size();
    }

    @Override
    //得到共有多少列
    public int getColumnCount() {
        return this.columnNames1.size() ;
    }

    @Override
    //得到某行某列的数据
    public Object getValueAt(int row, int col) {

        return ((Vector)this.rowData1.get(row)).get(col);
    }

    public String getColumnName(int arg0)
    {
        return (String)this.columnNames1.get(arg0);
    }

    //根据用户输入的语句重新添加
    public void addStu(String sql)
    {

    }
}
