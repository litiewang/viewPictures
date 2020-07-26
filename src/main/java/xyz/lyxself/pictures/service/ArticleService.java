package xyz.lyxself.pictures.service;

import java.util.List;

import xyz.lyxself.pictures.entity.Article;

public interface ArticleService extends BaseService<Article> {
	public List<Article> findAll();
}
