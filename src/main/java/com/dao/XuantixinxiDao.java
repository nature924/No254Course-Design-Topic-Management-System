package com.dao;

import com.entity.XuantixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuantixinxiVO;
import com.entity.view.XuantixinxiView;


/**
 * 选题信息
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
public interface XuantixinxiDao extends BaseMapper<XuantixinxiEntity> {
	
	List<XuantixinxiVO> selectListVO(@Param("ew") Wrapper<XuantixinxiEntity> wrapper);
	
	XuantixinxiVO selectVO(@Param("ew") Wrapper<XuantixinxiEntity> wrapper);
	
	List<XuantixinxiView> selectListView(@Param("ew") Wrapper<XuantixinxiEntity> wrapper);

	List<XuantixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuantixinxiEntity> wrapper);
	
	XuantixinxiView selectView(@Param("ew") Wrapper<XuantixinxiEntity> wrapper);
	

}
