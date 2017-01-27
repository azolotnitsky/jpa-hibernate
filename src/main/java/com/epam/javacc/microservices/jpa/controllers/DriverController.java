package com.epam.javacc.microservices.jpa.controllers;

import com.epam.javacc.microservices.jpa.service.DriverService;
import com.epam.javacc.microservices.jpa.domain.Driver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
     Driver Controller
*/

@Controller
public class DriverController {

    @Autowired
    private DriverService driverService;

    private final Log LOG = LogFactory.getLog(getClass());

    @RequestMapping(value = {"/drivers"}, method = RequestMethod.GET)
    public String listAllDrivers(Model model) {
        LOG.info("List all available drivers");

	List<Driver> drivers = driverService.getDrivers();
        model.addAttribute("drivers", drivers);

        return "drivers";
    }

}
