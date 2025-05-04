package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import web.service.UserService;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
