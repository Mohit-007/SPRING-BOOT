package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.app.Alien;
import com.spring.boot.dao.AlienDao;

//@Controller
@RestController
public class AlienController {

	@Autowired
	AlienDao repository;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

/*
	@RequestMapping("/add_alien")
	public String add_alien(Alien alien)
	{
		repository.save(alien);
		return "home.jsp";
	}
*/

/*
	@RequestMapping("/add_alien")
	public String add_alien(Alien alien)
	{
		repository.save(alien);
		return "home.jsp";
	}
*/
	
	@PostMapping("/aliens")
	public Alien add_alien(Alien alien)
	{
		repository.save(alien);
		return alien;
	}

	@PutMapping("/aliens")
	public Alien update_alien(@RequestBody Alien alien)
	{
		repository.save(alien);
		return alien;
	}

	
	@DeleteMapping("/aliens/{aid}")
	public void delete_alien(@PathVariable int aid)
	{
		Alien a = repository.findById(aid).orElse(new Alien());
		repository.delete(a);
		//return a;
	}
	
/*
	@RequestMapping("/get_alien")
	public ModelAndView get_alien(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView("alien.jsp");
		Alien alien = repository.findById(aid).orElse(new Alien());
		
		System.out.println(repository.findByTech("Java"));
		System.out.println(repository.findByAidGreaterThan(300));
		System.out.println(repository.findByTechSorted("Java"));
		
		mv.addObject(alien);
		return mv;
		
	}
*/

/*
	@RequestMapping("/aliens")
	@ResponseBody
	public String get_alien()
	{
		return repository.findAll().toString();
	}
*/
	
/*	
	@RequestMapping(path = "/aliens",produces= {"application/xml","application/json"})
	@ResponseBody
	public List<Alien> get_alien()
	{
		return (List<Alien>) repository.findAll();
	}
*/
	
	@GetMapping(path = "/aliens",produces= {"application/xml","application/json"})
	@ResponseBody
	public List<Alien> get_alien()
	{
		return (List<Alien>) repository.findAll();
	}

	
	
//	@RequestMapping("/aliens/300")
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public String get_alien(@PathVariable("aid") int aid)
	{
//		return repository.findById(300).toString();
		return repository.findById(aid).toString();
	}
	
	
	
}
