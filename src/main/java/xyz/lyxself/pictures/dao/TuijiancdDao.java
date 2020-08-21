package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Tuijiancd;

@Repository
public interface  TuijiancdDao extends JpaRepository<Tuijiancd, Integer> {

}

