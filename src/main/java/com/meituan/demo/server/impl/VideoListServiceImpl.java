package com.meituan.demo.server.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meituan.demo.bean.VideoListEntity;
import com.meituan.demo.domain.PatrolplaceListQuery;
import com.meituan.demo.domain.bo.PageBO;
import com.meituan.demo.mapper.Video_List_Mapper;
import com.meituan.demo.server.VideoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
//
//@Service
//public class VideoListServiceImpl implements VideoListService {
//    @Autowired
//    private Video_List_Mapper vlm;
//    @Override
//    public List<VideoListEntity> getVideoList() {
//        List<VideoListEntity>   result=   vlm.findByUsernametest();
//        return result;
//    }
//}

@Service
public class VideoListServiceImpl implements VideoListService {
    @Autowired
    private Video_List_Mapper vlm;
//    @Override
//    public List<VideoListEntity> getVideoList() {
//        List<VideoListEntity>   result=   vlm.findByUsernametest();
//        return result;
//    }

    @Override
    public PageBO<VideoListEntity> getVideoList(PatrolplaceListQuery patrolplaceListQuery) {
        if (patrolplaceListQuery.getPage() != null && patrolplaceListQuery.getLimit() != null) {
            PageHelper.startPage(patrolplaceListQuery.getPage(), patrolplaceListQuery.getLimit(), true, false, true);
        }
        List<VideoListEntity> result = vlm.page(patrolplaceListQuery);
        PageInfo page = new PageInfo<>(result);
        boolean flag = result.size() > 0;
        PageBO<VideoListEntity> pageBO = new PageBO<>();
        pageBO.setFlag(flag);
        if (flag) {
            pageBO.setCount(page.getTotal());
            pageBO.setData(result);
            return pageBO;
        }
        pageBO.setMsg("暂无数据");
        return null;
    }
}
