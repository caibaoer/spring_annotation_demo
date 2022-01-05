package org.com.dao;

import org.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(User user){
        jdbcTemplate.execute(
                "insert into t_user (id,name,age)" +
                        " values ('"+user.getId()+"','"+user.getName()+"','+"+user.getAge()+"')");
    }
}
