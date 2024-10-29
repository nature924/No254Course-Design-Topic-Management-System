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


import com.dao.KetixinxiDao;
import com.entity.KetixinxiEntity;
import com.service.KetixinxiService;
import com.entity.vo.KetixinxiVO;
import com.entity.view.KetixinxiView;

@Service("ketixinxiService")
public class KetixinxiServiceImpl extends ServiceImpl<KetixinxiDao, KetixinxiEntity> implements KetixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetixinxiEntity> page = this.selectPage(
                new Query<KetixinxiEntity>(params).getPage(),
                new EntityWrapper<KetixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetixinxiEntity> wrapper) {
		  Page<KetixinxiView> page =new Query<KetixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetixinxiVO> selectListVO(Wrapper<KetixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetixinxiVO selectVO(Wrapper<KetixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetixinxiView> selectListView(Wrapper<KetixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetixinxiView selectView(Wrapper<KetixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KetixinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KetixinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KetixinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
