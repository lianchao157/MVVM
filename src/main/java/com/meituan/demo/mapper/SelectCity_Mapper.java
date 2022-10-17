package com.meituan.demo.mapper;

import com.meituan.demo.bean.citybean.CitySelectBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SelectCity_Mapper {
    @Select("select * from t_address where name=#{name}")
    List<CitySelectBean> findcity(@Param("name") String name);//  查询所有

}
