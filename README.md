# lambda表达式
## 一、lambda概述：
     lambda表示数学符号"λ"，计算机领域中λ代表"λ演算"，表达了计算机中最基本的概念： "调用"和"转换"。
## 二、为什么使用lambda
      1.Java是面向对象的语言，不能像函数式语言那样嵌套定义方法。
      2.Java的匿名内部类只能存在于创建它的线程中，不能运行在多线程中，无法充分利用多核的硬件优势。
      3.匿名内部类的缺点还有：
          3.1 语法相对复杂。
          3.2 在调用内部类的上下文中，指引和this的指代空易混淆。
          3.3 类加载和实例创建语法不可避免。
          3.4 不能引用外部的非final对象。
          3.5 不能抽象化控制流程。
## 三、lambda的语法包括三部分：
       1. 参数列表
       2. 箭头符号"->"
       3. 代码块。
       
# Stream接口
## 一、什么是Stream
  	1. Stream在Java8中被定义为泛型接口
 	2. Stream接口代表数据流：此数据流并非我们所熟知的I/O流
  	3. Stream不是一个数据结构，不直接存储数据。
  	4. Stream通过管道操作数据。
 	5. 创建Stream接口实现类对象：
  		stream():创建一个Stream接口实现类的对象。
  	例如：
  		Stream<Person> stream = people.stream();
  		其中people是一个ArrayList集合，调用其中的stream()方法，返回一个Stream对象
 
## 二、 什么是管道
 	1. 管道：代表一个操作序列。
 	2. 管道包含以下组件：
 		a. 数据集：可能是集合、数组等。
 		b. 零个或多个中间业务。如过滤器
 		c. 一个终端操作，如forEach
## 三、什么是过滤器
 	1. 过滤器：用给定的条件在源数据基础上过滤出新的数据，并返回一个Stream对象。
 	2. 过滤器包含匹配的谓词。
 		例如：判断p对象是否为男性的lambda表达式：
 			Stream<Person> stream = people.stream();
 			stream = stream.filter(p->p.getGender() == '男');
 			
 			
 			
 			
 			
# 【过滤器案例】
	过滤出集合中名字含有“菲”字的Person对象
	
	
# DoubleStream接口
## 一、DoubleStream接口表示元素类型是double的数据源。
## 二、DoubleStream接口的常用方法：
	1. stream.max().getAsDouble():获取流中数据集的最大值。
	2. stream.min.getAsDouble():获取流中数据集的最小值。
	3. stream.average():获取流中数据集的平均值。
	
## 【案例】统计people集合中姓名中包含“菲”字的平均身高。
	 