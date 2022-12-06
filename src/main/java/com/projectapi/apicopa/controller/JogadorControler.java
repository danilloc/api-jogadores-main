package com.projectapi.apicopa.controller;

import com.projectapi.apicopa.model.JogadorModel;
import com.projectapi.apicopa.repository.JogadorRepository;
import jdk.jfr.DataAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostRemove;
import java.util.List;

@RestController
@RequestMapping(value = "")
public class JogadorControler {

    @Autowired
    JogadorRepository jogadorRepository;
    private JogadorModel jogadorModel;

    @GetMapping("/jogadores")
    public ResponseEntity<List<JogadorModel>> index(){
        List<JogadorModel> lista = jogadorRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping
    public ResponseEntity<JogadorModel> insertPlayer(@RequestBody JogadorModel jogadorModel){
        JogadorModel jogador = jogadorRepository.save(jogadorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogador);
    }

  @DeleteMapping("/jogadores/{id}")
    public void deleteJogador(@PathVariable Integer id ){

        jogadorRepository.deleteById(id);
  }

    @PutMapping("/jogadores/{id}")
    public JogadorModel updateJogador(@RequestBody JogadorModel jogadorModel){
        return jogadorRepository.save(jogadorModel);

    }


}
