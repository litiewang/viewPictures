package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Userlog;

@Repository
public interface  UserlogDao extends JpaRepository<Userlog, Integer> {

}

