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
import com.sshlc.org.domain.Alumnos;
import com.sshlc.org.services.AlumnosService;

@Controller
public class AlumnosController {

	@Autowired
	AlumnosService alumnosService;
        
        
        
        
        

	@RequestMapping("/registrarAlumnos")
	public ModelAndView registerAlumnos(@ModelAttribute Alumnos alumnos) {

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

	@RequestMapping("/agregarAlumnos")
	public String inserData(@ModelAttribute Alumnos alumnos) {
		if (alumnos != null)
			alumnosService.insertData(alumnos);
		return "redirect:/getList";
	}

	@RequestMapping("/listarAlumnos")
	public ModelAndView getAlumnosList() {
		List<Alumnos> alumnosList = alumnosService.getAlumnosList();
		return new ModelAndView("alumnosLista", "alumnosLista", alumnosList);
	}

	@RequestMapping("/editarAlumnos")
	public ModelAndView editAlumnos(@RequestParam int keyAEMain,
			@ModelAttribute Alumnos alumnos) {

		alumnos = alumnosService.getAlumnos(keyAEMain);

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
		map.put("alumnos", alumnos);
                map.put("estado", estadoList);

		return new ModelAndView("editarAlumnos", "map", map);

	}

	@RequestMapping("/actualizarAlumnos")
	public String updateAlumnos(@ModelAttribute Alumnos alumnos) {
		alumnosService.updateData(alumnos);
		return "redirect:/getList";

	}

	@RequestMapping("/eliminarAlumnos")
	public String deleteAlumnos(@RequestParam int folio) {
		System.out.println("folio = " + folio);
		alumnosService.deleteData(folio);
		return "redirect:/getList";
	}
}