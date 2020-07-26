package xyz.lyxself.pictures.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.lyxself.pictures.dao.ArticleDao;
import xyz.lyxself.pictures.entity.Article;
import xyz.lyxself.pictures.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List<Article> findAll() {
		return articleDao.findAll();
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Article findById(Long id) {
		return articleDao.findById(id).get();
	}
}
