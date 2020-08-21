package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Lurudata;

@Repository
public interface  LurudataDao extends JpaRepository<Lurudata, Integer> {

}

