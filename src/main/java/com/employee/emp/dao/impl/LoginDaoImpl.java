package com.employee.emp.dao.impl;

import com.employee.emp.dao.LoginDao;
import com.employee.emp.entity.LoginEntity;

import java.util.HashMap;
import java.util.Map;

public class LoginDaoImpl implements LoginDao {
    Map<String, String> data = new HashMap<>(10);

    public LoginDaoImpl() {
        data.put("admin", "adminPassword");
        data.put("user", "userPassword");
        data.put("sanjay", "sanjayPassword");
    }

    @Override
//    public String login(LoginEntity loginEntity) {
//        if (loginEntity.getUsername().equals("admin")) {
//            return "adminPassword";
//        } else if (loginEntity.getUsername().equals("user")) {
//            return "userPassword";
//        }
//        return "";
//    }
    public String login(LoginEntity loginEntity) {
        if (data.containsKey(loginEntity.getUsername())) {
            return data.get(loginEntity.getUsername());
        }
        return "";
    }
}
