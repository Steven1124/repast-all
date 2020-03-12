/**
 * @Company AAA软件教育
 * @Author Zero
 * @Date Create in 2020/3/12 17:16
 * @Description 在分页查询中计算出偏移量
 **/
package com.aaa.lee.repast.page;

public class PageUtil {

    public static Integer getOffset(PageInfos pageInfos){
       Integer offset = null;
       if (null!=pageInfos){
           /**
            * pageInfos.getPageNum == null
            * 说明是第一次点击进入，获取不到当前的页码数，则直接赋值为0
            */
           if (pageInfos.getPageNum()==null){
               pageInfos.setPageNum(0);
               offset=0;
           }
           offset=(pageInfos.getPageNum()-1)*pageInfos.getPageSize();
       }
        return offset;
    };
}