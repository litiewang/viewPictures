package xyz.lyxself.pictures.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.lyxself.pictures.dao.PicturesDao;
import xyz.lyxself.pictures.entity.Pictures;
import xyz.lyxself.pictures.service.PicturesService;

@Service
public class PicturesServiceImpl implements PicturesService {
	@Autowired
	private PicturesDao picturesDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List<Pictures> findAll() {
		return picturesDao.findAll();
	}
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Pictures findById(Long id) {
		return picturesDao.findById(id).get();
	}

}
