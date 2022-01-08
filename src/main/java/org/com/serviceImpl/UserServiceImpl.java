package org.com.serviceImpl;

import org.com.dao.UserDao;
import org.com.pojo.User;
import org.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserServiceImpl implements UserService {

    public String name;



    @Autowired
    private UserDao userDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @PostConstruct
    public void setNamefromDatabase(){
       /* jdbcTemplate.execute(
                "insert into t_user (id,name,age)" +
                        " values ('33','33','33')");*/
    }
}
