package com.db.TreeDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	@RequestMapping("treeview")
	public String goToTreeview(@RequestParam("level1") String level1,@RequestParam("level2") String level2,Model model) {
		model.addAttribute("level1",level1);
		model.addAttribute("level2",level2);
		return "treeview";
	}
}
