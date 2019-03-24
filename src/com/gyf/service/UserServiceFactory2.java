package com.gyf.service;

public class UserServiceFactory2 {
    public  IUserService createUserService(){

        return new UserServiceImpl();
    }
}
