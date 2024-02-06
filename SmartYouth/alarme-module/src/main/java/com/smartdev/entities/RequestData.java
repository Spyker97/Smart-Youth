package com.smartdev.entities;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestData {

    private String action ;


    public String toJsonString(){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Handle the exception as needed
        }
    }
}
