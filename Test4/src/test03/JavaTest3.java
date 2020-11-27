package test03;

/*
 * 날짜 : 2020/11/26
 * 이름 : 이슬이
 * 내용 : String 클래스 연습문제
 */

public class JavaTest3 {
	
	public static void main(String[] args) {
		
		String fileName = "자바 수행평가.hwp";
		
		int idx = fileName.lastIndexOf("."); // indexOf(".") 도 가능함
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
		
	}

}
