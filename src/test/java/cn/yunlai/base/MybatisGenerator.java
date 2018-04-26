package cn.yunlai.base;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;

import cn.org.rapid_framework.generator.GeneratorProperties;

public class MybatisGenerator {

	@Test
	public void generateSingleTable() throws Exception {
		GeneratorMain.generateSingleTable("point_log");
	}

	@Test
	public void generateMultiTable() throws Exception {
		GeneratorMain.generateMultiTable("point_log");
	}
	
	@After
	public void openDir() throws IOException {
		String dir = GeneratorProperties.getProperty("outRoot");
		Runtime.getRuntime().exec("cmd.exe /c start " + dir);
	}
	
}
