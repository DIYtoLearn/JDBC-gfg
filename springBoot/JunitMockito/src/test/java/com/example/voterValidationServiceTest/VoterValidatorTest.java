package com.example.voterValidationServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.voterValidationRepo.VoterRepo;
import com.example.voterValidationService.InvalidVoterException;
import com.example.voterValidationService.VoterValidator;



@ExtendWith(MockitoExtension.class)
public class VoterValidatorTest 
{
//	static VoterValidator vv;
	
	@Mock
	VoterRepo repo;
	
	@InjectMocks
	VoterValidator service;
	
	
	
	
	    @Test
		public void validateVoterAgeInvalidExcptionTest() throws InvalidVoterException
		{
		   String voterId="1AHBP12456";
		   
		   service.getVoterId(1);
		   
		   Mockito.when(repo.getVoterId(1)).thenReturn(voterId);
		   
		   String res=service.getVoterId(1);
		   
		   assertEquals(res,voterId);
		   
		   
		     
		}
	
	
	
	
	
	
//	@BeforeAll
//	public static void setUp()
//	{
//		vv= new VoterValidator();
//	}
//	
//	@AfterAll
//	public static void cleanUp()
//	{
//		vv= null;
//	}
//	
//	
//	
//	
//	@Test
//	@Order(1)
//	@Tag("dev")
//	public void validateVoterAgeValidTest() throws InvalidVoterException
//	{
//		int age = 18;
//		
//		boolean result=vv.validateVoterAge(age);
//		assertTrue(result);
//		
//	}
	
//	@Test
//	@Order(2)
//	@Tag("test")
//	public void validateVoterAgeInvalidTest() throws InvalidVoterException
//	{
//		int age = 15;
//		
//		boolean result=vv.validateVoterAge(age);
//		assertFalse(result);
//	}
//	
//    @Test
//    @Order(3)
//    @Tag("prod")
//	public void validateVoterAgeInvalidExcptionTest() throws InvalidVoterException
//	{
//    	int age = -1;
//    	
//	    Exception e= assertThrows(InvalidVoterException.class, ()-> vv.validateVoterAge(age));
//	     assertEquals("enter a valid age",e.getMessage());
//	     
//	}
//    
//  
//    @Order(4)
//    @Tag("prod")
//    @ParameterizedTest
//    @CsvSource(value= {"19,true","20,true","17,false","16,false"})
//	public void validateVoterAgeParameterizedTest(int age,boolean expected) throws InvalidVoterException
//	{
//    	boolean actual=vv.validateVoterAge(age);
//    	assertEquals(expected,actual);
//	     
//	}
//    
    
    

	
}
