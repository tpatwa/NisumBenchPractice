package com.SpringHibernate.dao.impl;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.SpringHibernate.dao.MovieDao;
import com.SpringHibernate.entities.Movie;

public class MovieDaoImpl implements MovieDao {

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void createMovie(Movie movie) {
		hibernateTemplate.save(movie);
	}

	

}