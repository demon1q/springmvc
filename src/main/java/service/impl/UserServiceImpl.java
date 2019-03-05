package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

/**
 * @desciption:
 * @author: Demon
 * @version: 1.0 2019-03-04 20:31
 **/
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save(String username, String password) {
        userDao.save(username,password);
    }
}
