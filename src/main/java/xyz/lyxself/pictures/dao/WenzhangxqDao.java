package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Wenzhangxq;

@Repository
public interface  WenzhangxqDao extends JpaRepository<Wenzhangxq, Integer> {

}

