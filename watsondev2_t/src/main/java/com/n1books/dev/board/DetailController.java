package com.n1books.dev.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board/{bno}/{pg}/{ano}")
public class DetailController {

	@RequestMapping("/")
	public String detail(
		@PathVariable int bno, 
		@PathVariable int ano,
		Model model) {
		model.addAttribute(
			"msg", bno + "번 게시판의 " + ano + "번 게시물 상세보기 입니다.");
		return "detail";
	}
	
	@RequestMapping("/update")
	public String update(
		@PathVariable int bno, 
		@PathVariable int ano,
		Model model) {
		model.addAttribute("msg", bno + "번 게시판 " + ano + " 게시물의 수정 화면 입니다.");
		return "update";
	}
	
	@RequestMapping("/delete")
	public String delete(
		@PathVariable int bno, 
		@PathVariable int ano,
		Model model) {
		model.addAttribute("msg", bno + "번 게시판 " + ano + " 게시물의 삭제 화면 입니다.");
		return "delete";
	}
}
