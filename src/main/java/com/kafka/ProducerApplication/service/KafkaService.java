package com.kafka.ProducerApplication.service;

import com.kafka.ProducerApplication.constants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location){
          this.kafkaTemplate.send(AppConstants.LOCATION_UPDATE_TOPIC, location);
          return true;
    }

    public boolean wikimediaChange(String change){
        this.kafkaTemplate.send(AppConstants.WIKIMEDIA_TOPIC_NAME, change);
        return true;
    }
}
