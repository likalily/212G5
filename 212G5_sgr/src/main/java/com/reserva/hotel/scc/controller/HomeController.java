package com.reserva.hotel.scc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
@GetMapping("/login")
public ModelAndView autenticacao() {
return new ModelAndView("paginaLogin");
}
@GetMapping("/")
public ModelAndView home() {
return new ModelAndView ("paginaMenu");
}
}
