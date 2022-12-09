package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "의 서브 리스트 입니다.------");
		File[] subFiles = dir.listFiles();
		
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];    // subFiles의 1개 객체만 fOne에 넣어줌.
			
			long time = fOne.lastModified();
			System.out.printf("%35s",fOne.getName());
			System.out.print("\t파일 크기 : " + fOne.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", time, time, time, time);
			
		}
		
	}
	

	public static void main(String[] args) {

		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
	}
	// File f2 = new File("c:\\windows\\Temp");
	//  if(!f2.exist()){ 		//존재 하지 않으면 디렉토리 생성.
	//    f2.mkdir(); 
	//  } 
	//  f2.renameTo(new File("경로"));
	
}
