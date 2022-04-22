package com.example.sandbox;

import com.example.distance.models.Point;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.distance.DistanceApplication.distance;
import static com.example.distance.DistanceApplication.setCoordinates;
import static com.example.sandbox.TestBase.logBusiness;
import static org.testng.internal.collections.Ints.asList;

public class SandboxApplicationTests {


    @DataProvider
    public Object[][] distanceTestDataProvider(){
        return new Object[][]{
                {
                        asList(3,4,5)
                },
                {
                        asList(5,12,13)
                },
                {
                        asList(8,15,17)
                },
                {
                        asList(7,24,25)
                },
                {
                        asList(36,77,85)
                },
                {
                        asList(65,72,97)
                }
        };
    }

    @Test(dataProvider = "distanceTestDataProvider", groups = {"P0, Sandbox.FUNC"})
    public void distanceTest(ArrayList<Integer> pythagoreanTriplet) {
        logBusiness(">>> 1. Comparing calculated hypotenuse length with value from Pythagorean triplet["+pythagoreanTriplet.get(0)+ ", " + pythagoreanTriplet.get(1) + ", " + pythagoreanTriplet.get(2) +"]");
        verifyPythagoreanTriplet(pythagoreanTriplet);
    }

    public void verifyPythagoreanTriplet(ArrayList<Integer> pythagoreanTriplet){
        Point p1= new Point();
        Point p2 = new Point();

        setCoordinates(p1, 0, Double.valueOf(pythagoreanTriplet.get(0)));
        setCoordinates(p2, Double.valueOf(pythagoreanTriplet.get(1)), 0);
        Assert.assertEquals(distance(p1, p2), Double.valueOf(pythagoreanTriplet.get(2)), "Pythagorean Triplet is not verified.");
    }
}