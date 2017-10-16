package server;

import java.util.List;

import dao.UserDao;
import entity.User;

public class Server {
	UserDao ud=new UserDao();
	public boolean insertusers(User u) {
		return ud.insertuser(u);
	}
    public List<User> getalluser(){
    	return ud.getuser();
    }
}
