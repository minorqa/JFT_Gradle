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

    public PythagoreanTriplet createPythagoreanTriplet(double cathetus_1, double cathetus_2, double expectedHypotenuse){
        PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet();
        pythagoreanTriplet.cathetus_1 = cathetus_1;
        pythagoreanTriplet.cathetus_2 = cathetus_2;
        pythagoreanTriplet.expectedHypotenuse = expectedHypotenuse;
        return pythagoreanTriplet;
    }
}