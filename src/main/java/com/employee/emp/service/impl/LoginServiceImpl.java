package com.employee.emp.service.impl;

import com.employee.emp.dao.LoginDao;
import com.employee.emp.dao.impl.LoginDaoImpl;
import com.employee.emp.entity.LoginEntity;
import com.employee.emp.form.LoginReqForm;
import com.employee.emp.service.LoginService;

public class LoginServiceImpl implements LoginService {

    LoginDao dao = new LoginDaoImpl();

    @Override
    public String login(LoginReqForm reqForm) {

        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername(reqForm.getUsername());
        loginEntity.setPassword(reqForm.getPassword());
        String returnedPass = dao.login(loginEntity);
        if (returnedPass.equals(reqForm.getPassword())) {
            return "Login Success";
        }
        return "Login Failed";
    }
}
