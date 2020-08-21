package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Wenzhanglist;

@Repository
public interface  WenzhanglistDao extends JpaRepository<Wenzhanglist, Integer> {

}

