package com.SpringHibernate.test;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringHibernate.dao.MovieDao;
import com.SpringHibernate.entities.Movie;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"config/spring-configuration.xml");
		String a = "Ang Lee";
		Movie lifeOfPi = new Movie();
	
		lifeOfPi.setReleaseYear(2012);
		lifeOfPi.setDirector(a);
		lifeOfPi.setTitle("Life of Pi 2");

		Movie dabangg2 = new Movie();
		dabangg2.setReleaseYear(2012);
		dabangg2.setDirector("Arbaaz Khan");
		dabangg2.setTitle("Dabangg 4");

		MovieDao movieDao = (MovieDao) appContext.getBean("movieDao");
		movieDao.createMovie(lifeOfPi);
		movieDao.createMovie(dabangg2);
		
	
	}
}