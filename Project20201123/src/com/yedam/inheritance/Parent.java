package com.yedam.inheritance;

public class Parent {
    String field1;
    
    public Parent() {
    	super();
    }
    
    public Parent(String field1) {
    	this.field1 = field1;
    }
    public void method1() {
    	System.out.println("method1() 호출." );
    }
}


//Parent > child> grand