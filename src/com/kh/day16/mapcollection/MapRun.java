package com.kh.day16.mapcollection;

import java.util.*;

import com.kh.day16.setcollection.Student;

public class MapRun {
	public static void main(String[] args) {
		Map<String, Student> stdMap = new HashMap<String, Student>();
		stdMap.put("1", new Student("손예진", 44, 66));
		stdMap.put("2", new Student("현빈", 55, 100));

		System.out.println("첫번째 학생 :" + stdMap.get("1").toString());
	}
	
	public void mapExample() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("061", "전라도");
		map.put("053", "대구");
		System.out.println("저장된 데이터의 수 : " +map.size());
		System.out.println("02 누르면 서울이 나옵니다: " + map.get("02"));
		System.out.println("031 누르면 서울이 나옵니다: " + map.get("031"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지역번호 입력 : ");
		String regionCode = sc.next();
		
		System.out.println("입력하신 지역번호에 대한 지역은 : " + map.get(regionCode));
		
	}
	
	public void mapExample2() {
		Map<String, Object> objmap = new HashMap<String, Object>();
		objmap.put("name", "핫팩");
		objmap.put("price", 1500);
		objmap.put("isGood", true);
		
		System.out.println("상품 이름은 " + objmap.get("name"));
		System.out.println("상품 가격은 " + objmap.get("price") + "원");
		String result = (boolean)objmap.get("isGood") ? "추천" : "비추천";
		System.out.println("추천여부는 " + result);
		
	}
}
