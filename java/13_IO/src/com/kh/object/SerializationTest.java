package com.kh.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import com.kh.object.model.Person;

public class SerializationTest {

	public static void main(String[] args) {

		SerializationTest s = new SerializationTest();
//		s.fileSave();
//		s.fileRead();
//		s.objectsSave();
		s.objectsRead();
	}

	String fileName = "src/person.obj";
	
	// 직렬화(serialization) : 객체를 데이터 스크림으로 만드는 것
	public void fileSave() {

		
	  
	   try(
			   FileOutputStream fos = new FileOutputStream(fileName);
			   ObjectOutputStream oos = new ObjectOutputStream(fos);
			   			   
			// ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		 
			   // 1. 스트림 생성  -> 스트림은 물처럼 흘러야 한다.
			   // FileOutputStream : 파일 출력에 사용되는 기본 바이트 스트림 클래스
			   // ObjectOutputStream : 객체 단위로 출력시에 사용되는 보조 바이트 스트림 클래스
			   ){
	         
		     // 2. 파일에 저장할 객체 생성 
		   Person p = new Person("제니", 28, "jennierubyjane");
		   
		   // 3. 파일에 데이터(객체) 저장  
		   oos.writeObject(p);
		 
		   System.out.println("person.obj 파일에 정보 저장!");
		   
		   
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
	}
	
	// 역직렬화(deserialization) : 저장된 내용이나 전송받은 내용을 다시 복원하는 것 
	public void fileRead() {
		
		
		
		try(
				// 1. 스트림 생성 
				// FileInputStream : 파일 출력에 사용되는 기본 바이트 스트림 클래스 
				// ObjectInputStream : 객체 단위로 출력 시에 사용되는 보조 바이트 스크림 클래스
				FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				){
			
			// 2. 보조  스트림에 담겨진 객체 가져오기 
			Person p = (Person) ois.readObject();
			System.out.println(p);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {       
			e.printStackTrace();
		}
	}
	
	// 여러 객체를 저장 (for 문 이용)
	public void objectsSave() {
		List<Person> list = Arrays.asList(
				new Person("제니", 28, "hennierbyjane"),
				new Person("지수", 29, "sootaaa_"),
				new Person("로제", 26, "roses_are_rosie"),
				new Person("뷔", 28, "thv"),
				new Person("지민", 28, "j.m") 		
				);
		
		try(    // 1. 스트림 생성 
				FileOutputStream fl = new FileOutputStream(fileName);
				ObjectOutputStream ob = new ObjectOutputStream(fl);
				){
		
			// 2. 스트림 저장
	   for(Person p : list) {
		   ob.writeObject(p);
	   }
		
	   System.out.println("Person.obj 파일에 정보 저장");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
			
	
	}
	
	// 파일에 저장한 데이터 읽기 (반복문 사용 )
	public void objectsRead() {
		try(    // 1. 스트림 생성 
				FileInputStream fl = new FileInputStream(fileName);
				ObjectInputStream ob = new ObjectInputStream(fl);
				){
		
			// 2. 객체 값 가져오기
		while(true) {
			System.out.println(ob.readObject());	
		}
			
		
			
			
			
		} catch(Exception e) {
			
		}
		
	}
}
