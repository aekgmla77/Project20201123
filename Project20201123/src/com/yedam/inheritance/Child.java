package com.yedam.inheritance;

public class Child extends Parent { //extends 로 상속받을 사람 지정.
    String field2;
    
    public Child() {
    	super();
    }
    
    public Child(String field1, String field2) {
    	super(field1);//부모 생성자가 가지고 있는 걸로 필드를 채운다. super은 부모 클래스.
    	this.field2 = field2;
    }
     public void method2() { //method1을 호출하고 2 호출.
    	 super.method1();
    	 System.out.println("method2() 호출");
     }
}
