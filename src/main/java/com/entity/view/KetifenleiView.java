package com.entity.view;

import com.entity.KetifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课题分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
@TableName("ketifenlei")
public class KetifenleiView  extends KetifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetifenleiView(){
	}
 
 	public KetifenleiView(KetifenleiEntity ketifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, ketifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
