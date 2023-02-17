package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Project\\3PMCucumber\\src\\test\\java\\com\\feature\\login.feature",
glue = "com.stepdefinition",monochrome = true,
plugin={
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner {




}
