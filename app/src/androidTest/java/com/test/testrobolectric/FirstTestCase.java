package com.test.testrobolectric;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;

/**
 * Created by rex.yau on 4/24/2015.
 */
@RunWith(RobolectricGradleTestRunner.class)
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
}
