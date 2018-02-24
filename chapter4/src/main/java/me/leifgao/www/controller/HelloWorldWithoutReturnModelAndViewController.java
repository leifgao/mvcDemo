package me.leifgao.www.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by leif on 2018/2/9
 */
public class HelloWorldWithoutReturnModelAndViewController extends AbstractController{

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldWithoutReturnModelAndViewController.class);

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("直接写reponse开始");
        response.setContentType("text/plain; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("hello world!你好");
        return null;
    }
}
