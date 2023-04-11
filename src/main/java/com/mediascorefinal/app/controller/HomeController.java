package com.mediascorefinal.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mediascorefinal.app.Entity.Usuarios;
//import com.mediascorefinal.app.repository.UsersRepository;



@Controller
public class HomeController {
//	@Autowired
//	private UsersRepository IUser;
//	@GetMapping("/index")
//	public String index(Model model) {
//		return "index";
//	}
//	
//	@GetMapping("/login")
//	public String login(Model model, @ModelAttribute Usuarios usuarios) {
//		model.addAttribute("user", usuarios);
//		return "login";
//	}
//	
//	@PostMapping("/login")
//	public String login(@ModelAttribute Usuarios usuarios) {
//		
//		for(Usuarios item :IUser.findAll()) {
//			if(item.getUsername().equals(usuarios.getUsername())) {
//				if(item.getPassword().equals(usuarios.getPassword())) {
//					return "redirect:/home";
//				}
//			}
//		}
//		return "redirect:/login";
//	}
//	
//	@GetMapping("/formUser")
//	public String createuser(Model model, @ModelAttribute Usuarios usuarios) {
//		model.addAttribute("user", usuarios);
//		return "formUser";
//	}
//	
//	@PostMapping("/formUser")
//	public String createuser(@ModelAttribute Usuarios usuarios) {
//		
//		IUser.save(usuarios);
//		
//		return "redirect:/login";
//	}

	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
}
