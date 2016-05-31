package com.opl.junitme.testUtils;


import java.io.File;

import org.junit.Test;

import com.opl.junitme.main.Main;


public class LauncherTest {

	/**
	 * java   jarJunitMe2.0.jar < projectPath >< nbTests >< alloyRunCount >
Therefore, the program will analyse the project located at projectPath, execute the resulting Alloy model with a run count fixed to alloyRunCount (if this parameter isn’t specified, its default value will be 8), 
and generate nbTests tests for this project
	 * @throws Exception
	 */
	@Test
	public void testMainJipa() throws Exception{
		int nrTestCasesToGenerate = 100;
		int alloyScope = 8;
		Main.main(new String[]{
				new File(
				"./examples/26_jipa/").getAbsolutePath(),
				Integer.toString(nrTestCasesToGenerate), 
				Integer.toString(alloyScope)
				});
		
	}
	
	
	@Test
	public void testMainNewzg() throws Exception{
		
		int nrTestCasesToGenerate = 5;
		int alloyScope = 5;
		Main.main(new String[]{
				new File("./examples/newzg/").getAbsolutePath()
				,
				Integer.toString(nrTestCasesToGenerate), 
				Integer.toString(alloyScope)
				});
		
	}
	
	
}
