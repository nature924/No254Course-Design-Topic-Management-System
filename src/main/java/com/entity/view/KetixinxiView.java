package com.entity.view;

import com.entity.KetixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课题信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
@TableName("ketixinxi")
public class KetixinxiView  extends KetixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetixinxiView(){
	}
 
 	public KetixinxiView(KetixinxiEntity ketixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ketixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
