package com.nesoft.servletTest.service;

public interface IUserService<T> {

    int insertInfo(T t);

    T login(T t);

}
