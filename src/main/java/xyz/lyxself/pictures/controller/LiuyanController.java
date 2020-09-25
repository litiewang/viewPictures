package xyz.lyxself.pictures.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.lyxself.pictures.dao.LiuyanDao;
import xyz.lyxself.pictures.entity.Liuyan;

import java.util.List;

@RestController
@RequestMapping("/liuyan")
@Api(tags = "Liuyan管理")
public class LiuyanController {
	@Autowired
	private LiuyanDao liuyanDao;
	
	@ApiOperation("获取所有liuyan列表")
	@GetMapping("/all")
	private List<Liuyan> findAll() {
		return liuyanDao.findAll();
	}
	@ApiOperation("获取liuyan详情")
	@GetMapping("/ById/{id}")
	private Liuyan findById(@PathVariable Integer id) {
		return liuyanDao.findById(id).get();
	}
}
