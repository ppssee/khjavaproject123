package com.kh.practice.music.controller;

import java.util.*;
import com.kh.practice.music.model.vo.Music;

public class MusicController {
	private List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
	}

	
	/**
	 * ������ ��ġ�� �� �߰�
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}
	/**
	 * ù ��ġ�� �� �߰�
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	/**
	 * �� ����
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}

	/**
	 *��ü ������ ��ȸ, mList ��ȯ
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	
	/**
	 * �̸����� ���� ��� �˻�
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
	 * �̸����� �ε��� ��ȸ
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
	 * �ε����� ����Ʈ���� ��ȸ
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);
	}
	/**
	 * �� ����.
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	
	/**
	 * ���ڿ� �������� �����ϱ�.
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
	 * ���ڿ� �������� �����ϱ�.
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
