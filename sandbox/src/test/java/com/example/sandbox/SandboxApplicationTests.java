package com.example.sandbox;

import com.example.distance.models.Point;
import com.example.distance.models.PythagoreanTriplet;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.example.distance.DistanceApplication.distance;
import static com.example.distance.DistanceApplication.setCoordinates;
import static com.example.sandbox.TestBase.logBusiness;

public class SandboxApplicationTests {


    @DataProvider
    public Object[][] distanceTestDataProvider(){
        return new Object[][]{
                {
                    PythagoreanTriplet.builder()
                            .cathetus_1(3).cathetus_2(4).expectedHypotenuse(5).build()
                },
                {
                    PythagoreanTriplet.builder()
                            .cathetus_1(5).cathetus_2(12).expectedHypotenuse(13).build()
                },
                {
                    PythagoreanTriplet.builder()
                            .cathetus_1(8).cathetus_2(15).expectedHypotenuse(17).build()
                },
                {
                    PythagoreanTriplet.builder()
                            .cathetus_1(7).cathetus_2(24).expectedHypotenuse(25).build()
                },
                {
                    PythagoreanTriplet.builder()
                            .cathetus_1(36).cathetus_2(77).expectedHypotenuse(85).build()
                },
                {
                    PythagoreanTriplet.builder()
                            .cathetus_1(65).cathetus_2(72).expectedHypotenuse(97).build()
                }
        };
    }

    @Test(dataProvider = "distanceTestDataProvider", groups = {"P0, Sandbox.FUNC"})
    public void distanceTest(PythagoreanTriplet pythagoreanTriplet) {
        logBusiness(">>> 1. Comparing calculated hypotenuse length with value from Pythagorean triplet["+pythagoreanTriplet.cathetus_1+ ", " + pythagoreanTriplet.cathetus_2 + ", " + pythagoreanTriplet.expectedHypotenuse +"]");
        verifyPythagoreanTriplet(pythagoreanTriplet);
    }

    public void verifyPythagoreanTriplet(PythagoreanTriplet pythagoreanTriplet){
        Point p1= new Point();
        Point p2 = new Point();

        setCoordinates(p1, 0, pythagoreanTriplet.cathetus_1);
        setCoordinates(p2, pythagoreanTriplet.cathetus_2, 0);
        Assert.assertEquals(distance(p1, p2), pythagoreanTriplet.expectedHypotenuse, "Pythagorean Triplet is not verified.");
    }
}