package com.anupam.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ObjectMapper om = new ObjectMapper();
//			Student s = om.readValue(new File("data/sample-lite.json"), Student.class);
			Student s = om.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println(s.getFirstName());
			System.out.println(s.getAddress().getCity());
			System.out.println(s.getLanguages().length);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
