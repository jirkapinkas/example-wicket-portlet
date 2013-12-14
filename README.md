<h1>Just a simple application to showcase how to use Apache Wicket and Liferay 6.1.</h1>

<p>This project contains embedded HSQL database, which destroys all
	data at shutdown. If you want different database, add JDBC driver to
	pom.xml and change src/main/webapp/WEB-INF/applicationContext.xml</p>

<p>
	How to build WAR file:
	<code>mvn package</code>
</p>

<p>
	In the project are 2 portlets: "Item portlet" and "Item count portlet".
	Create a WAR file, deploy it to running Liferay server and add these two portlets to some page.
</p>

<p>
	If you want to develop using these technologies, download STS (Spring Tool Suite), 
	install from Eclipse Marketplace plugin "Liferay IDE", associate your Liferay instance 
	with STS (in view Servers), import this Maven project to STS and then simply deploy it
	to Liferay server.
</p>

<h2>My other projects:</h2>

<ul>
	<li><a href="http://www.javavids.com" target="_blank"
		title="Java video tutorials">Java video tutorials</a> (free online
		tutorials)</li>
	<li><a href="http://www.dipgen.com" target="_blank"
		title="Diploma Generator">Diploma Generator</a> (free OSS software)</li>
	<li><a href="http://sitemonitoring.sourceforge.net/"
		target="_blank" title="Website monitoring software">Website
			monitoring software</a> (free OSS software)</li>
	<li><a href="http://www.java-skoleni.cz" target="_blank"
		title="Java školení">Java školení</a> (in Czech)</li>
	<li><a href="http://www.sql-skoleni.cz" target="_blank"
		title="SQL školení">SQL školení</a> (in Czech)</li>
</ul>