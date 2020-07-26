package xyz.lyxself.pictures.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.lyxself.pictures.entity.Pictures;

@Repository
public interface PicturesDao extends JpaRepository<Pictures, Long> {

}
