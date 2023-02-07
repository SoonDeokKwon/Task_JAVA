package com.ksd.homework0206;

public class RPGgame implements KeyPad {
	//필드
	private int mode; //외부에서 모드를 바꾸지 못하게 막아줘야 하기 때문에 private 사용
	
	//생성자
	public RPGgame() {
		mode = KeyPad.NORMAL_MODE;
		System.out.println("RPGgame 실행");
	}

	
	//메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		if(mode == KeyPad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}else if(mode == KeyPad.HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
//		if(mode == KeyPad.NORMAL_MODE) {
//			System.out.println("캐릭터가 일반 공격.");
//		}else if(mode == KeyPad.HARD_MODE) {
//			System.out.println("캐릭터가 HIT 공격.");
//		}
		switch (mode) {
		case KeyPad.NORMAL_MODE: //0
			System.out.println("캐릭터가 일반 공격.");
			break;
		case KeyPad.HARD_MODE: //1
			System.out.println("캐릭터가 HIT 공격.");
			break;
		}
	}

	@Override
	public void changeMode() {
		if(mode == KeyPad.NORMAL_MODE) {
			mode = KeyPad.HARD_MODE;
			System.out.println("현재모드 : HardMode");
		}else if(mode == KeyPad.HARD_MODE) {
			mode = KeyPad.NORMAL_MODE;
			System.out.println("현재모드 : NormalMode");
		}
		
	}
	

	
}
