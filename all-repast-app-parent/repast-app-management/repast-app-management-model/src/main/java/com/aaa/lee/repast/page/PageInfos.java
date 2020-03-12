package com.aaa.lee.repast.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/3/9 20:49
 * @Description
 *  @Data lombok的注解，使用该注解就不用再收东西写Getter,Setter,equals,canEqual,hasCode,toString等方法
 *  @AllArgsConstructor 使用该注解添加一个构造函数，该构造函数含有所有已声明字段属性参数
 *  @NoArgsConstructor 使用该注解后创建一个无参构造函数
 *  @Accessors(chain = true) 使用chain属性，setter方法返回当前对象 即return PageInfos
 *  生成的setter方法如下，
 *     public PageInfos setId(Integer pageNum){
 *         this.pageNum=pageNum；
 *         return this；
 *     }
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PageInfos<T> implements Serializable {

    /**
     * 当前页码数
     */
    private Integer pageNum;

    /**
     * 每一页显示的条数
     */
    private Integer pageSize;

    /**
     * 需要条件查询的分页数据
     */
    private T t;

}
