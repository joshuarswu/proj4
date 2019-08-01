package cn.itsource.aigou.service.impl;

import cn.itsource.aigou.domain.ProductType;
import cn.itsource.aigou.mapper.ProductTypeMapper;
import cn.itsource.aigou.service.IProductTypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

    @Override
    public List<ProductType> loadTypeTree() {
        return loop();
    }
    private List<ProductType> loop() {
        List<ProductType> productTypes = baseMapper.selectList(null);
        List<ProductType> list = new ArrayList<>();
        Map<Long,ProductType> map = new HashMap<>();
        for (ProductType pt : productTypes) {
            map.put(pt.getId(),pt);
        }
        for (ProductType productType : productTypes) {
            if(productType.getPid()==0){
                list.add(productType);
            }else{
                ProductType parent = map.get(productType.getPid());
                parent.getChildren().add(productType);
            }
        }
        return list;
    }

    private List<ProductType> recursive(Long id) {
        List<ProductType> parents = baseMapper.selectList(new QueryWrapper<ProductType>().eq("pid", id));
        for (ProductType parent : parents) {
            List<ProductType> children = recursive(parent.getId());
            if(!children.isEmpty()){
                parent.setChildren(children);
            }
        }
        return parents;
    }
}
