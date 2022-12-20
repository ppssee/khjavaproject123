package com.kh.practice.music.controller;

import java.util.*;
import com.kh.practice.music.model.vo.Music;

public class MusicController {
	private List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
	}

	
	/**
	 * 마지막 위치에 곡 추가
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}
	/**
	 * 첫 위치에 곡 추가
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	/**
	 * 곡 삭제
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}

	/**
	 *전체 데이터 조회, mList 반환
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	
	/**
	 * 이름으로 음악 목록 검색
	 * @param title
	 */
	public List<Music> serachMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for(Music mOne : mList) {
			if(mOne.getTitle().equals(title)) {
				findList.add(mOne);
			}
		}
		return findList;
	}
	
	/**
	 * 이름으로 인덱스 조회
	 * @param musicName
	 * @return
	 */
	public int serachOneByName(String musicName) {
		for(int i = 0; i < mList.size(); i ++) {
			Music music = mList.get(0);
			if(musicName.equals(music.getTitle())) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 인덱스로 리스트에서 조회
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);
	}
	/**
	 * 곡 수정.
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	
	/**
	 * 문자열 오름차순 정렬하기.
	 */
	public void sortByASC(String title) {
		for(int i = 0; i< mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(title.equals("title")) {
					if(mOne.getTitle().compareTo(mTwo.getTitle()) < 1 ){ 
						Music temp = mOne;
						mList.set(i, mTwo);
						mList.set(e, temp);
					}
				}
				else if(title.equals("singer")) {
					if(mOne.getSinger().compareTo(mTwo.getSinger()) < 1 ){ 
						Music temp = mOne;
						mList.set(i, mTwo);
						mList.set(e, temp);
					}
				}
			}
		}
	}
	/**
	 * 문자열 내림차순 정렬하기.
	 */
	public void sortByDESC(String title) {
		for(int i = 0; i< mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(title.equals("title")) {
					if(mOne.getTitle().compareTo(mTwo.getTitle()) > 1 ){ 
						Music temp = mOne;
						mList.set(i, mTwo);
						mList.set(e, temp);
					}
				}
				else if(title.equals("singer")) {
					if(mOne.getSinger().compareTo(mTwo.getSinger()) > 1 ){ 
						Music temp = mOne;
						mList.set(i, mTwo);
						mList.set(e, temp);
					}
				}
			}
		}
	}
	

	
	
}
