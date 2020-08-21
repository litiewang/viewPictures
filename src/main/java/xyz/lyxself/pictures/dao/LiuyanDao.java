package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Liuyan;

@Repository
public interface  LiuyanDao extends JpaRepository<Liuyan, Integer> {

}

