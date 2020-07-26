package xyz.lyxself.pictures.service;

import java.util.List;

import xyz.lyxself.pictures.entity.Pictures;

public interface PicturesService extends BaseService<Pictures> {
	public List<Pictures> findAll();
}
