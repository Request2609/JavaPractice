import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

//我的记事本
public class NoteBook extends JFrame implements ActionListener {
	
	JTextArea jt = null ;
	JMenuBar jmb = null ;
	JMenu jm = null ;
	//记事本中的菜单选项
	JMenuItem jmi = null ,jmi1 =null ; 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		NoteBook nt = new NoteBook();
	}
	
	public NoteBook(){
		jt = new JTextArea() ;
		jmb = new JMenuBar() ;
		jm = new JMenu("打开") ;
		jm.setMnemonic('F');
		//设置菜单图标,加图标new ImageIcon("new.gif")
		jmi = new JMenuItem("打开");
		//注册监听
		jmi.addActionListener(this);
		jmi.setActionCommand("open");
		
		jmi1=  new JMenuItem("保存") ;
		jmi1.addActionListener(this);
		jmi1.setActionCommand("save");
		//加入
		this.setJMenuBar(jmb) ;
		//将jm放入jmb中
		jmb.add(jm);
		//将item放入menu中
		jm.add(jmi) ;
		jm.add(jmi1) ;
		
		this.add(jt) ;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	//设置事件处理
	public void actionPerformed(ActionEvent arg) {
		if(arg.getActionCommand().equals("open")) {
			System.out.println("OPEN") ;
			//JFileChooser
			//设置选择保存文件的目录功能
			JFileChooser jfc1 = new JFileChooser();
			//设置名字
			jfc1.setDialogTitle("请选择文件....");
			//默认方式显示
			jfc1.showOpenDialog(null) ;
			//显示
			jfc1.setVisible(true);
			//得到用户选择文件的路径
			String filename = jfc1.getSelectedFile().getAbsolutePath() ;
//			System.out.println(filename) ;
			//bufferReader读取字符较快
			FileReader fr = null ;
			BufferedReader br = null;
			try {
				fr = new FileReader(filename) ;
				br = new BufferedReader(fr) ;
				
				//从文件中读取信息并显示到jta即可
				
				String s = "" ;
				String allcon = "" ;
				try {
					while((s = br.readLine())!=null) {
						allcon += s+"\r\n" ;
					}
					jt.setText(allcon);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if(arg.getActionCommand().equals("save")){
			JFileChooser jfc = new JFileChooser() ;
			jfc.setDialogTitle("另存为....");
			//按照默认方式显示
			jfc.showSaveDialog(null) ;
			jfc.setVisible(true);
			//获取用户希望将文件保存到的文件路径
			String file = jfc.getSelectedFile().getAbsolutePath() ;
			
			//准备写入到指定文件
			FileWriter fw = null ;
			BufferedWriter bw = null ;
			//准备写入指定文件
			
			try {
				
				fw = new FileWriter(file) ;
				bw = new BufferedWriter(fw) ;
				bw.write(this.jt.getText()) ;
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}	
