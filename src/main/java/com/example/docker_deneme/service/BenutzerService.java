package com.example.docker_deneme.service;

import com.example.docker_deneme.entity.Benutzer;
import com.example.docker_deneme.repository.BenutzerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class BenutzerService {

    @Autowired
    private BenutzerRepository benutzerRepository;

    public Benutzer register(Benutzer user){

        Benutzer userresult=benutzerRepository.save(user);

        return userresult;
    }

    public List<Benutzer> getAllUsers(){
        return benutzerRepository.findAll();
    }


}
