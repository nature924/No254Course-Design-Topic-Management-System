package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuantixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuantixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuantixinxiView;


/**
 * 选题信息
 *
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
public interface XuantixinxiService extends IService<XuantixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuantixinxiVO> selectListVO(Wrapper<XuantixinxiEntity> wrapper);
   	
   	XuantixinxiVO selectVO(@Param("ew") Wrapper<XuantixinxiEntity> wrapper);
   	
   	List<XuantixinxiView> selectListView(Wrapper<XuantixinxiEntity> wrapper);
   	
   	XuantixinxiView selectView(@Param("ew") Wrapper<XuantixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuantixinxiEntity> wrapper);
   	

}

