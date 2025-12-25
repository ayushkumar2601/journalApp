package com.ayush.journal.controller;

import com.ayush.journal.entity.JournalEntry;
import com.ayush.journal.entity.User;
import com.ayush.journal.service.JournalEntryService;
import com.ayush.journal.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @GetMapping
//    public ResponseEntity<?> getAllUser(){
//       List<User> all= userService.getAll();
//       if(all!=null && !all.isEmpty()){
//           return new ResponseEntity<>(all,HttpStatus.OK);
//       }
//       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @GetMapping("/user/{userId}")
//    public ResponseEntity<?> getUserById(PathVariable ObjectId userId){
//        Optional<User> userEntry=UserService.findById(userId);
//        if(userEntry.isPresent()){
//            return new ResponseEntity<>(userEntry.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    }

}