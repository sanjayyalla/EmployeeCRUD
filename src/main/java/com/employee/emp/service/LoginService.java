package com.employee.emp.service;

import com.employee.emp.dao.LoginDao;
import com.employee.emp.form.LoginReqForm;

import java.util.HashMap;
import java.util.Map;

public interface LoginService {
    public String login(LoginReqForm reqForm);
}
