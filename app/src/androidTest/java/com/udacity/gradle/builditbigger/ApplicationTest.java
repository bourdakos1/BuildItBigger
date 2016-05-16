package com.udacity.gradle.builditbigger;

import junit.framework.TestCase;

public class ApplicationTest extends TestCase {
    public void testEmptyJoke() {
        try {
            assertEquals(false, new EndpointsAsyncTask().execute().get().equals(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testNullJoke() {
        try {
            assertNotNull(new EndpointsAsyncTask().execute().get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

