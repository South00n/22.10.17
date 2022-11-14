package com.sist.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mvnrepositort.com --> 라이브러리 저장소

//@Getter
//@Setter
//@NoArgsConstructor // 매개변수가없는 생성자
//@AllArgsConstructor // 모든 매개변수를 가지는 생성자
// 어노테이션 --> 구분자
// 변수가 10개 이상이면 롬복사용
public class MusicVO {
	@Getter
	@Setter
	private int mno;
	// mno만 게터세터 만들어짐
	@Getter
	@Setter
	private String title;
	// 클래스 내부에 넣으면 한개씩 생성
	private String singer;
	private String album;
	private String state; // 등폭
	private int crement;
}
