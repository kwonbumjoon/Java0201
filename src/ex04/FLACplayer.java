package ex04;

public class FLACplayer implements MediaPlayer {
	@Override
	public void play() {
		System.out.println("FLAC 파일 재생 중...");
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void stop() {
	}

	@Override
	public void loadFile(String[] file) {
	}

}
