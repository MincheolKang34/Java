package sub8;

public class RemoteSamsung implements RemoteControl{ // 인터페이스 구현

	@Override
	public void powerOn() {
		System.out.println("Samsung poweron...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung poweroff...");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung soundUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung soundDown...");
	}

}
