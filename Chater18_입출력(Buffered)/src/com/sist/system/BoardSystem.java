package com.sist.system;
import java.io.*;
import java.util.*;
public class BoardSystem {
	//게시판
	//글쓰기
	private static List<BoardVO> list = new ArrayList<BoardVO>();
	private static final String FILE_NAME = "c:\\java_data\\board.txt";
	
	public BoardSystem() {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			list = (List<BoardVO>)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	//파일읽기
	public void boardGetData() {
		
	}
	//파일저장
	public void boardSave() {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void boardInsert(BoardVO vo) {
		
	}
	
	public List<BoardVO> boardList(int page){
		
	}
	
	//???
	public int boardSequence() {
		int max=0;
		try {
			for(BoardVO vo:list) {
				if(vo.getNo()>max) {
					max=vo.getNo();
				}
			}
		}catch(Exception e) {
			
		}
	}
}
