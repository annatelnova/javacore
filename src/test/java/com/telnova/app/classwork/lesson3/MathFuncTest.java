package com.telnova.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Мир on 15.03.2017.
 */
public class MathFuncTest {

    @Test
    public void multiplyTest(){
        int a = 2;
        int b = 2;
        MathFunc mathFunc = new MathFunc ();
       int actualResult = mathFunc.multiply(a, b);
       int expectedResult = 4;
       Assert.assertEquals (expectedResult, actualResult);
    }
    @Test
    public void summTest () {
        int c = 2;
        int d = 3;
        MathFunc mathFunc = new MathFunc ();
        int actualResult = mathFunc.summ(c, d);
        int expectedResult = 5;
        Assert.assertEquals (expectedResult, actualResult);
}

}
