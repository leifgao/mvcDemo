package me.leifgao.www.service;

import me.leifgao.www.vo.ProductVo;

/**
 * Created by leif on 2018/2/4
 */
public interface ProductService {

    ProductVo add(ProductVo productVo);
    ProductVo get(long id);

}
