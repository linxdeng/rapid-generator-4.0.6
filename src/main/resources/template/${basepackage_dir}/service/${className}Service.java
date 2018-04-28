<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#assign remarks = table.remarks>
package ${basepackage}.service;

import java.util.List;

import ${basepackage}.model.${className};

<@classComment value="service接口"/>
public interface ${className}Service {
	/**
	 * 根据查询条件查询列表
     * 
     * @param condition 查询条件
     * @return ${remarks}集合
	 */
	List<${className}> queryList(${className} condition);
	
	/**
	 * 根据查询条件查询单个数据
     * 
     * @param condition 查询条件
     * @return ${remarks}
	 */
	${className} getOne(${className} condition);
	
	/**
	 * 根据主键查询数据
     * 
     * @param condition 查询主键
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
     * @param condition 插入对象
     * @return 返回插入的对象，带自增值
	 */
	${className} insert(${className} ${classNameLower});
	
	/**
	 * 批量插入数据
     * 
     * @param condition 列表对象
     * @return 操作影响行数
	 */
	int insertBatch(List<${className}> list);
}

