package com.smartdev.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestMqtt {
        private  String topic ;
        private RequestData data ;


}
