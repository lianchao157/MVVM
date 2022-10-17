package com.meituan.demo.mapper;

import com.meituan.demo.bean.VideoListEntity;
import com.meituan.demo.domain.PatrolplaceListQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//  事物注解
@Repository
public interface Video_List_Mapper {
//    @Select("select * from video_list")
//    List<VideoListEntity> findByUsernametest();//  查询所有
    List<VideoListEntity>  page(PatrolplaceListQuery patrolplaceListQuery);
}
