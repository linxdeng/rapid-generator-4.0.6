<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#assign remarks = table.remarks>
package ${basepackage}.service;

import java.util.List;

import ${basepackage}.model.${className};

<@classComment value="内部服务接口"/>
public interface ${className}Service {
	/**
	 * 根据查询条件查询列表
     * 
     * @param condition 查询对象
     * @return ${remarks}集合
	 */
	List<${className}> list(${className} condition);
	
	/**
	 * 根据查询条件查询单个数据
     * 
     * @param condition 查询对象
     * @return ${remarks}
	 */
	${className} getOne(${className} condition);
	
	/**
	 * 根据主键查询数据
     * 
     * @param condition 查询对象
     * @return ${remarks}
	 */
	${className} getByKey(Object condition);
	
	/**
	 * 根据主键更新数据
     * 
     * @param condition 更新对象
     * @return 操作影响行数
	 */
	int updateByKey(${className} ${classNameLower});
	
	/**
	 * 插入数据
     * 
     * @param condition 更新对象
     * @return 操作影响行数
	 */
	${className} insert(${className} ${classNameLower});
}

