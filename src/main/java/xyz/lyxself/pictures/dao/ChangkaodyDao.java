package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.lyxself.pictures.entity.Changkaody;

@Repository
public interface  ChangkaodyDao extends JpaRepository<Changkaody, String> {

}

