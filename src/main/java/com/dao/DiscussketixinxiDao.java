package com.dao;

import com.entity.DiscussketixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussketixinxiVO;
import com.entity.view.DiscussketixinxiView;


/**
 * 课题信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
public interface DiscussketixinxiDao extends BaseMapper<DiscussketixinxiEntity> {
	
	List<DiscussketixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussketixinxiEntity> wrapper);
	
	DiscussketixinxiVO selectVO(@Param("ew") Wrapper<DiscussketixinxiEntity> wrapper);
	
	List<DiscussketixinxiView> selectListView(@Param("ew") Wrapper<DiscussketixinxiEntity> wrapper);

	List<DiscussketixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussketixinxiEntity> wrapper);
	
	DiscussketixinxiView selectView(@Param("ew") Wrapper<DiscussketixinxiEntity> wrapper);
	

}
