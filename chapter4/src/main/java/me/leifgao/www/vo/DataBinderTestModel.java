package me.leifgao.www.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by leif on 2018/3/6
 */
@Data
public class DataBinderTestModel {
    private String userName;
    private boolean bool;
    private SchoolInfoModel schoolInfo;
    private List hobbyList;
    private Map map;
    private PhoneNumberModel phoneNumber;
    private Date date;
}
