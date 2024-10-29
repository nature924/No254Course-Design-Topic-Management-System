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


import com.dao.ZiniketiDao;
import com.entity.ZiniketiEntity;
import com.service.ZiniketiService;
import com.entity.vo.ZiniketiVO;
import com.entity.view.ZiniketiView;

@Service("ziniketiService")
public class ZiniketiServiceImpl extends ServiceImpl<ZiniketiDao, ZiniketiEntity> implements ZiniketiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiniketiEntity> page = this.selectPage(
                new Query<ZiniketiEntity>(params).getPage(),
                new EntityWrapper<ZiniketiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiniketiEntity> wrapper) {
		  Page<ZiniketiView> page =new Query<ZiniketiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiniketiVO> selectListVO(Wrapper<ZiniketiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiniketiVO selectVO(Wrapper<ZiniketiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiniketiView> selectListView(Wrapper<ZiniketiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiniketiView selectView(Wrapper<ZiniketiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
