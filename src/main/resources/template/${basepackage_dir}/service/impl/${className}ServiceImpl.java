<#include "/macro.include"/>
<#assign className = table.className>
<#assign remarks = table.remarks>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${basepackage}.mapper.${className}Mapper;
import ${basepackage}.model.${className};
import ${basepackage}.service.${className}Service;

<@classComment value="service实现接口"/>
@Service
public class ${className}ServiceImpl implements ${className}Service {
	/**
     * ${remarks} Mapper
     */
    @Autowired
    private ${className}Mapper ${classNameLower}Mapper;
	
	@Override
	@Transactional(readOnly = true)
	public List<${className}> queryList(${className} condition){
		return ${classNameLower}Mapper.queryList(condition);
	}
	
	@Override
	@Transactional(readOnly = true)
	public ${className} getOne(${className} condition){
		return ${classNameLower}Mapper.getOne(condition);
	}
	
	@Override
	@Transactional(readOnly = true)
	public ${className} getByKey(Object condition){
		return ${classNameLower}Mapper.getByKey(condition);
	}
	
	@Override
	public int updateByKey(${className} ${classNameLower}) {
		return ${classNameLower}Mapper.updateByKey(${classNameLower});
	}
	
	@Override
	public ${className} insert(${className} ${classNameLower}){
		${classNameLower}Mapper.insert(${classNameLower});
		return ${classNameLower};
	}
}
