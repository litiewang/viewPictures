package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Huiyuan;

@Repository
public interface  HuiyuanDao extends JpaRepository<Huiyuan, Integer> {

}

