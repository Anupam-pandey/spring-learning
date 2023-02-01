package com.anupam.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstriantValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCourseCode, ConstraintValidatorContext constraintValidatorContext) {
		// TODO Auto-generated method stub
		if(coursePrefix!=null)
			return theCourseCode.startsWith(coursePrefix);
		return true; 
	}

	
	
}
