//package com.sidgs.controller;
//
//import com.sidgs.dao.SearchRepository;
//import com.sidgs.model.Product;
//import com.sidgs.model.ProductModel;
//import com.sidgs.service.ProductService;
//import org.jboss.logging.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Vytlasai on 3/2/2017.
// */
//@Controller
//public class SearchController {
//
//    private static final Logger logger = Logger.getLogger(SearchController.class);
//
//    public SearchController(){
//        System.out.println("SearchController");
//    }
//
//    @Autowired
//    private SearchRepository searchRepository;
//
//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public ModelAndView searchPage()
//    {
//        ModelAndView mav = new ModelAndView("search");
//        return mav;
//    }
//
//    @RequestMapping(value = "/doSearch", method = RequestMethod.POST)
//    public ModelAndView search(
//            @RequestParam("searchText")
//                    String searchText
//    ) throws Exception
//    {
//        List<Product> allProduct = searchRepository.searchProduct(searchText);
//        List<ProductModel> productModels = new ArrayList<ProductModel>();
//
//        for (Product p : allProduct)
//        {
//            ProductModel productModel = new ProductModel();
//            productModel.setProName(p.getProduct_name());
//            productModel.setProDescription(p.getDescription());
//            productModel.setProStyle(p.getProduct_style());
//            productModels.add(productModel);
//
//        }
//
//        ModelAndView mav = new ModelAndView("foundProducts");
//        mav.addObject("foundProducts", productModels);
//        return mav;
//    }
//}
//
