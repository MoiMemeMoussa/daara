package sn.senticformation.daara.classe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class ClasseTest {

	@Autowired
	ClasseRepositoryService classeRepositoryService;

	@DisplayName(" Testing save() and findAll() repository methods")
	@Test
	void save(){
		this.classeRepositoryService.save(new Classe(Long.valueOf("1"), ClassNameEnum.AVANCE, new ArrayList<>()));
		this.classeRepositoryService.save(new Classe(Long.valueOf("2"), ClassNameEnum.JARDIN, new ArrayList<>()));
		this.classeRepositoryService.save(new Classe(Long.valueOf("3"), ClassNameEnum.MOYEN, new ArrayList<>()));
		Assertions.assertEquals(3,this.classeRepositoryService.findAll().size());
	}
}
