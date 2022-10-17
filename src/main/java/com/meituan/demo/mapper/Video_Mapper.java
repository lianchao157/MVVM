package com.meituan.demo.mapper;

import com.meituan.demo.bean.VideoInfoEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface Video_Mapper {
    @Select("select * from video where VideoId=#{VideoId}")
    VideoInfoEntity findByUsernametest(@Param("VideoId") String VideoId);//  查询所有



}
