package me.leifgao.www.vo;

import lombok.Data;

/**
 * Created by leif on 2018/3/5
 */
@Data
public class SchoolInfoModel {
    private String schoolType; //学校类型：高中、中专、大学
    private String schoolName; //学校名称
    private String specialty;  //专业
}
