package com.portfolio.ap.controller;

import com.portfolio.ap.entity.User;
import com.portfolio.ap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-argprog2022.web.app")
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    private UserRepository UserRepository;
    
    @GetMapping("/user/{id}")
    @ResponseBody
    public User usuario(@PathVariable Integer id){
        return(UserRepository.findById(id).get());
    }

    
    @PostMapping("/user/login")
    @ResponseBody
    public User login(@RequestBody User u){
        return(UserRepository.findByUsernameAndPassword(u.getUsername(), u.getPassword()));
    }
    
    @PostMapping("/user/add")
    public void newUser(@RequestBody User u){
        UserRepository.save(u);
    }
    
    @PutMapping("/user/edit")
    public void editUser(@RequestBody User u){
        UserRepository.save(u);
    }
    
    @DeleteMapping("/user/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        UserRepository.deleteById(id);
    }    
}
