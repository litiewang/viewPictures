package xyz.lyxself.pictures.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.lyxself.pictures.entity.Article;
import xyz.lyxself.pictures.service.ArticleService;

@RestController
@RequestMapping("article")
@CrossOrigin(value = "*", allowCredentials = "true")
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@GetMapping("/all")
	private List<Article> findAll() {
		return articleService.findAll();
	}
	@GetMapping("/ById/{id}")
	private Article findById(@PathVariable Long id) {
		return articleService.findById(id);
	}
}
