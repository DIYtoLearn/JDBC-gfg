package com.example.voterValidationServiceTest;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("My Spring Boot Application Test Suite")
@SelectClasses({VoterValidatorTest.class})
//@SelectClasses({MyControllerTest.class, MyServiceTest.class})
//@SelectPackages("com.example.myapp.tests")
@ExcludeTags("prod")
public class VoterTestSuite {

}
