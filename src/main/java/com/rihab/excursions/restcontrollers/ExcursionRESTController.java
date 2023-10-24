package com.rihab.excursions.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rihab.excursions.entities.Excursion;
import com.rihab.excursions.service.ExcursionService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ExcursionRESTController {
@Autowired
ExcursionService excursionService;
@RequestMapping(method = RequestMethod.GET)
public List<Excursion> getAllExcursions() {
return excursionService.getAllExcursions();
}


@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Excursion getExcursionById(@PathVariable("id") Long id) {
return excursionService.getExcursion(id);
 }


@RequestMapping(method= RequestMethod.POST)
public Excursion createExcursion(@RequestBody Excursion e) {
	System.out.println("hhhhhhhhhhhhhhhhh");
	return excursionService.saveExcursion(e);
}

@RequestMapping(method = RequestMethod.PUT)
public Excursion updateExcursion(@RequestBody Excursion excursion) {
return excursionService.updateExcursion(excursion);
}

@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteExcursion(@PathVariable("id") Long id)
{
	excursionService.deleteExcursionById(id);
}

@RequestMapping(value="/exstype/{idType}",method = RequestMethod.GET)
public List<Excursion> getExcursionsByTypeId(@PathVariable("idType") Long idType) {
return excursionService.findByTypeIdType(idType);
}

}