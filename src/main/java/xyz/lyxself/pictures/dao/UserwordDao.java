package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Userword;

@Repository
public interface  UserwordDao extends JpaRepository<Userword, Integer> {

}

