package com.employee.emp.controller;

import com.employee.emp.form.LoginReqForm;
import com.employee.emp.service.LoginService;
import com.employee.emp.service.impl.LoginServiceImpl;

public class LoginController {

    LoginService service = new LoginServiceImpl();

    public String login(LoginReqForm reqForm) {
        if (reqForm != null) {
            if( (reqForm.getUsername() != null ||reqForm.getUsername().isEmpty()) && (reqForm.getPassword() != null || reqForm.getPassword().isEmpty())) {
                String response = service.login(reqForm);
               return response;
            }
        }
        return null;

    }
}
