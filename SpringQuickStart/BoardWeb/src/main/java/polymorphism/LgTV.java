package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//public class LgTV {
//	public void turnOn() {
//		System.out.println("LgTV---������ �Ҵ�.");
//	}
//	public void turnOff() {
//		System.out.println("LgTV---������ ����.");
//	}
//	public void soundUp() {
//		System.out.println("LgTV---�Ҹ��� �ø���.");
//	}
//	public void soundDown() {
//		System.out.println("LgTV---�Ҹ��� ������.");
//	}
//}

//������ ���� - ���
//public class LgTV implements TV{
//	@Override
//	public void powerOn() {
//		System.out.println("LgTV---������ �Ҵ�.");		
//	}
//	@Override
//	public void powerOff() {
//		System.out.println("LgTV---������ ����.");		
//	}
//	@Override
//	public void volumeUp() {
//		System.out.println("LgTV---�Ҹ��� �ø���.");		
//	}
//	@Override
//	public void volumeDown() {
//		System.out.println("LgTV---�Ҹ��� ������.");		
//	}
//}

//������ ���� ����
@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
//	@Qualifier("sony")
//	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV---������ �Ҵ�.");		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV---������ ����.");		
	}
	@Override
	public void volumeUp() {
		speaker.volumnUp();	
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}