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
				view.displaySuccess("추가 성공!");
				break;
			case 2 : 
				music = view.inputMusicInfo("첫");
				mCon.addAtZero(music);
				view.displaySuccess("추가 성공!");
				break;
			case 3 : 
				List<Music> mList = mCon.printMusicList();
				view.showAllMusicList(mList);
				break;
			case 4 : 
				title = view.inputMusicName("검색");
				List<Music> findList = mCon.serachMusicsByName(title);
				view.showAllMusicList(findList);
				view.displaySuccess("조회 성공!");
//				index = mCon.serachOneByName(title);
//				music = mCon.selectOneByIndex(index);
//				view.showOneMusic(music);
				break;
			case 5 : 
				title = view.inputMusicName("삭제");
				index = mCon.serachOneByName(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				mCon.removeMusic(index);
				view.displaySuccess("삭제 성공!");
				break;
			case 6 : 
				title = view.inputMusicName("수정");
				index = mCon.serachOneByName(title);
				if(index == -1) {
					view.displayError("조회 실패!");
					break;
				}
				music = mCon.selectOneByIndex(index);
				music = view.modifyMusicInfo(music);
				mCon.updateMusic(index, music);
				view.displaySuccess("수정 성공!");
				break;
			case 7 : 
				view.printMessage("=== === === 곡명 오름차순 정렬 === === ===");
				mCon.sortByASC("title");
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			case 8 : 
				view.printMessage("=== === === 곡명 내림차순 정렬 === === ===");
				mCon.sortByDESC("title");
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			case 9 : 
				view.printMessage("=== === === 가수명 오름차순 정렬 === === ===");
				mCon.sortByASC("singer");
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			case 10 : 
				view.printMessage("=== === === 가수명 내림차순 정렬 === === ===");
				mCon.sortByDESC("singer");
				view.printMessage("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			
			}
		} while(select != 0);
		
		
		
	}

}
