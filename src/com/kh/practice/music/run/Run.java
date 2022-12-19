package com.kh.practice.music.run;

import java.util.*;

import com.kh.practice.music.controller.MusicController;
import com.kh.practice.music.model.vo.Music;
import com.kh.practice.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mCon = new MusicController();
		Music music = null;
		String title = "";
		int index = 0;
		
		int select = 0;
		do {
			select = view.musicMenu();       // 메인메뉴 선택.
			switch(select) {
			case 1 : 
				music = view.inputMusicInfo("마지막");
				mCon.addAtLast(music);
				break;
			case 2 : 
				music = view.inputMusicInfo("첫");
				mCon.addAtZero(music);
				break;
			case 3 : 
				List<Music> mList = mCon.printMusicList();
				view.showAllMusicList(mList);
				break;
			case 4 : 
				title = view.inputMusicName("검색");
				index = mCon.serachOneByName(title);
				music = mCon.selectOneByIndex(index);
				view.showOneMusic(music);
				break;
			case 5 : 
				title = view.inputMusicName("삭제");
				index = mCon.serachOneByName(title);
				mCon.removeMusic(index);
				break;
			case 6 : 
				title = view.inputMusicName("수정");
				index = mCon.serachOneByName(title);
				music = mCon.selectOneByIndex(index);
				music = view.modifyMusicInfo(music);
				mCon.updateMusic(index, music);
				
				break;
			case 7 : break;
			case 8 : break;
			case 9 : break;
			case 10 : break;
			
			}
		} while(select != 0);
		
		
		
	}

}
