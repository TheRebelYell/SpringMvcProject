package app.controller;

import app.entity.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "redirect:/users";
    }

    /* LIST */
    @GetMapping("/users")
    public ModelAndView userList() {
        List<User> userList = userService.getAllUsers();
        return new ModelAndView("users", "userList", userList);
    }
    /* GET BY ID */
    @GetMapping("/user/{id}")
    public ModelAndView userById(@PathVariable("id") int id) {
        User userById = userService.getUserById(id);
        return new ModelAndView("user", "user", userById);
    }

    /* ADD */
    @GetMapping("/add_user")
    public String createUserPage() {
        return "add_user";
    }

    @PostMapping("/add_user")
    public String addUser(@ModelAttribute("user") User user) {
        userService.insertUser(user);
        return "redirect:/users";
    }

    /* EDIT */
    @GetMapping("/edit_user/{id}")
    public ModelAndView editUserPage(@PathVariable("id") int id) {
        User editedUser = userService.getUserById(id);
        return new ModelAndView("edit_user", "user", editedUser);
    }

    @PostMapping("/edit_user/{id}")
    public String updateUser(@ModelAttribute("user") User user, @PathVariable int id) {
        userService.updateUser(user);
        return "redirect:/user/" + user.getId();
    }

    /* DELETE */
    @GetMapping("/delete_user/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUserById(id);
        return "redirect:/users";
    }
}
