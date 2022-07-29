package polymorphism;

//public class SamsungTV {
//	public void powerOn() {
//		System.out.println("SamsungTV---������ �Ҵ�.");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTV---������ ����.");
//	}
//	public void volumeUp() {
//		System.out.println("SamsungTV---�Ҹ��� �ø���.");
//	}
//	public void volumnDown() {
//		System.out.println("SamsungTV---�Ҹ��� ������.");
//	}
//}

//������ ���� - ���
//public class SamsungTV implements TV {
//	public void initMethod() {
//		System.out.println("===��ü �ʱ�ȭ �۾� ó��..===");
//	}
//	public void destroyMethod() {
//		System.out.println("===��ü ���� ���� ó���ؾ��� ���� ó��..===");
//	}
//	public SamsungTV() {
//		System.out.println("===SamsungTV ��ü ����===");
//	}
//	public void powerOn() {
//		System.out.println("SamsungTV---������ �Ҵ�.");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTV---������ ����.");
//	}
//	public void volumeUp() {
//		System.out.println("SamsungTV---�Ҹ��� �ø���.");
//	}
//	public void volumeDown() {
//		System.out.println("SamsungTV---�Ҹ��� ������.");
//	}
//}

//��������
//public class SamsungTV implements TV { 
//	
//	private SonySpeaker speaker;
//	
//	public SamsungTV() {
//		System.out.println("===SamsungTV ��ü ����===");
//	}
//	public void powerOn() {
//		System.out.println("SamsungTV---������ �Ҵ�.");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTV---������ ����.");
//	}
//	public void volumeUp() {
//		speaker = new SonySpeaker();
//		speaker.volumnUp();
//	}
//	public void volumeDown() {
//		speaker = new SonySpeaker();
//		speaker.volumeDown();
//	}
//}

//public class SamsungTV implements TV { 
//	
//	private SonySpeaker speaker;
//	private int price;
//	
//	public SamsungTV() {
//		System.out.println("===SamsungTV(1) ��ü ����===");
//	}
//	public SamsungTV(SonySpeaker speaker) {
//		System.out.println("=== SamsungTV(2) ��ü ����===");
//		this.speaker = speaker;
//	}
//	public SamsungTV(SonySpeaker speaker, int price) {
//		System.out.println("=== SamsungTV(3) ��ü ����===");
//		this.speaker = speaker;
//		this.price = price;
//	}
//	public void powerOn() {
//		System.out.println("SamsungTV---������ �Ҵ�. (���� : "+ price + ")");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTV---������ ����.");
//	}
//	public void volumeUp() {
//		speaker.volumnUp();
//	}
//	public void volumeDown() {
//		speaker.volumeDown();
//	}
//}

//public class SamsungTV implements TV {	
//	private Speaker speaker;
//	private int price;
//	
//	public SamsungTV() {
//		System.out.println("===SamsungTV(1) ��ü ����===");
//	}
//	public SamsungTV(Speaker speaker) {
//		System.out.println("=== SamsungTV(2) ��ü ����===");
//		this.speaker = speaker;
//	}
//	public SamsungTV(Speaker speaker, int price) {
//		System.out.println("=== SamsungTV(3) ��ü ����===");
//		this.speaker = speaker;
//		this.price = price;
//	}
//	public void powerOn() {
//		System.out.println("SamsungTV---������ �Ҵ�. (���� : "+ price + ")");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTV---������ ����.");
//	}
//	public void volumeUp() {
//		speaker.volumnUp();
//	}
//	public void volumeDown() {
//		speaker.volumeDown();
//	}
//}

//setter ������
public class SamsungTV implements TV {	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===SamsungTV(1) ��ü ����===");
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---������ �Ҵ�. (���� : "+ price + ")");
	}
	public void powerOff() {
		System.out.println("SamsungTV---������ ����.");
	}
	public void volumeUp() {
		speaker.volumnUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}