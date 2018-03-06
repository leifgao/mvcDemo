package me.leifgao.www.vo;

import lombok.Data;

/**
 * Created by leif on 2018/2/24
 */
@Data
public class UserModel {
    private String userName;
    private String password;
    private String realName;
    private SchoolInfoModel schoolInfo;
    private WorkInfoModel workInfo;
}
