package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.lyxself.pictures.entity.Article;

@Repository
public interface ArticleDao extends JpaRepository<Article, Long> {

}

