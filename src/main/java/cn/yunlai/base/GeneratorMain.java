package cn.yunlai.base;

import cn.org.rapid_framework.generator.GeneratorFacade;

public class GeneratorMain {

	public static void generateSingleTable(String tableName) throws Exception {
		GeneratorFacade g = new GeneratorFacade();
		g.deleteOutRootDir();
		g.getGenerator().setTemplateRootDir("classpath:template");
		g.generateByTable(tableName);
	}

	public static void generateMultiTable(String... tableNames) throws Exception {
		GeneratorFacade g = new GeneratorFacade();
		g.deleteOutRootDir();
		g.getGenerator().setTemplateRootDir("classpath:template");
		g.generateByTable(tableNames);
	}
}
