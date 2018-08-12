package top.hao456.java8;
/**
 * 
 * 一、lambda概述：
 * 	lambda表示数学符号"λ"，计算机领域中λ代表"λ演算"，表达了计算机中最基本的概念：
 * 	"调用"和"转换"。
 * 二、为什么使用lambda
 * 	1.Java是面向对象的语言，不能像函数式语言那样嵌套定义方法。
 * 	2.Java的匿名内部类只能存在于创建它的线程中，不能运行在多线程中，无法充分利用多核的硬件优势。
 * 	3.匿名内部类的缺点还有：
 * 		3.1 语法相对复杂。
 * 		3.2 在调用内部类的上下文中，指引和this的指代空易混淆。
 * 		3.3 类加载和实例创建语法不可避免。
 * 		3.4 不能引用外部的非final对象。
 * 		3.5 不能抽象化控制流程。
 * 三、lambda的语法包括三部分：
 * 	1. 参数列表
 * 	2. 箭头符号"->"
 * 	3. 代码块。
 * 
 *
 */
public class Test01_lambda01 {

	public static void main(String[] args) {
		/**
		 * 使用匿名内部类方式实现Runnable接口，重写 run方法
		 */
		new Runnable() {
			@Override
			public void run() {
				System.out.println("匿名内部类实现Runnable接口");
			}
		}.run();
		
		
		
		/**
		 * 用lambda简化Runnable接口的实现方法。
		 */
		int i = 1;
		Runnable runnable = () -> {
			System.out.println("使用lambda表达式实现Runnable接口");
			System.out.println("i="+i);
			//i++; //编译错误，在代码块中只能使用外部方法变量，不能改变外部变量的值，这和java8之前是一样的
		};
		
		runnable.run();//调用run方法
	}

}
