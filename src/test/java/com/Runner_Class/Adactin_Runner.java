
package com.Runner_Class;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\Feature_file\\Automatin.Feature",
                    glue="com.Step_Definition")
public class Adactin_Runner {

}
