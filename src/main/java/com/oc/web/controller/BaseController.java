package com.oc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 15-1-31.
 */
/*There must be a Controller annotation or the application will doesn't work .*/
@Controller
public class BaseController {
    private static int counter=0;
    private static final String VIEW_INDEX="index";
    private static final Logger logger= LoggerFactory.getLogger(BaseController.class);

    public static void main(String [] args){

        logger.info("hello world");
    }

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String welcome(ModelMap model){
        System.out.println("hello world 11111111111");

        int a = 1 /0 ;

        model.addAttribute("message","Welcome");
        model.addAttribute("counter",++counter);
        logger.info("[Welcome counter :{}"+counter);
        return VIEW_INDEX;//返回index.jsp
    }

    @RequestMapping(value = "/{name}" ,method = RequestMethod.GET)
    public String welcome(@PathVariable String name , ModelMap model){
        System.out.println("hello world 222222222222");
        int a = 1 /0 ;
        model.addAttribute("message","Welcome "+name);
        model.addAttribute("counter",++counter);
        logger.info("[Welcome counter :{}"+counter);
        return VIEW_INDEX;//返回index.jsp
    }
}