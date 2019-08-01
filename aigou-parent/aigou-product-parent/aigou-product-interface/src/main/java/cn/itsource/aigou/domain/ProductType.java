package cn.itsource.aigou.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@TableName("t_product_type")
public class ProductType extends Model<ProductType> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private Long createTime;

    @TableField("updateTime")
    private Long updateTime;

    private String name;
    private Long pid;
    private String logo;
    private String description;

    @TableField("sortIndex")
    private Integer sortIndex;

    private String path;

    @TableField("totalCount")
    private Integer totalCount;

    @TableField("seoTitle")
    private String seoTitle;

    @TableField("seoKeywords")
    private String seoKeywords;

    private Long typeTemplateId;

    @TableField(exist = false)
    private List<ProductType> children = new ArrayList<>();//子类型


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public Long getTypeTemplateId() {
        return typeTemplateId;
    }

    public void setTypeTemplateId(Long typeTemplateId) {
        this.typeTemplateId = typeTemplateId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ProductType{" +
        "id=" + id +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", name=" + name +
        ", pid=" + pid +
        ", logo=" + logo +
        ", description=" + description +
        ", sortIndex=" + sortIndex +
        ", path=" + path +
        ", totalCount=" + totalCount +
        ", seoTitle=" + seoTitle +
        ", seoKeywords=" + seoKeywords +
        ", typeTemplateId=" + typeTemplateId +
        "}";
    }

    public List<ProductType> getChildren() {
        return children;
    }

    public void setChildren(List<ProductType> children) {
        this.children = children;
    }
}
