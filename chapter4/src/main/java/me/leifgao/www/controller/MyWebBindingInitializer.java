package me.leifgao.www.controller;

import me.leifgao.www.component.PhoneNumberEditor;
import me.leifgao.www.vo.PhoneNumberModel;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by leif on 2018/3/6
 */
public class MyWebBindingInitializer implements WebBindingInitializer{

    @Override
    public void initBinder(WebDataBinder binder, WebRequest request) {
        binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());
    }
}
