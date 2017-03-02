package com.sidgs.controller;



import com.sidgs.model.Service;
import com.sidgs.service.ServiceService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by Shylaja on 2/26/2017.
 */
@Controller
public class ServiceController {

    private static final Logger logger = Logger.getLogger(ServiceController.class);
    public ServiceController(){
        System.out.println("ServiceController()");
    }

    @Autowired
    private ServiceService serviceService;

    @RequestMapping(value = "/service")
    public ModelAndView listService(ModelAndView model) throws IOException {
        List<Service> listService = serviceService.getAllServices();
        model.addObject("listService", listService);
        model.setViewName("serviceHome");
        return model;
    }

    @RequestMapping(value = "/newService", method = RequestMethod.GET)
    public ModelAndView newService(ModelAndView model){
        Service service = new Service();
        model.addObject("service", service);
        model.setViewName("serviceForm");
        return model;
    }

    @RequestMapping(value = "/saveService", method = RequestMethod.POST)
    public ModelAndView saveService(@ModelAttribute Service service) {

        if(service.getId()==0) {
            // if member id = 0 then creating the
           serviceService.addService(service);
        } else {
            serviceService.updateService(service);
        }
        return new ModelAndView("redirect:/service");
    }

    @RequestMapping(value = "/editService", method = RequestMethod.GET)
    public ModelAndView editService(HttpServletRequest request){
        int serviceId = Integer.parseInt(request.getParameter("id"));
        Service service = serviceService.getService(serviceId);
        ModelAndView model = new ModelAndView("serviceForm");
        model.addObject("service",service);
        return model;
    }

    @RequestMapping(value = "/deleteService", method = RequestMethod.GET)
    public ModelAndView deleteService(HttpServletRequest request){
        int serviceId = Integer.parseInt(request.getParameter("id"));
        serviceService.deleteService(serviceId);
        return new ModelAndView("redirect:/service");


    }

}


