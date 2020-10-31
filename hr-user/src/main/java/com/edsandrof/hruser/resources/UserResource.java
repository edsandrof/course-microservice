package com.edsandrof.hruser.resources;

import com.edsandrof.hruser.entities.User;
import com.edsandrof.hruser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        return ResponseEntity.ok().body(userService.findByEmail(email));
    }
}
