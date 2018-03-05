package me.leifgao.www.controller;

import me.leifgao.www.vo.UserModel;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leif on 2018/2/24
 */
public class RegisterSimpleFormController extends SimpleFormController{

    public RegisterSimpleFormController() {
        setCommandClass(UserModel.class);
        setCommandName("user");
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        UserModel user = new UserModel();
        user.setUserName("请输入用户名");
        return user;
    }

    @Override
    protected Map referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {
        Map map = new HashMap();
        map.put("cityList", Arrays.asList("sh", "yc", "唐山"));
        return map;
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        UserModel user = (UserModel) command;
        System.out.println(user);
    }
}
