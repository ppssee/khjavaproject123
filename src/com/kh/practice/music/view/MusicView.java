package com.kh.practice.music.view;

import java.util.*;
import java.util.Scanner;

import com.kh.practice.music.model.vo.Music;

public class MusicView {

	/**
	 *  메인메뉴 선택 
	 */
	public int musicMenu() {			
		Scanner sc = new Scanner(System.in);
		System.out.println("==== ==== ==== 메인 메뉴 ==== ==== ====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 > ");
		int value = sc.nextInt();
		return value;
	}
	
	
	
	/**
	 * 1. 2. 곡명, 가수명 입력받고 Music 객체 생성
	 */
	public Music inputMusicInfo(String t) {
		Scanner sc = new Scanner(System.in);
		System.out.println(t + " 위치에 곡 추가");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		// 두 개의 정보를 하나의 변수로 다루기 위해 
		// 객체가 필요함.
	
		Music music = new Music(title, singer);
		return music;
	}
	
	/**
	 * 3. 전체 곡 목록 출력
	 */
	public void showAllMusicList(List<Music> mList) {
		System.out.println("======= 전체 곡 목록 출력 =======");
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.println((i+1) + "번째 노래 -> " + "곡명 : " + music.getTitle()+ ", 가수명 : " + music.getSinger());
		}
	}
	
	/**
	 * 4. 특정 곡명 검색.
	 */
	public String inputMusicName(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str+"할 곡 명 입력 : ");
		String title = sc.nextLine();
		return title;
	}
	
	/**
	 * 4. 검색한 곡명 출력.
	 */
	public void showOneMusic(Music music) {
		System.out.println("검색한 곡의 곡명은 : " + music.getTitle() + ", 가수명은 : "+music.getSinger() + "입니다.");
	}
	
	/**
	 * 6. 곡 정보 수정.
	 * @param music
	 * @return
	 */
	public Music modifyMusicInfo(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡명 입력: ");
		String singer = sc.nextLine();
		
		music.setSinger(singer);
		return music;
		
	}
	
	
	
	
}
