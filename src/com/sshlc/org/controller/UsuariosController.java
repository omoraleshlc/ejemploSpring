package com.sshlc.org.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.sshlc.org.domain.Usuarios;
import com.sshlc.org.services.UsuariosService;

@Controller
public class UsuariosController {

	@Autowired
	UsuariosService usuariosService;
        
        
        
        
        

	@RequestMapping("/register")
	public ModelAndView registerUsuarios(@ModelAttribute Usuarios usuarios) {

		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");
                
                List<String> estadoList = new ArrayList<String>();
		estadoList.add("Nuevo Leon");
		estadoList.add("Tamaulipas");
		estadoList.add("Veracruz");
		estadoList.add("Chiapas");
                

		List<String> cityList = new ArrayList<String>();
		cityList.add("delhi");
		cityList.add("gurgaon");
		cityList.add("meerut");
		cityList.add("noida");

		Map<String, List> map = new HashMap<String, List>();
		map.put("genderList", genderList);
		map.put("cityList", cityList);
                map.put("estadoList", estadoList);
		return new ModelAndView("register", "map", map);
	}

	@RequestMapping("/insert")
	public String inserData(@ModelAttribute Usuarios usuarios) {
		if (usuarios != null)
			usuariosService.insertData(usuarios);
		return "redirect:/getList";
	}

	@RequestMapping("/getList")
	public ModelAndView getUsuariosList() {
		List<Usuarios> usuariosList = usuariosService.getUsuariosList();
		return new ModelAndView("usuariosList", "usuariosList", usuariosList);
	}

	@RequestMapping("/editarUsuario")
	public ModelAndView editUsuarios(@RequestParam int folio,
			@ModelAttribute Usuarios usuarios) {

		usuarios = usuariosService.getUsuarios(folio);

		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");

		List<String> cityList = new ArrayList<String>();
		cityList.add("delhi");
		cityList.add("gurgaon");
		cityList.add("meerut");
		cityList.add("noida");
                cityList.add("monterrey");
                
                List<String> estadoList = new ArrayList<String>();
		estadoList.add("Nuevo Leon");
		estadoList.add("Tamaulipas");
		estadoList.add("Veracruz");
		estadoList.add("Chiapas");
                

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("genderList", genderList);
		map.put("cityList", cityList);
		map.put("usuarios", usuarios);
                map.put("estado", estadoList);

		return new ModelAndView("editarUsuario", "map", map);

	}

	@RequestMapping("/actualizarUsuario")
	public String updateUsuarios(@ModelAttribute Usuarios usuarios) {
		usuariosService.updateData(usuarios);
		return "redirect:/getList";

	}

	@RequestMapping("/delete")
	public String deleteUsuarios(@RequestParam int folio) {
		System.out.println("folio = " + folio);
		usuariosService.deleteData(folio);
		return "redirect:/getList";
	}
}