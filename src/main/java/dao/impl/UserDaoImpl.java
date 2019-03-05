package dao.impl;

import dao.UserDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @desciption:
 * @author: Demon
 * @version: 1.0 2019-03-04 20:18
 **/
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    @Override
    public void save(String username, String password) {
        //使用Spring提供的JDBC模板可以直接执行SQL语句
        this.getJdbcTemplate().update("insert into user(id,username,password) values(?,?,?)",null,username,password);
    }
}
