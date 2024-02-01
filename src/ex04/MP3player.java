package ex04;

public class MP3player implements MediaPlayer {
	boolean flag = false;
	private String file;
	int[] arr = {};
	int count = 0;
	
	@Override
	public void play() {
		if(flag == true) {
				System.out.println("MP3 파일 "+ this.file +" 재생 중...");
				System.out.println(count+1);
				count++;
			}
		else {
			System.out.println("MP3 파일 "+ this.file +" 재생 중...");
			flag = true;
		}			
	}

	@Override
	public void pause() {
		if(flag == true){
			System.out.println("일시정지");
			flag = false;
		}
	}

	@Override
	public void stop() {
		if(flag == true) {
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[count] + "정지");
				flag = false;
				continue;
			}
			System.out.println("처음부터 재생");
		}
	}

	@Override
	public void loadFile(String file) {
		for(int i=0; i<arr.length; i++) {
			this.file = file;
			arr[i] = this.arr[i];
			
			System.out.println(this.arr[count]);
		}
		
		flag = true;
	}
	
}
