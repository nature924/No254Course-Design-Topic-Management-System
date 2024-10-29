package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiniketiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiniketiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiniketiView;


/**
 * 自拟课题
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
public interface ZiniketiService extends IService<ZiniketiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiniketiVO> selectListVO(Wrapper<ZiniketiEntity> wrapper);
   	
   	ZiniketiVO selectVO(@Param("ew") Wrapper<ZiniketiEntity> wrapper);
   	
   	List<ZiniketiView> selectListView(Wrapper<ZiniketiEntity> wrapper);
   	
   	ZiniketiView selectView(@Param("ew") Wrapper<ZiniketiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiniketiEntity> wrapper);
   	

}

