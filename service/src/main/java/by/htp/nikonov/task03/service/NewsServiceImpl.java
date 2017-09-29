package by.htp.nikonov.task03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.htp.nikonov.task03.dao.NewsDAO;
import by.htp.nikonov.task03.entity.News;

@Service
@Transactional
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsDAO newsDao;
	
	@Override
	
	public List<News> getNewsList(){
		return newsDao.getNewsList();
	}

	@Override
	public News getNewsById(Integer id) {		
		return newsDao.getNewsById(id);
		
	}

	@Override
	public void deleteNews(Integer id) {
		newsDao.deleteNews(id);
	}

	@Override
	public void deleteNews(News news) {
		newsDao.deleteNews(news);
		
	}

	@Override
	public void saveNews(News news) {
		newsDao.saveNews(news);
		
	}

}
