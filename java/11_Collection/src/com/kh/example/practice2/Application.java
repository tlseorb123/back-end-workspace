package com.kh.example.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.example.practice2.compare.ArtistDescending;
import com.kh.example.practice2.compare.TitleAscending;
import com.kh.example.practice2.controller.SongController;
import com.kh.example.practice2.model.Song;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private SongController control = SongController.getInstance();

	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		try {

			boolean check = true;
			while (check) {
				System.out.println("====== 메인 메뉴 ======");
				System.out.println("1.마지막 위치에 추가  ");
				System.out.println("2.첫 위치에 곡 추가  ");
				System.out.println("3.전체 곡 목록 출력  ");
				System.out.println("4.특정 곡 검색  ");
				System.out.println("5.특정 곡 삭제  ");
				System.out.println("6.트정 곡 수정  ");
				System.out.println("7.곡 명 오름차순 정렬  ");
				System.out.println("8.가수 명 내림차순 정렬  ");
				System.out.println("9.종료  ");
				System.out.println("메뉴 번호 입력 : ");
				int menu = Integer.parseInt(sc.nextLine());

				switch (menu) {
				case 1:
					addLastList();
					break;
				case 2:
					addFirstList();
					break;
				case 3:
					printAll();
					break;
				case 4:
					searchSong();
					break;
				case 5:
					removeSong();
					break;
				case 6:
					updateSong();
					break;
				case 7:
					ascTitle();
					break;
				case 8:
					descArtist();
					break;
				case 9:
					break;

				}
			}

		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다." + e.getMessage());
			mainMenu();
		}
	}

	// 1. 마지막 위치에 곡 추가
	public void addLastList() {
		System.out.println("***** 마지막 위치에 곡 추가 *****");

		System.out.println("곡 명 : ");
		String title = sc.nextLine();

		System.out.println("가수 명 : ");
		String artist = sc.nextLine();

		boolean result = control.addLastList(title, artist);
		if (result) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	// 2. 첫 위치에 곡 추가
	public void addFirstList() {
		System.out.println("****** 첫 위치에 곡 추가 ********");

		System.out.println("곡 명 : ");
		String title = sc.nextLine();

		System.out.println("가수 명 : ");
		String artist = sc.nextLine();

		Song song = new Song(title, artist);
		boolean result = control.addFirstList(song);
		if (result) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	// 3. 전체 곡 목록 출력
	public void printAll() {
		System.out.println("***** 전체 곡 목록 출력 ******");
		for (Song song : control.printAll()) {
			System.out.println(song);
		}
	}

	// 4. 특정 곡 검색
	public void searchSong() {
		System.out.println("****** 특정 곡 검색 ******");

		System.out.println("검색할 곡 명 :");
		String title = sc.nextLine();

		Song song = control.searchSong(title);
		if (song != null) {
			System.out.println(song + " 을 검색 했습니다.");
		} else
			System.out.println("검색할 곡을 찾지 못했습니다.");
	}

	// 5. 특정 곡 삭제
	public void removeSong() {

		System.out.println("***** 특정 곡 검색 ******");
		System.out.println("삭제할 곡 명 :");
		String title = sc.nextLine();

		boolean check = true;
	   control.removeSong(title);
	   System.out.println(song + "을 삭제 했습니다");
		if (check) {
			System.out.println("삭제할 곡이 없습니다.");
		}
	}

	// 6. 특정 곡 수정
	public void updateSong() {
		System.out.println("****** 특정 곡 수정 *******");
		System.out.println("검색할 곡 명 :");
		String search = sc.nextLine();

		System.out.println("수정할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println("수정할 가수 명 : ");
		String artist = sc.nextLine();

		Song update = new Song(title, artist);
		control.updateSong(search, song));
	}

	// 7. 곡 명 오름차순 정렬
	public void ascTitle() {
		System.out.println("***** 곡 명 오름차순 정렬 ******");
		for (Song song : cloneList) {
			System.out.println(song);
		}
	}

	// 8. 가수 명 내림차순 정렬
	public void descArtist() {
		System.out.println("****** 곡 명 내림차순 정렬 ******");
		ArrayList<Song> cloneList = (ArrayList<Song>) list.clone();
		Collections.sort(cloneList, new ArtistDescending());
		for (Song song : cloneList) {
			System.out.println(song);
		}
	}
}
