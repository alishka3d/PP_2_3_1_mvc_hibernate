package web.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAOImpl;
import web.model.User;

import java.util.List;

@Service
@Transactional
@Getter
@Setter
public class UserServiceImpl implements UserService {

    private UserDAOImpl userDAO;

    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void saveUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void updateUser(int id, User user) {
        userDAO.updateUser(id, user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
