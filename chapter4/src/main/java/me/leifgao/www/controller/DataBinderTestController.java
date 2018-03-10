package me.leifgao.www.controller;

import me.leifgao.www.component.PhoneNumberEditor;
import me.leifgao.www.vo.DataBinderTestModel;
import me.leifgao.www.vo.PhoneNumberModel;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by leif on 2018/3/6
 */
public class DataBinderTestController extends AbstractCommandController{

    public DataBinderTestController() {
        setCommandClass(DataBinderTestModel.class);
        setCommandName("dataBinderTest");
    }


    @Override
    protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        System.out.println(command);
        return new ModelAndView("baseInfo");
    }

//    @Override
//    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
//        super.initBinder(request, binder);
//        binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());
//    }
}
