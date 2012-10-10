CesTa (Code Enhancement Security Transformation and Analysis) - 
	tool for enhancing security by program transformations and analysis :-)

== More information ==

For more information please see http://cesta.sourceforge.net/.

== Building ==

For building CesTa please use build.xml, that is located in root of the project. 
jUnit tests are transformed automatically before test compilation. 
In NetBeans you can run all test (original and transformed) via ALT+F6. 
ValidateStateTransitionsTest will fail before transformation, 
because it contains non valid state transition. 

== Project structure ==

	jc-samples
		- sample project, that uses sample source files from Sun Microsystems,
		see jc-samples/README.TXT
	
	lib
		- needed libraries

	res		
		- various resources, that will be included in release 
		(most important is build.xml, which contains simple demo
		with instructions)
		
	res/README.TXT
		- info about release

	src
		- source files
	src/org/cesta/grammars 
		- ANTLR grammars of parsers needed for transformations
	src/templates
		- Default StringTemplate templates for transformations
	
	test/org/cesta/...
		- simple test classes for build-in transformations
	test/transformed/org/cesta/...
		- transformed test classes
	
	build.xml
		- default build script for framework
		Custom targets:
			- target antlr-transformations for generating parsers
			- target transform-tests for generating transformed jUnit test classes,
			that is automatically called before compilation of test
			
		Please read build.xml for more details. 
		
== Dependencies ==
	
	Ant (1.7+)
	ANTLR (3.2+)
	StringTemplate (3.2+)
			
== Notes ==

	If you use NetBeans, you can add support for ANTLR grammar files into your editor via plugin "Antlr Editor Support"
		http://plugins.netbeans.org/PluginPortal/faces/PluginDetailPage.jsp?pluginid=14444
