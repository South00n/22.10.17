package com.sist.server;

import java.util.*;
import java.io.*;
import java.net.*;
/*
 * 						|=> 오라클 서버, 웹 서버
 *     서버 프로그램 ====> TCP(신뢰성중심, 연결지향적 => 전화) / UDP (게임개발쪽, 비연결지향적 = 우편)
 *     ---------	   ---------------------------------------------------------- RTCP (화상, 음성)
 *     	1. 전화기를 개통
 *     	   ---- 연결기기 => 소프트웨어로 제작, 전화번호, 전화선
 *     	 		----- Socket, IP(고정 IP), PORT (0~65535)
 *     									 ---------------
 *     									 사용중인 PORT
 *     									 = FTP : 21
 *     									 = SMTP : 25
 *     									 = TELNET : 23
 *     									 = HTTP : 80
 *     									 = 머드 서버 : 4000
 *     									 = 프록시 서버 : 8080
 *     									 = 오라클 서버 : 1521
 *     									 = 스프링 서버 : 8080
 *     								     = React : 3000
 *     									====================> 0 ~ 1023까지 이미 사용
 *     			------ 개통 bind()
 *     			Socket s = new Socket();
 *     			s.bind(ip, port)
 *     
 *      2. 전화가 올때까지 대기상태
 *      		s.listen() 
 *      3. 전화가 왔을때 어떻게 처리
 *      		s.accept() => 접속을 받은 경우 => 접속한 사람의 IP ==> 발신자번호
 *      4. 통신 시작
 *      		s.write() => 전송 =======> s.read()
 *      		s.read() => 요청을 받는다 <== s.write()
 */
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
