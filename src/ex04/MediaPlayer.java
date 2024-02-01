package ex04;

public interface MediaPlayer {
	
	void play(); // 미디어 파일을 재생하는 기능
	void pause();	// 미디어 파일의 재생을 일시 정지하는 기능
	void stop();	// 미디어 파일의 재생을 정지하고 처음으로 되돌리는 기능
	void loadFile(String file);	// 미디어 파일을 로드하는 기능
}
