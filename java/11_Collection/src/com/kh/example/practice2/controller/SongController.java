package com.kh.example.practice2.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.practice2.control;
import com.kh.example.practice2.compare.ArtistDescending;
import com.kh.example.practice2.compare.TitleAscending;
import com.kh.example.practice2.model.Song;

public class SongController {

	private ArrayList<Song> list = new ArrayList<>();
	
	// 싱글톤 패턴(Singleton Pattern)
	// - 디자인 패턴 중 하나로 클래스가 최대 한 번만 객체 생성되도록 하는 패턴
	
	// 1, 생성자는 private 
	public SongController() {}
	
	// 2. 유일한 객체르르 담을 static 변수 
	private static SongController instance;
	
	// 3. 객체를 반환하는 static 메서드
	public static SongController getInstance() {
		if(instance == null) instance = new SongController();
	}
	
	public boolean addLastList(String title, String artist) {
		if (title.equals("") && !artist.equals("")) {
		return list.add(new Song(title, artist));	
		}
		return false;
	}

	public boolean addFirstList(Song song) {
		if (!song.getTitle("") && !song.getArtist(""));
		list.add(0, song);
		 return true;
}
	public ArrayList<Song> prinAll() {
		return list;
	}
	public Song searchSong(String title) {
		for (Song song : list) {
			if (song.getTitle().contains(title));	
		       return song;
		}
	
	return null;
	}
	public Song removeSong(String search, Song update) {
		for (Song song : list) {
			if (song.getTitle().equals(title)) {
               list.remove(list.indexOf(song), update);
			}
		}
		return null;
	}
	public void updateSong() {
		Song song = new control.removeSong(title);
		for ( song != null) {
		       System.out.pcintln(song + " 을 삭제했씁니다.");
		 }else {
			 System.out.println("삭제할 곡이 없습니다");
		}
		}
	public ArrayList<Song> ascTitle() {
		ArrayList<Song> cloneList = (ArrayList<Song>) list.clone();
		Collections.sort(cloneList, new TitleAscending());
	    return cloneList;
	}
	public void ArrayList<Song> descArtist() {
	ArrayList<Song> cloneList = (ArrayList<Song>) list.clone();
	Collections.sort(cloneList, new ArtistDescending());
	return col
	}
}
