package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Ztlijuyuanwen;

@Repository
public interface  ZtlijuyuanwenDao extends JpaRepository<Ztlijuyuanwen, Integer> {

}

