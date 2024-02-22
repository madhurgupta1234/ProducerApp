package com.kafka.ProducerApplication.controller;

import com.kafka.ProducerApplication.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "api/wikimedia")
public class WikimediaController {

    @Autowired
    private KafkaService kafkaService;

    @RequestMapping(path = "/get")
    public ResponseEntity<?> apiHitStream(){
          for(int i=0; i<(int)(1e7); i++){
          String change = (int)(Math.random() * 100) + " amount changed";
          this.kafkaService.wikimediaChange(change);}
          return ResponseEntity.ok(Map.of("message:", "sucess"));
    }
}
