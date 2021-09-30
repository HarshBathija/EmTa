package ncsu.se.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @CrossOrigin
    @GetMapping("/login")
    public String checkLogin(@RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password) {
        if (!checkUserName(username.toString()))
            return "Incorrect Username";
        else if (!checkPassword(password.toString()))
            return "Incorrect Password";
        else
            return "Login Successfull";
    }

    public boolean checkUserName(String usr) {
        System.out.println(usr);
        if (usr.equals("HBathij")) {
            return true;
        } else
            return false;
    }

    public boolean checkPassword(String pwd) {
        if (pwd.equals("Group104196@")) {
            return true;
        } else
            return false;

    }

}