package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IProductTypeService extends IService<ProductType> {
    List<ProductType> loadTypeTree();
}
