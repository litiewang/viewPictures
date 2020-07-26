package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Article;
import xyz.lyxself.pictures.entity.Oneword;

@Repository
public interface  OnewordDao extends JpaRepository<Oneword, String> {

}

