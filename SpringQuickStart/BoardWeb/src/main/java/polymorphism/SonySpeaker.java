package polymorphism;

//@Component("sony")
public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("=== SonySpeaker ��ü ����");
	}
	@Override
	public void volumnUp() {
		System.out.println("SonySpeaker �Ҹ��� �ø���.");
	}
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker �Ҹ��� ������.");
	}
}
