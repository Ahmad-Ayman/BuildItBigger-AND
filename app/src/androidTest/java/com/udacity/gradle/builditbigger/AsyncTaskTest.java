package com.udacity.gradle.builditbigger;


import android.support.v4.util.Pair;


import org.junit.Test;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;


@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest extends AndroidTestCase {

    @Test
    public void connectedTestForAsyncTaskResponse() {

        try {

            EndpointsAsyncTask task = new EndpointsAsyncTask();

            task.execute(new Pair<>(getContext(), "Manfred"));

            String jokeRetrieved = task.get(30, TimeUnit.SECONDS);


            assertNotNull(jokeRetrieved);// make sure the joke is not null
            //assertNull(joke); //>> this make the test fail and this is log :-
            /*
            Expected: <null> but was: Q: How many prolog programmers does it take to change a lightbulb? A: Yes.
             */
            assertTrue(jokeRetrieved.length() > 0);// make sure the joke is not empty string

        } catch (Exception e) {

            fail(e.getMessage());

        }


    }

}
