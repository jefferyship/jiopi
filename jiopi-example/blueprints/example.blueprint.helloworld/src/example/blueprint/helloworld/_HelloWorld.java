package example.blueprint.helloworld;

import org.jiopi.framework.annotation.blueprint.RegisterConstructor;

@Version
@RegisterConstructor("example.helloworld")
public final class _HelloWorld{
	
	
	/**
	 * 默认构造器，完全基于配置文件的装配信息构造
	 * 
	 * 1.从级联式配置文件获取默认配置信息
	 * 2.从级联式版本库获取信息
	 * @return
	 */
	public static HelloWorld _new(Object... arg){
		return null;
	}
	
	/**
	 * 根据指定配置创建对象 
	 * @param moduleName     模块名
	 * @param moduleVersion  兼容版本
	 * @param configuration  配置文件
	 * @param arg            初始化构造参数
	 * @return
	 */
	public static HelloWorld _instance(String moduleName,String moduleVersion,String configuration,Object... arg){
		return null;
	}
	
	/**
	 * 根据配置
	 * @param id
	 * @param args[] 构造器参数
	 * @return
	 */
	public static HelloWorld _configurate(String id,Object... args){
		return null;
	}
	
}
