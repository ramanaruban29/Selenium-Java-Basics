package com.LearningJava;

public class Access {
	public static void main(String args[])
	{
		AccessModifiers  ca= new AccessModifiers();
		ca.publicMethod();
		ca.defaultMethod();
		//ca.privateMethod();
		ca.protectedMethod();
	}

}
