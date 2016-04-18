package board001.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@RequestMapping("list.do")
	public String list() {
		System.out.println("컨트롤러 들어옴");
		return "test";
	}
	
	public static void main(String[] args) {
		System.out.println("됨???");
	}
}
