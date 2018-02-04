package me.leifgao.www.service.impl;

import me.leifgao.www.service.ProductService;
import me.leifgao.www.vo.ProductVo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by leif on 2018/2/4
 */
@Service
public class ProductServiceImpl implements ProductService{
    private Map<Long, ProductVo> products = new HashMap<Long, ProductVo>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl() {
        ProductVo productVo = new ProductVo();
        productVo.setName("JX1 Power Drill");
        productVo.setDescription("Powerful hand drill, made to perfection");
        productVo.setPrice(129.99F);
        add(productVo);
    }

    @Override
    public ProductVo add(ProductVo productVo) {
        long newId = generator.incrementAndGet();
        productVo.setId(newId);
        products.put(newId, productVo);
        return productVo;
    }

    @Override
    public ProductVo get(long id) {
        return products.get(id);
    }
}
