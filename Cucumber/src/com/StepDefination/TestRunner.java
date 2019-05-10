package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="newTours",glue={"com.NewTours_LogInTest"})

public class TestRunner {

}
