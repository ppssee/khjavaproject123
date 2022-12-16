package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("D:\\Temp\\moomeok.png");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		
		System.out.println("파일 이름 : " + fileName);
		System.out.println("파일 경로 : " + path);
		System.out.println("부모 폴더 : " + parent);
		
		File fileMake = new File("src/iostream/fileOne.txt");
		
		try {
		//	fileMake.createNewFile();
			
			File folderMake = new File("src/file");
		//	folderMake.mkdir();
			
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();
			
			System.out.println("파일이 존재하는가? : " + fileMake.exists());
			System.out.println("fileOne.txt가 파일이 맞는가? : " + fileMake.isFile());
			System.out.println("file폴더가 폴더가 맞는가? : " + folderMake.isDirectory());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//////////// Menu Funtion /////////////////// 
	

	
}
