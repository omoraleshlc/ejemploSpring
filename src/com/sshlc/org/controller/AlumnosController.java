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

		List<String> alList = new ArrayList<String>();
                alList.add("escuela");
                alList.add("matricula");
                alList.add("nombre");
                alList.add("tipoAlumno");
                alList.add("keyAEMain");
		
		
                
                

		Map<String, List> map = new HashMap<String, List>();
		map.put("keyAEMain", alList);
                map.put("escuela", alList);
                map.put("nombre", alList);
                map.put("tipoAlumno", alList);
                map.put("matricula", alList);
                
		
		return new ModelAndView("registrarAlumnos", "map", map);
	}

	@RequestMapping("/insertarAlumnos")
	public String inserData(@ModelAttribute Alumnos alumnos) {
		if (alumnos != null)
			alumnosService.insertData(alumnos);
		return "redirect:/getList";
	}

	@RequestMapping("/getListaAlumnos")
	public ModelAndView getAlumnosList() {
		List<Alumnos> alumnosList = alumnosService.getAlumnosList();
		return new ModelAndView("alumnosLista", "alumnosLista", alumnosList);
	}

	@RequestMapping("/editarAlumnos")
	public ModelAndView editAlumnos(@RequestParam String keyAEMain,
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

		return new ModelAndView("ediarAlumnos", "map", map);

	}

	@RequestMapping("/actualizaAlumnos")
	public String updateAlumnos(@ModelAttribute Alumnos alumnos) {
		alumnosService.updateData(alumnos);
		return "redirect:/getLista";

	}

	@RequestMapping("/borraAlumnos")
	public String deleteAlumnos(@RequestParam String id) {
		System.out.println("id = " + id);
		alumnosService.deleteData(id);
		return "redirect:/getListaAlumnos";
	}
}