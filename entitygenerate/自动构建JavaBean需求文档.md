## 输入：
	表名，编码字符集，额外增加不需要数据库映射的字段
## 输出：
	实体类Java文件
## 需求分析：
	1.建立maven工程，引入Oracle数据库连接驱动包，
	<dependency>
		<groupId>com.oracle</groupId>
		<artifactId>ojdbc6</artifactId>
		<version>11.2.0.3</version>
	</dependency>
	2.使用sql查出表名、字段名、字段注释、字段类型，
	3.建立实体类用于存储以上数据库字段信息，
	4.用一个静态变量HashMap存放数据库字段类型和JavaBean字段类型映射关系，
	5.用缓冲书写流BufferedWriter写入实体类Java文件，
	