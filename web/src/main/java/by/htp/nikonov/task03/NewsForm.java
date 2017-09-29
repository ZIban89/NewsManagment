package by.htp.nikonov.task03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import by.htp.nikonov.task03.entity.Content;
import by.htp.nikonov.task03.entity.News;

public class NewsForm {
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyy");
	
	private Integer id;
	@Size(min=1, max=100, message="from 1 to 100 characters")
	private String title;
	@Pattern(regexp = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$", message="mm/dd/yyy")
	private String date;
	@Size(min=1, max=500, message="from 1 to 500 characters")
	private String brief;

	private Integer contentId;
	@Size(min=1, max=2048, message="from 1 to 2048 characters")
	private String content;

	public NewsForm() {
		date=dateFormat.format(new Date());
	};

	
	public NewsForm(News news) {
		this.id = news.getId();
		this.title = news.getTitle();
		this.date = dateFormat.format(news.getDate());
		this.brief = news.getBrief();
		this.content = news.getContent().getContent();
		this.contentId=news.getContent().getId();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getContentId() {
		return contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}

	public News getNewsByForm() throws ParseException {
		News news = new News();
		news.setId(this.id);
		news.setBrief(this.brief);
		Content con= new Content();
		con.setId(this.contentId);
		con.setContent(this.content);
		news.setContent(con);
		news.setTitle(this.title);
		news.setDate(dateFormat.parse(this.date));	
	
		return news;
	}
}
