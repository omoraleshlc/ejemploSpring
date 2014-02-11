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
import com.sshlc.org.domain.Articulos;
import com.sshlc.org.services.ArticulosService;

@Controller
public class ArticulosController {

	@Autowired
	ArticulosService articulosService;
        
        
        
        
        

	@RequestMapping("/registro")
	public ModelAndView registerArticulos(@ModelAttribute Articulos articulos) {

		List<String> artList = new ArrayList<String>();
		artList.add("descripcion");
		
                
                

		Map<String, List> map = new HashMap<String, List>();
		map.put("descripcion", artList);
		
		return new ModelAndView("register", "map", map);
	}

	@RequestMapping("/insertar")
	public String inserData(@ModelAttribute Articulos articulos) {
		if (articulos != null)
			articulosService.insertData(articulos);
		return "redirect:/getList";
	}

	@RequestMapping("/getListaArticulos")
	public ModelAndView getArticulosList() {
            int numeracion=0;
		List<Articulos> articulosList = articulosService.getArticulosList();
		return new ModelAndView("articulosList", "articulosList", articulosList);
	}

	@RequestMapping("/editarArticulos")
	public ModelAndView editArticulos(@RequestParam String keyPA,
			@ModelAttribute Articulos articulos) {

		articulos = articulosService.getArticulos(keyPA);

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
		map.put("articulos", articulos);
                map.put("estado", estadoList);

		return new ModelAndView("editarArticulos", "map", map);

	}

	@RequestMapping("/actualizarArticulos")
	public String updateArticulos(@ModelAttribute Articulos articulos) {
		articulosService.updateData(articulos);
		return "redirect:/getList";

	}

	@RequestMapping("/eliminarArticulos")
	public String deleteArticulos(@RequestParam String id) {
		System.out.println("id = " + id);
		articulosService.deleteData(id);
		return "redirect:/getLista";
	}
}