<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.dto;

<#list table.columns as column>
<#if column.isDateTimeColumn>
    <#assign hasDateType = true>
</#if>
</#list>
<#if hasDateType>
import java.util.Date;
</#if>
import com.alibaba.fastjson.JSON;

<@classComment value="DTO类"/>
public class ${className}Dto implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	<#list table.columns as column>
	/**
     * <#if (column.pk==true)>主键列</#if>
     * ${column.columnAlias!} 
     */
	private ${column.javaType} ${column.columnNameLower};
	</#list>

<@generateJavaColumns/>

	public String toString() {
		return JSON.toJSONString(this);
	}
	
}

<#macro generateJavaColumns>
	<#list table.columns as column>
	/**
     * 获取${column.columnAlias!} 
     */
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}
	/**
     * 设置${column.columnAlias!} 
     */
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>
