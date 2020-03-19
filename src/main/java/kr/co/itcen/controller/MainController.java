package kr.co.itcen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.itcen.dto.Wjdxo;
import kr.co.itcen.service.WjdxoService;

@Controller
public class MainController {

	@Autowired
	private WjdxoService wjdxoService;
	
	@RequestMapping("/")
	public String main() {
		return "index.html";
	}
	
	@RequestMapping("/wjdxo1")
	public String wjdxo1(Wjdxo wjdxo) {
		wjdxoService.insertWjdxo(wjdxo);
		
		return "test.jsp";
	}
}
