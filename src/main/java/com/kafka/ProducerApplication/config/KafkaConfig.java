package com.kafka.ProducerApplication.config;

import com.kafka.ProducerApplication.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name(AppConstants.LOCATION_UPDATE_TOPIC).build();
    }

    @Bean
    public NewTopic wikimediaTopicConfig(){
        return TopicBuilder.name(AppConstants.WIKIMEDIA_TOPIC_NAME).build();
    }

}
