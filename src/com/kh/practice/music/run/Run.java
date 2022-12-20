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
			select = view.musicMenu();       // ���θ޴� ����.
			switch(select) {
			case 1 : 
				music = view.inputMusicInfo("������");
				mCon.addAtLast(music);
				view.displaySuccess("�߰� ����!");
				break;
			case 2 : 
				music = view.inputMusicInfo("ù");
				mCon.addAtZero(music);
				view.displaySuccess("�߰� ����!");
				break;
			case 3 : 
				List<Music> mList = mCon.printMusicList();
				view.showAllMusicList(mList);
				break;
			case 4 : 
				title = view.inputMusicName("�˻�");
				List<Music> findList = mCon.serachMusicsByName(title);
				view.showAllMusicList(findList);
				view.displaySuccess("��ȸ ����!");
//				index = mCon.serachOneByName(title);
//				music = mCon.selectOneByIndex(index);
//				view.showOneMusic(music);
				break;
			case 5 : 
				title = view.inputMusicName("����");
				index = mCon.serachOneByName(title);
				if(index == -1) {
					view.displayError("�������� �ʽ��ϴ�.");
					break;
				}
				mCon.removeMusic(index);
				view.displaySuccess("���� ����!");
				break;
			case 6 : 
				title = view.inputMusicName("����");
				index = mCon.serachOneByName(title);
				if(index == -1) {
					view.displayError("��ȸ ����!");
					break;
				}
				music = mCon.selectOneByIndex(index);
				music = view.modifyMusicInfo(music);
				mCon.updateMusic(index, music);
				view.displaySuccess("���� ����!");
				break;
			case 7 : 
				view.printMessage("=== === === ��� �������� ���� === === ===");
				mCon.sortByASC("title");
				view.printMessage("���� ����! 3���� ���� ������ּ���");
				break;
			case 8 : 
				view.printMessage("=== === === ��� �������� ���� === === ===");
				mCon.sortByDESC("title");
				view.printMessage("���� ����! 3���� ���� ������ּ���");
				break;
			case 9 : 
				view.printMessage("=== === === ������ �������� ���� === === ===");
				mCon.sortByASC("singer");
				view.printMessage("���� ����! 3���� ���� ������ּ���");
				break;
			case 10 : 
				view.printMessage("=== === === ������ �������� ���� === === ===");
				mCon.sortByDESC("singer");
				view.printMessage("���� ����! 3���� ���� ������ּ���");
				break;
			
			}
		} while(select != 0);
		
		
		
	}

}
