package com.company.composite.session7;

public class Client {

	public static void main(String[] args) {
		Area window = buildArea();
		display(window);
	}
	
	public static Area buildArea() {
		Area window = new Area("WINDOW窗口");
		
		Component logo = new ConcreteComponent("LOGO图片");
		Component loginButton = new ConcreteComponent("登录");
		Component regButton = new ConcreteComponent("注册");
		
		Area frame = new Area("FRAME1");
		
		window.addSubComponent(logo);
		window.addSubComponent(loginButton);
		window.addSubComponent(regButton);
		window.addSubComponent(frame);
		
		Component nameLable = new ConcreteComponent("用户名");
		Component nameTextBox = new ConcreteComponent("文本框");
		Component passwdLable = new ConcreteComponent("密码");
		Component passwdTextBox = new ConcreteComponent("密码框");
		Component nameCheckBox = new ConcreteComponent("复选框");
		Component remTextBox = new ConcreteComponent("记住用户名");
		Component passwdLinkLable = new ConcreteComponent("忘记密码");
		
		frame.addSubComponent(nameLable);
		frame.addSubComponent(nameTextBox);
		frame.addSubComponent(passwdLable);
		frame.addSubComponent(passwdTextBox);
		frame.addSubComponent(nameCheckBox);
		frame.addSubComponent(remTextBox);
		frame.addSubComponent(passwdLinkLable);
		return window;
	}

	private static void display(Area window) {
		System.out.println(window.getName());
		for (Component c : window.getSubComponents()) {
			if (c instanceof Area) {
				display((Area) c);
			} else {
				System.out.println(c.getName());				
			}
		}
	}
	
}
