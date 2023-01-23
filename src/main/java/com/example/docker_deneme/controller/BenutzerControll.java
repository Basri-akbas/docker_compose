package com.example.docker_deneme.controller;

import com.example.docker_deneme.entity.Benutzer;
import com.example.docker_deneme.service.BenutzerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping()
public class BenutzerControll {

    private final BenutzerService benutzerService;

    @PostMapping(path="/register")
    public ResponseEntity<Map<String, Boolean>> registerUser(@Valid @RequestBody Benutzer user){
        //TODO yeni bir UserDTO olusturmak gerekir
        benutzerService.register(user);

        Map<String, Boolean> map = new HashMap<>();
        map.put("User registered successfully!", true);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping("/users/all")
    public ResponseEntity<List<Benutzer>> getAllUsers(){
        List<Benutzer> users=benutzerService.getAllUsers();

        return new ResponseEntity<>(users,HttpStatus.OK);
    }

}
