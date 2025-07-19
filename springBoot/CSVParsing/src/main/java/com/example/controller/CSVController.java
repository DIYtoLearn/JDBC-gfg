package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.User;
import com.example.util.CsvHelper;

@RestController
@RequestMapping("/api/csv")
public class CSVController 
{
	
	@PostMapping("/upload")
   public String uploadCSV(@RequestParam("file") MultipartFile file)
   {
		if(!file.getOriginalFilename().endsWith(".csv")) {
			return "only csv files are allowed";
		}
		
		try {
			List<User>  users= CsvHelper.csvToUser(file.getInputStream());
			
			return "Parsed" + users.size() +"users ";
		} catch (Exception e) {
			return "Error"+e.getMessage();
		}
   }

}
