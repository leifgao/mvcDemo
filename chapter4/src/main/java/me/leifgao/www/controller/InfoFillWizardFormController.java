package me.leifgao.www.controller;

import me.leifgao.www.vo.UserModel;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leif on 2018/3/5
 */
public class InfoFillWizardFormController extends AbstractWizardFormController{

    public InfoFillWizardFormController() {
        setCommandClass(UserModel.class);
        setCommandName("user");
    }

    protected Map referenceData(HttpServletRequest request, int page) throws Exception {
        Map<String, List<String>> map = new HashMap();
        if (page == 1) {
            map.put("schoolTypeList", Arrays.asList("高中", "中专", "大学"));
        }
        if (page == 2) {
            map.put("cityList", Arrays.asList("上海", "盐城", "唐山"));
        }
        return map;
    }

    //提供每一页数据的验证处理方法
    protected  void validatePage(Object command, Errors errors, int page) {

    }

    //提供每一页完成时的后处理方法
    protected void postProcessPage(HttpServletRequest request, Object command, Errors errors, int page) throws Exception {

    }

    //成功后的处理方法
    protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse resp, Object command, BindException errors) throws Exception {
        System.out.println(command);
        return new ModelAndView("redirect:/success");
    }

    //取消后的处理方法
    @Override
    protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        System.out.println(command);
        return new ModelAndView("redirect:/cancel");
    }
}
