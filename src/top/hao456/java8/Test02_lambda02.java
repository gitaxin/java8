package top.hao456.java8;

/**
 * 【案例1】使用lambda实现自定义接口，来模拟登录
 */
public class Test02_lambda02 {
	
	public static void main(String[] args) {
		
		/**
		 * 1.使用匿名内部类方法实现Action接口
		 */
		
		new Action() {
			@Override
			public void login(String username,String password) {
				System.out.println(username+"登录成功。");
			}
		}.login("liming","123456");;
		
		
		
		/**
		 * 2.使用lambda表达式方式实现Action接口
		 */
		
		
		Action action = (String username,String password) -> {
			System.out.println(username+"登录成功。");//out:使用lambda表达式方式实现Action接口中的方法
		};
		
		action.login("liming","123456");//调用接口中方法
		
	}
	
	
	/**
	 * 自定义登录接口，该接口中只有一个接口方法，我们称这种接口为函数接口
	 */
	public static interface Action{
		void login(String username,String password);
	}
	
}

