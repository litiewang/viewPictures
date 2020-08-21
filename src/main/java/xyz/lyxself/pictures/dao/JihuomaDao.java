package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Jihuoma;

@Repository
public interface  JihuomaDao extends JpaRepository<Jihuoma, Integer> {

}

