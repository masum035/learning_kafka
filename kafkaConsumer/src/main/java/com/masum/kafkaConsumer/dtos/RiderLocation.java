package com.masum.kafkaConsumer.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RiderLocation {

    private String riderId;
    private double latitude;
    private double longitude;
}
