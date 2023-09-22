package com.mycompany.sms.daoimpl;

import com.mycompany.sms.dao.UserDAO;
import com.mycompany.sms.database.QueryManager;
import com.mycompany.sms.model.User;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {
    
private QueryManager queryManager;

    public UserDAOImpl() {
        queryManager = new QueryManager();
    }

    @Override
    public boolean login(User user) {
        ResultSet result = queryManager.userValidate(user);
        if(result!=null){
            return true;
        }else{
            return false;
        }
    }
    
}
