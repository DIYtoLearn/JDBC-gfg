package com.codeforgeyt.jpainheritsingletable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeforgeyt.jpainheritsingletable.model.ArtPiece;
import com.codeforgeyt.jpainheritsingletable.model.Material;
import com.codeforgeyt.jpainheritsingletable.model.Painting;
import com.codeforgeyt.jpainheritsingletable.model.PaintingTechnique;
import com.codeforgeyt.jpainheritsingletable.model.Sculpture;
import com.codeforgeyt.jpainheritsingletable.repository.PaintingRepository;
import com.codeforgeyt.jpainheritsingletable.repository.SculptureRepository;


@SpringBootApplication
public class JpaInheritSingleTableApplication implements CommandLineRunner{

	@Autowired
    SculptureRepository sculptureRepository;
	@Autowired
	PaintingRepository paintingRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaInheritSingleTableApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ArtPiece sculpture = new Sculpture("John Doe", Material.WOOD, 200.2);
		ArtPiece painting = new Painting("Thom Smith", PaintingTechnique.OIL, 25.5, 44.9);
	

	//	sculptureRepository.save(sculpture);
	//	paintingRepository.save(painting);

		sculptureRepository.deleteById(1L);
		paintingRepository.deleteById(2L);
		
	}
	
	
	
	//static public static void main(String[] args) {
//		ConfigurableApplicationContext configurableApplicationContext =
//				SpringApplication.run(JpaInheritSingleTableApplication.class, args);
//		ArtPieceRepository sculptureRepository =
//				configurableApplicationContext.getBean(SculptureRepository.class);
//		ArtPieceRepository paintingRepository =
//				configurableApplicationContext.getBean(PaintingRepository.class);

		
//		ArtPiece sculpture = new Sculpture("John Doe", Material.WOOD, 200.2);
//		ArtPiece painting = new Painting("Thom Smith", PaintingTechnique.OIL, 25.5, 44.9);
//
//		@Override
//		public void run(String... args) throws Exception {
//			// TODO Auto-generated method stub
//			
//		}

//		sculptureRepository.save(sculpture);
//		paintingRepository.save(painting);

//		sculptureRepository.delete(sculpture);
//		paintingRepository.delete(painting);
	}

