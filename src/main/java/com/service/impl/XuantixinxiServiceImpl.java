package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuantixinxiDao;
import com.entity.XuantixinxiEntity;
import com.service.XuantixinxiService;
import com.entity.vo.XuantixinxiVO;
import com.entity.view.XuantixinxiView;

@Service("xuantixinxiService")
public class XuantixinxiServiceImpl extends ServiceImpl<XuantixinxiDao, XuantixinxiEntity> implements XuantixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuantixinxiEntity> page = this.selectPage(
                new Query<XuantixinxiEntity>(params).getPage(),
                new EntityWrapper<XuantixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuantixinxiEntity> wrapper) {
		  Page<XuantixinxiView> page =new Query<XuantixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuantixinxiVO> selectListVO(Wrapper<XuantixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuantixinxiVO selectVO(Wrapper<XuantixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuantixinxiView> selectListView(Wrapper<XuantixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuantixinxiView selectView(Wrapper<XuantixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
