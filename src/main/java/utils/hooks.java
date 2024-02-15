package utils;

import io.cucumber.java.*;

public class hooks {

    @BeforeAll
    public static void before_All(){
    }

    @Before
    public static void before(){
        driverFactory.setDriver();
    }
    @BeforeStep
    public static void beforeStep(){
    }
    @AfterStep
    public static void afterStep(){
    }
    @After
    public static void after(){
        driverFactory.quitDriver();
    }
    @AfterAll
    public static void after_All(){
    }

}
