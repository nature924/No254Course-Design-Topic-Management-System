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


import com.dao.KetifenleiDao;
import com.entity.KetifenleiEntity;
import com.service.KetifenleiService;
import com.entity.vo.KetifenleiVO;
import com.entity.view.KetifenleiView;

@Service("ketifenleiService")
public class KetifenleiServiceImpl extends ServiceImpl<KetifenleiDao, KetifenleiEntity> implements KetifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetifenleiEntity> page = this.selectPage(
                new Query<KetifenleiEntity>(params).getPage(),
                new EntityWrapper<KetifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetifenleiEntity> wrapper) {
		  Page<KetifenleiView> page =new Query<KetifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetifenleiVO> selectListVO(Wrapper<KetifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetifenleiVO selectVO(Wrapper<KetifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetifenleiView> selectListView(Wrapper<KetifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetifenleiView selectView(Wrapper<KetifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
