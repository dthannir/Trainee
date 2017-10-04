package com.cg.tms.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cg.tms.dto.TraineeBean;
import com.cg.tms.exception.TraineeException;
import com.cg.tms.services.ITraineeService;

@Controller
public class TraineeController {
	
	@Resource
	private ITraineeService service;
	
	@RequestMapping("/traineePage.do")
	public ModelAndView traineePage() throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		mAndV.setViewName("TraineePage");
		return mAndV;
		
	}
	
	@RequestMapping("/deletePage.do")
	public ModelAndView deletePage() throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		mAndV.setViewName("Delete");
		return mAndV;
	}
	
	@RequestMapping(value="/deleteTrainee.do")
	public ModelAndView deleteTrainee(@RequestParam("traineeId") int traineeId) throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		TraineeBean tb = service.deleteTrainee(traineeId);
		mAndV.addObject("Dtrainee",tb);
		mAndV.addObject("pageHead","Trainee Info");
		mAndV.setViewName("Delete");
		return mAndV;
	}
	
	@RequestMapping("/retrievePage.do")
	public ModelAndView retrievePage() throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		mAndV.setViewName("RetrieveTrainee");
		return mAndV;
	}
	
	@RequestMapping(value="/retrieveTrainee.do")
	public ModelAndView retrieveTrainee(@RequestParam("traineeId") int traineeId) throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		TraineeBean tb = service.retrieveTrainee(traineeId);
		mAndV.addObject("Rtrainee",tb);
		mAndV.addObject("pageHead","Trainee Info");
		mAndV.setViewName("RetrieveTrainee");
		return mAndV;
	}
	
	@RequestMapping(value="/modifyPage.do")
	public ModelAndView retrievTrainee(@RequestParam("traineeId") int traineeId) throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		TraineeBean tb = service.retrieveTrainee(traineeId);
		mAndV.addObject("trainee",tb);
		mAndV.addObject("pageHead","Trainee Info");
		mAndV.setViewName("ModifyTrainee");
		return mAndV;
	}
	
	@RequestMapping("/updatePage.do")
	public ModelAndView updatePage() throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		TraineeBean tb = null;
		mAndV.addObject("trainee",tb);
		mAndV.setViewName("ModifyTrainee");
		return mAndV;
	}
	
	@RequestMapping(value="/modifyTrainee.do",method=RequestMethod.POST)
	public ModelAndView modifyTrainee(@ModelAttribute("mTrainee")  TraineeBean tr) throws TraineeException{
		//System.out.println(tr);
		service.modifyTrainee(tr);
		//service.insertNewEmp(tr);
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("trainee",tr);
		mAndV.addObject("pageHead","Successful Updating of Trainee");
		mAndV.setViewName("SuccTraineeJoining");
		return mAndV;
	}
	@RequestMapping("/retrieveAllTrainee.do")
	public ModelAndView retrieveAllTrainee() throws TraineeException{
		List<TraineeBean> traineeList = service.retrieveAllTrainee();
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("traineeList",traineeList);
		mAndV.addObject("pageHead","Trainee List");
		mAndV.setViewName("TraineeList");
		return mAndV;
	}
	@RequestMapping("/addTraineePage.do")
	public ModelAndView addtraineePage() throws TraineeException{
		ModelAndView mAndV = new ModelAndView();
		TraineeBean tb = new TraineeBean();
		mAndV.addObject("trainee",tb);
		mAndV.setViewName("EntryPage");
		return mAndV;
		
	}
	
	@RequestMapping(value="/addTrainee.do",method=RequestMethod.POST)
	public ModelAndView submitEmpDetails(@ModelAttribute("trainee")  TraineeBean tr) throws TraineeException{
		System.out.println(tr);
		service.addTrainee(tr);
		//service.insertNewEmp(tr);
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("trainee",tr);
		mAndV.addObject("pageHead","Successful Joining of Trainee");
		mAndV.setViewName("SuccTraineeJoining");
		return mAndV;
	}

}
