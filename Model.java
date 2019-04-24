import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.Vector;

//将数据库中的操作封装在该类中
public class Model extends AbstractTableModel{


    Vector rowData=null ,colData =null ;
    PreparedStatement ps ;
    Connection con ;

    ResultSet rs =null ;
    JTable jtb = null ;

    //初始化模型
    public void init(String sql)
    {
        rowData = new Vector() ;
        colData = new Vector() ;

        //连接数据库
        String driver = "com.mysql.jdbc.Driver" ;
        //url只想要访问的数据库
        String url = "jdbc:mysql://localhost:3306/student?useSSL=true" ;
        //配置时的用户名
        String user = "root" ;
        String psd = "mysql" ;

        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, user, psd);
            if (!con.isClosed()) {
                System.out.println("suceed toc connect databases");
            }

            Statement sm = con.createStatement() ;

            ps = con.prepareStatement(sql) ;
            //查询数据库
            ResultSet rs = ps.executeQuery() ;

            rowData = new Vector() ;
            colData = new Vector() ;

            colData.add("ID") ;
            colData.add("姓名") ;
            colData.add("分数") ;
            colData.add("专业") ;
            while(rs.next())
            {
                Vector hang = new Vector() ;
                hang.add(rs.getInt(1)) ;
                hang.add(rs.getString(2)) ;
                hang.add(rs.getInt(3)) ;
                hang.add(rs.getString(4)) ;
                rowData.add(hang) ;
            }

            if (rs != null)
            {
                rs.close() ;
            }

            if(con!=null)
            {
                rs.close() ;
            }
            if(ps !=null)
            {
                ps.close() ;
            }

         }catch(ClassNotFoundException s)
            {
            s.printStackTrace();
            }catch (SQLException ss)
            {
            ss.printStackTrace();

             }finally{

            System.out.println("连接数据库成功") ;
        }

    }

    public Model()
    {
        String sql = "select * from student" ;
        init(sql) ;
    }

    public Model(String sql)
    {
        if(sql.equals("")) {
            sql = "select * from student" ;
            init(sql) ;
        }
        else {
            init(sql) ;
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return ((Vector)this.rowData.get(rowIndex)).get(columnIndex);
    }

    @Override
    public int getColumnCount() {
        return this.colData.size() ;
    }

    @Override
    public int getRowCount() {
        return this.rowData.size();
    }

    @Override
    public String getColumnName(int column) {
        return (String)this.colData.get(column) ;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}
