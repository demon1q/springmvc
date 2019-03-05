package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

/**
 * @desciption:
 * @author: Demon
 * @version: 1.0 2019-03-04 20:38
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/savePage")
    public String savePage(){
        return "view/save";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(String username, String password, Model model){
        userService.save(username,password);
        model.addAttribute("message","success");
        return "view/success";
    }
}
