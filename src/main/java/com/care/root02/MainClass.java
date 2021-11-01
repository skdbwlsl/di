package com.care.root02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml";  //경로 classpath : java Resources의 src/main/resources를 의미하고 그 경로에 xml파일이 있다
		GenericXmlApplicationContext  ctx =           //해당하는 컨테이너에 대한 값(st01,stb)을 가져온다.
				new GenericXmlApplicationContext(path); //xml파일 로드
		STBean stBean= ctx.getBean("stb", STBean.class); //객체 얻어오기(ctx를 통해 bean얻어오기, 이름은 stb), 데이터 자료형 class는 STBean
		
		//STBean stBean = new STBean();  //xml에서 작성했기 때문에 쓸 필요가 없다
		//stBean.setName("홍길동111");
		//stBean.setAge(20);
		
		//stBean.setSt(new Student());    //xml에서 작성했기 때문에 쓸 필요가 없다
		stBean.namePrint();
		stBean.agePrint();
	}

}
