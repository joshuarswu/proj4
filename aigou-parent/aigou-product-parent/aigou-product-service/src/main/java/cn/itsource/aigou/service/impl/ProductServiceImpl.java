package cn.itsource.aigou.service.impl;

import cn.itsource.aigou.domain.Product;
import cn.itsource.aigou.mapper.ProductMapper;
import cn.itsource.aigou.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 商品 服务实现类
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
