package chapter;

public class IfElseIFElse {

	public static void main(String[] args) {

		int score =88;
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else if(score>=80){
			System.out.println("점수가 89~80 입니다.");
			System.out.println("등급은 B 입니다.");
		}
		else if(score>=70){
			System.out.println("점수가 79~70 입니다.");
			System.out.println("등급은 C 입니다.");
		}
		else {
			System.out.println("점수가 69~00 입니다.");
			System.out.println("등급은 D 입니다.");
		}
			
	}

}
