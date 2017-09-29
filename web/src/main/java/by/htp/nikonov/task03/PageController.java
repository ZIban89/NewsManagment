package by.htp.nikonov.task03;

import java.text.ParseException;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.nikonov.task03.entity.News;
import by.htp.nikonov.task03.service.NewsService;

@Controller
public class PageController {

	@Autowired
	NewsService newsService;

	@RequestMapping("/news-list")
	public String mainPage(Model model) {

		model.addAttribute("newsList", newsService.getNewsList());

		return "newsList";
	}

	@RequestMapping("/view/{id}")
	public String viewNews(@PathVariable Integer id, Model model) {

		model.addAttribute("news", newsService.getNewsById(id));

		return "viewNews";
	}

	@RequestMapping("/edit/{id}")
	public String editNews(@PathVariable Integer id, Model model) {
		NewsForm newsForm;
		if (id < 0) {			
			newsForm = new NewsForm();
			model.addAttribute("newsForm", newsForm);
			return "addNews";

		} else {
			newsForm = new NewsForm(newsService.getNewsById(id));
			model.addAttribute("newsForm", newsForm);
			return "editNews";
		}
	}
	
	@RequestMapping("/save")
	
	public String saveNews(@Valid @ModelAttribute("newsForm") NewsForm newsForm, 
			BindingResult theBindingResult, Model model) throws ParseException {
		
		if(theBindingResult.hasErrors()) {			
			return "editNews";
		}			
		
		News news=newsForm.getNewsByForm();
		
		newsService.saveNews(news);
		return "redirect:/view/"+news.getId();
	}
	
	@RequestMapping("/delete")
	public String deleteNews(Model model, @RequestParam("id") Integer[] o) {
		for (Integer e : o) {
			newsService.deleteNews(e);
		}
		return "redirect:news-list";

	}
	
}
