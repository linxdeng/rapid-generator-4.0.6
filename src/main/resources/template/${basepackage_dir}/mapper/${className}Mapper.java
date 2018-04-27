<#assign className = table.className>   
<#assign remarks = table.remarks> 
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.mapper;

import java.util.List;

import ${basepackage}.model.${className};

<@classComment value="Mapper映射文件"/>
public interface ${className}Mapper {
	/**
	 * 根据查询条件查询列表
     * 
     * @param condition 查询对象
     * @return ${remarks}集合
	 */
	List<${className}> queryList(${className} condition);
	
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
	int insert(${className} ${classNameLower});
	
}
