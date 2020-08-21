package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Jinyicibianxi;

@Repository
public interface  JinyicibianxiDao extends JpaRepository<Jinyicibianxi, Integer> {

}

