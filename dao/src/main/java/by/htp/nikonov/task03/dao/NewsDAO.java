package by.htp.nikonov.task03.dao;

import java.util.List;

import by.htp.nikonov.task03.entity.News;

public interface NewsDAO {
	
	public List<News> getNewsList();
	
	public  News getNewsById(Integer id);
	
	public void deleteNews(Integer id);
	
	public void deleteNews(News news);
	
	public void saveNews(News news);

}
