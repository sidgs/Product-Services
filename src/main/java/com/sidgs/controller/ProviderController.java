package com.sidgs.controller;



import com.sidgs.model.Provider;
import com.sidgs.service.ProviderService;
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
public class ProviderController {

    private static final Logger logger = Logger.getLogger(ProviderController.class);
    public ProviderController(){
        System.out.println("ProviderController()");
    }

    @Autowired
    private ProviderService providerService;

    @RequestMapping(value = "/provider")
    public ModelAndView listProvider(ModelAndView model) throws IOException {
        List<Provider> listProvider = providerService.getAllProviders();
        model.addObject("listProvider", listProvider);
        model.setViewName("providerHome");
        return model;
    }

    @RequestMapping(value = "/newProvider", method = RequestMethod.GET)
    public ModelAndView newProvider(ModelAndView model){
        Provider provider = new Provider();
        model.addObject("provider", provider);
        model.setViewName("providerForm");
        return model;
    }

    @RequestMapping(value = "/saveProvider", method = RequestMethod.POST)
    public ModelAndView saveProvider(@ModelAttribute Provider provider) {

        if(provider.getId()==0) {
            // if member id = 0 then creating the
            providerService.addProvider(provider);
        } else {
            providerService.updateProvider(provider);
        }
        return new ModelAndView("redirect:/provider");
    }

    @RequestMapping(value = "/editProvider", method = RequestMethod.GET)
    public ModelAndView editProvider(HttpServletRequest request){
        int providerId = Integer.parseInt(request.getParameter("id"));
        Provider provider = providerService.getProvider(providerId);
        ModelAndView model = new ModelAndView("providerForm");
        model.addObject("provider",provider);
        return model;
    }

    @RequestMapping(value = "/deleteProvider", method = RequestMethod.GET)
    public ModelAndView deleteProvider(HttpServletRequest request){
        int providerId = Integer.parseInt(request.getParameter("id"));
        providerService.deleteProvider(providerId);
        return new ModelAndView("redirect:/provider");


    }

}


