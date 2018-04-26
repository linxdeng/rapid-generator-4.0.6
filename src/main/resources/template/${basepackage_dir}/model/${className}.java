<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;

<#list table.columns as column>
<#if column.isDateTimeColumn>
    <#assign hasDateType = true>
</#if>
</#list>
<#if hasDateType>
import java.util.Date;
</#if>
import com.alibaba.fastjson.JSON;

<@classComment value="模型类"/>
public class ${className} {
	<#list table.columns as column>
	/**
     * <#if (column.pk==true)>主键列</#if>
     * ${column.columnAlias!} 
     */
	private ${column.javaType} ${column.columnNameLower};
	</#list>
	
	<@generateConstructor className/>
	<@generateJavaColumns/>

	public String toString() {
		return JSON.toJSONString(this);
	}
}

<#macro generateJavaColumns>
	<#list table.columns as column>
	
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>
