package com.dao;

import com.entity.ZiniketiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiniketiVO;
import com.entity.view.ZiniketiView;


/**
 * 自拟课题
 * 
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
public interface ZiniketiDao extends BaseMapper<ZiniketiEntity> {
	
	List<ZiniketiVO> selectListVO(@Param("ew") Wrapper<ZiniketiEntity> wrapper);
	
	ZiniketiVO selectVO(@Param("ew") Wrapper<ZiniketiEntity> wrapper);
	
	List<ZiniketiView> selectListView(@Param("ew") Wrapper<ZiniketiEntity> wrapper);

	List<ZiniketiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiniketiEntity> wrapper);
	
	ZiniketiView selectView(@Param("ew") Wrapper<ZiniketiEntity> wrapper);
	

}
