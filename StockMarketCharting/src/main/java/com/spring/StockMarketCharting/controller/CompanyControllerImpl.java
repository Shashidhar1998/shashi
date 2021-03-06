package com.spring.StockMarketCharting.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.StockMarketCharting.model.Company;
import com.spring.StockMarketCharting.service.*;

@Controller
public class CompanyControllerImpl implements CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping(path="/insertcompany",method = RequestMethod.GET )
	public String insertCompany(Model model)
	
	{
		
		Company company=new Company();
		model.addAttribute("company",company);
		return "insertCompanyPage";
		
	}
	@RequestMapping(path="/insert",method = RequestMethod.POST)
	public String insert(Company company ,Model model)
	{
		System.out.println(company);
		try {
			companyService.insertCompany(company);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:companyList";
	}
	
	
	@RequestMapping(path="/admin")
	public String admin()
	{
		return "adminLandingPage";
	}
	
	


	
	public Company updateCompany(Company company) throws Exception {
		return companyService.updateCompany(company);
	}

	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		List<Company> list=companyService.getCompanyList();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("listCompanyDetails");
		mv.addObject("list", list);
		return mv;
	}


	

	

}
