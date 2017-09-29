package by.htp.nikonov.task03.dao;

import java.util.List;

import javax.annotation.Resource;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import by.htp.nikonov.task03.entity.News;

@Repository


public class NewsDAOImpl implements NewsDAO{
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<News> getNewsList() {
		
		return sessionFactory.getCurrentSession().createQuery("from News u order by date").list();		
	}

	@Override
	public News getNewsById(Integer id) {
		
		return sessionFactory.getCurrentSession().get(News.class, id);
	}

	@Override
	public void deleteNews(Integer id) {
		
		sessionFactory.getCurrentSession().createQuery("delete from News where id="+id).executeUpdate();		
	}

	@Override
	public void deleteNews(News news) {
		
		sessionFactory.getCurrentSession().delete(news);		
	}

	@Override
	public void saveNews(News news) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(news);
	}
	
	

}
