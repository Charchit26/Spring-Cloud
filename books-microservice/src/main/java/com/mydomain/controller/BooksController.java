package com.mydomain.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksController {

	JSONParser parser = new JSONParser();
	
	@RequestMapping("/getAllBooks")
	public JSONArray getBooks() throws IOException, ParseException{
		JSONArray arr=(JSONArray) parser.parse(new InputStreamReader(BooksController.class.getResourceAsStream("/static/books.json")));
		return arr;
	}
	
}
