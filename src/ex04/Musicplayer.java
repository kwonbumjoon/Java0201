package ex04;

import java.util.Scanner;

public class Musicplayer {
	public static void main(String[] args) {
		MediaPlayer player = new MP3player();

		Scanner s = new Scanner(System.in);
		
		int[] list = new int[] {};
		while(true) {
			for(int i=0; i<list.length; i++) {
				String name = s.nextLine();
				list[i] = Integer.parseInt(name);
			}
			System.out.println("");
		}
		
		
		
	}
}
