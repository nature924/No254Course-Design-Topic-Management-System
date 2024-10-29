package com.entity.view;

import com.entity.ZiniketiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 自拟课题
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 18:13:11
 */
@TableName("ziniketi")
public class ZiniketiView  extends ZiniketiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZiniketiView(){
	}
 
 	public ZiniketiView(ZiniketiEntity ziniketiEntity){
 	try {
			BeanUtils.copyProperties(this, ziniketiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
