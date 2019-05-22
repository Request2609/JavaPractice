package xupt.se.ttms.service;

import java.util.List;

import xupt.se.ttms.dao.UserDao;
import xupt.se.ttms.idao.DAOFactory;
import xupt.se.ttms.model.Employee;
import xupt.se.ttms.model.UserRight;

public class LoginedUser extends Employee {

	public boolean verifyUser(Employee user) {
		UserDao udao = new UserDao() ;
		Employee tmp = udao.verify(user) ;
		if(tmp.getName().equals(user.getName())&&tmp.getName().equals(user.getName())) {
			return true ;
		}
		return false ;
	}

	public static List<Employee> getAllUser() {
	    List<Employee>list = null ;
	    UserDao dao = DAOFactory.creatUserDAO() ;
	    list = dao.selectAll("") ;
	    return list ;
    }

//    public int modify(Employee user){
//        return UserDao.update(user);
//    }

    public int delete(int ID){
	    DAOFactory handle = new DAOFactory() ;
	    UserDao dao = handle.creatUserDAO() ;
	    return dao.delete(ID) ;
	}


}
