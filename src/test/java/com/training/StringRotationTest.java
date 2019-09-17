package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringRotationTest {
    StringRotation stringRotation = new StringRotation();

    @Test
    public void test() {
        Assert.assertTrue(stringRotation.isRotationEqualizing("", ""));
        Assert.assertTrue(stringRotation.isRotationEqualizing("nachiketdoke", "dokenachiket"));
        Assert.assertFalse(stringRotation.isRotationEqualizing("nachiketdoke", "nachidokeket"));
    }
}
