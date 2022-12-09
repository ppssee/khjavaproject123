package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "�� ���� ����Ʈ �Դϴ�.------");
		File[] subFiles = dir.listFiles();
		
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];    // subFiles�� 1�� ��ü�� fOne�� �־���.
			
			long time = fOne.lastModified();
			System.out.printf("%35s",fOne.getName());
			System.out.print("\t���� ũ�� : " + fOne.length());
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n", time, time, time, time);
			
		}
		
	}
	

	public static void main(String[] args) {

		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
	}
	// File f2 = new File("c:\\windows\\Temp");
	//  if(!f2.exist()){ 		//���� ���� ������ ���丮 ����.
	//    f2.mkdir(); 
	//  } 
	//  f2.renameTo(new File("���"));
	
}
