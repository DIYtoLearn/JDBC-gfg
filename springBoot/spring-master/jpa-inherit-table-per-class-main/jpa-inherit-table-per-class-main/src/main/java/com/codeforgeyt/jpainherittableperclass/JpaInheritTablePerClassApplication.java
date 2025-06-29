package com.codeforgeyt.jpainherittableperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeforgeyt.jpainherittableperclass.model.FireSpell;
import com.codeforgeyt.jpainherittableperclass.model.FrostSpell;
import com.codeforgeyt.jpainherittableperclass.model.Spell;
import com.codeforgeyt.jpainherittableperclass.repository.FireSpellRepository;
import com.codeforgeyt.jpainherittableperclass.repository.FrostSpellRepository;
import com.codeforgeyt.jpainherittableperclass.repository.SpellRepository;

@SpringBootApplication
public class JpaInheritTablePerClassApplication implements CommandLineRunner {

	@Autowired
	 FireSpellRepository fireSpellRepository;
	@Autowired
	 FrostSpellRepository frostSpellRepository;
	@Autowired
	SpellRepository spellRepository;
	
	
    public static void main(String[] args) {

    	SpringApplication.run(JpaInheritTablePerClassApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		 Spell arcaneSpark =
	                new Spell("Arcane Spark", 50, 60);
	        Spell fireBall =
	                new FireSpell("Fireball", 100, 100, 100, 2000);
	        Spell meteorShower =
	                new FireSpell("Meteor Shower", 400, 300, 300, 3000);
	        Spell frostBolt =
	                new FrostSpell("Frost Bolt", 80, 80, true, 300);

	        spellRepository.save(arcaneSpark);
	        fireSpellRepository.save(fireBall);
	        fireSpellRepository.save(meteorShower);
	        frostSpellRepository.save(frostBolt);
		
	}

}
