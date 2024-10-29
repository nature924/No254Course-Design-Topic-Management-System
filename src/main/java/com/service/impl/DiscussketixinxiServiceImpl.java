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


import com.dao.DiscussketixinxiDao;
import com.entity.DiscussketixinxiEntity;
import com.service.DiscussketixinxiService;
import com.entity.vo.DiscussketixinxiVO;
import com.entity.view.DiscussketixinxiView;

@Service("discussketixinxiService")
public class DiscussketixinxiServiceImpl extends ServiceImpl<DiscussketixinxiDao, DiscussketixinxiEntity> implements DiscussketixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussketixinxiEntity> page = this.selectPage(
                new Query<DiscussketixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussketixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussketixinxiEntity> wrapper) {
		  Page<DiscussketixinxiView> page =new Query<DiscussketixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussketixinxiVO> selectListVO(Wrapper<DiscussketixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussketixinxiVO selectVO(Wrapper<DiscussketixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussketixinxiView> selectListView(Wrapper<DiscussketixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussketixinxiView selectView(Wrapper<DiscussketixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
