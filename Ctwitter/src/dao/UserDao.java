package dao;

import java.util.List;

import entity.User;
import util.BaseDao;

public class UserDao {
	public List<User> getuser(){
		return (List<User>)BaseDao.select("select * from User",User.class,null);
	}
	public boolean insertuser(User user){
		return BaseDao.execute("insert into article values(null,?,?,?,?)", user.getUsername(),user.getUserpet(),user.getUsernumber(),user.getUsermail(),user.getUserpwd(),user.getUserregion(),user.getUserdate())>0;
	}
	

}
