package com.test.testrobolectric;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;

/**
 * Created by rex.yau on 4/24/2015.
 */
@RunWith(CustomRobolectricRunner.class)
@Config(emulateSdk = 21, constants = BuildConfig.class)
public class FirstTestCase {

    MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void testOne() {
        Assert.assertTrue(activity.getTestContext() != null);
    }

    @Test
    public void testTwoForFail() {
        Assert.assertTrue(activity.getTestContext() == null);
    }
}
