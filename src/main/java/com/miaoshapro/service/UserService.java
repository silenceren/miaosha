package com.miaoshapro.service;

import com.miaoshapro.error.BusinessException;
import com.miaoshapro.service.model.UserModel;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import java.io.IOException;

@Service
public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException, IOException, SAXException;

    //telphone:用户注册手机
    //password：用户加密后的密码
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
