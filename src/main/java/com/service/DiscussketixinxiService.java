package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussketixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussketixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussketixinxiView;


/**
 * 课题信息评论表
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
public interface DiscussketixinxiService extends IService<DiscussketixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussketixinxiVO> selectListVO(Wrapper<DiscussketixinxiEntity> wrapper);
   	
   	DiscussketixinxiVO selectVO(@Param("ew") Wrapper<DiscussketixinxiEntity> wrapper);
   	
   	List<DiscussketixinxiView> selectListView(Wrapper<DiscussketixinxiEntity> wrapper);
   	
   	DiscussketixinxiView selectView(@Param("ew") Wrapper<DiscussketixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussketixinxiEntity> wrapper);
   	

}

