package com.example.distance.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PythagoreanTriplet {
    public double cathetus_1;
    public double cathetus_2;
    public double expectedHypotenuse;
}