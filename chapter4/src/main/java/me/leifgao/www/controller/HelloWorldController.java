package me.leifgao.www.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by leif on 2018/2/5
 */
public class HelloWorldController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello world");
        mv.setViewName("hello");
        logger.info("--------> end 结束");
        return mv;
    }
}
