package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Shouyeliuyan;

@Repository
public interface  ShouyeliuyanDao extends JpaRepository<Shouyeliuyan, Integer> {

}

