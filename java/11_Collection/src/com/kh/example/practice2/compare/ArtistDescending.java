package com.kh.example.practice2.compare;

import java.util.Comparator;

import com.kh.example.practice2.model.Song;

public class ArtistDescending implements Comparator<Song>{
   
	// 클래스 클래스  인스텐드
	// 클래스 인터페이스  인플먼트
	// 인터페이스 인터페이스  인스턴드
	
	
	@Override
	public int compare(Song o1, Song o2) {
		return o2.getArtist().compareTo(o1.getArtist());
	}

	
}
