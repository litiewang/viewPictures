package xyz.lyxself.pictures.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lyxself.pictures.entity.Pictures;
import xyz.lyxself.pictures.service.PicturesService;
@RestController
@RequestMapping("pictures")
@CrossOrigin(value = "*", allowCredentials = "true")
public class PicturesController {
	@Autowired
	private PicturesService picturesService;
	@GetMapping("/all")
	private List<Pictures> findAll() {
		return picturesService.findAll();
	}
	@GetMapping("/ById/{id}")
	private Pictures findById(@PathVariable Long id) {
		return picturesService.findById(id);
	}
}
