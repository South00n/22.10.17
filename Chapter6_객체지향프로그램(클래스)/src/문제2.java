class Food {
	String title;
	double score;
	String address;
	String tel;
	String kind;
	String cost;
	String pk;
	String time;
	String[] menuTitle;
	String[] menuCost;
	String[] poster;
}
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = new Food();
		
		f.title = "조점례남문피순대";
		f.score = 4.3;
		f.address = "전라북도 전주시 완산구 풍남물2길 39 남부시장";
		f.tel = "063-232-5006";
		f.kind = "탕 / 찌개 / 전골";
		f.cost = "만원 미만";
		f.pk = "무료주차 가능";
		f.time = "06:00 ~ 24:00";
		f.menuTitle = new String[]{"순대국밥", "피순대(소)", "잡채순대", "모듬고기(소)", "머리눌림(소)"};
		f.menuCost = new String[]{"7,000원", "12,000원", "10,000원", "12,000원", "12,000원"};
		f.poster = new String[] {};
		
	}

}
