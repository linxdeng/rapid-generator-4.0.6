package cn.yunlai.base;

import org.junit.Test;

import cn.org.rapid_framework.generator.GeneratorFacade;

public class GeneratorMain {

	@Test
	public void generateSingleTable() throws Exception {
		GeneratorFacade g = new GeneratorFacade();
		// g.deleteOutRootDir(); // 删除生成器的输出目录 //
		g.generateByTable("point_log", "template");
	}
}
