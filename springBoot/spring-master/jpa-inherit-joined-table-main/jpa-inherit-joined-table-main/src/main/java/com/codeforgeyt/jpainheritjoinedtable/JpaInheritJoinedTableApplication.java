package com.codeforgeyt.jpainheritjoinedtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeforgeyt.jpainheritjoinedtable.model.Archer;
import com.codeforgeyt.jpainheritjoinedtable.model.Infantry;
import com.codeforgeyt.jpainheritjoinedtable.model.InfantryType;
import com.codeforgeyt.jpainheritjoinedtable.model.Knight;
import com.codeforgeyt.jpainheritjoinedtable.repository.ArcherRepository;
import com.codeforgeyt.jpainheritjoinedtable.repository.KnightRepository;

@SpringBootApplication
public class JpaInheritJoinedTableApplication implements CommandLineRunner {

//	@Autowired
//	ArcherRepository archerRepository;
	
	@Autowired
	KnightRepository knightRepository;
	
	
	 public static void main(String[] args) {

	    	SpringApplication.run(JpaInheritJoinedTableApplication.class, args);
	    }

	@Override
	public void run(String... args) throws Exception {
		//Infantry archer = new Archer(InfantryType.LIGHT, 300, 500, 100, "1000");
		Infantry knight = new Knight(InfantryType.HEAVY, 280, 1000, 300, true);
	

		//archerRepository.save(archer);
		knightRepository.save(knight);

		//knightRepository.delete(knight);
		}


}
