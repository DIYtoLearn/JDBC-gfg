package com.example.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.example.User;

public class CsvHelper
{
	public static List<User> csvToUser(InputStream is) 
	{
		try(BufferedReader fileReader = new BufferedReader(new InputStreamReader(is,"UTF-8")))
		{
			 @SuppressWarnings("deprecation")
			CSVParser csvParser = new CSVParser(fileReader,CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
			 List<User> users = new ArrayList<>();
			 
			 for(CSVRecord csvRecord: csvParser)
			 {
				 User user = new User();
				 user.setId(Integer.parseInt(csvRecord.get("id")));
				 user.setName(csvRecord.get("name"));
				 user.setEmail(csvRecord.get("email"));
				 users.add(user);
			 }
				return users;
			
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;

	}
}
