package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Ztliju;

@Repository
public interface  ZtlijuDao extends JpaRepository<Ztliju, Integer> {

}

