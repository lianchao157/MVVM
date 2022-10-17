package com.meituan.demo.server;

import com.meituan.demo.bean.VideoListEntity;
import com.meituan.demo.domain.PatrolplaceListQuery;
import com.meituan.demo.domain.bo.PageBO;

import java.util.List;

public interface VideoListService {
    // 获取列表
    // 获取列表
    PageBO<VideoListEntity> getVideoList(PatrolplaceListQuery patrolplaceListQuery);
}
