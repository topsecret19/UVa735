import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> scores = new ArrayList<Integer>();
	scores.add(0); scores.add(50);
	for(int i=1; i<=20; i++) {
		if(!scores.contains(i)) {
			scores.add(i);
		}
		if(!scores.contains(i*2)) {
			scores.add(i*2);
		}
		if(!scores.contains(i*3)) {
			scores.add(i*3);
		}
	}
	Collections.sort(scores);
	String stars = "";
	for(int i=0; i<7; i++) {
		stars+="**********";
	}
	int score = sc.nextInt();
	while(true) {
		if(score<=0) {
			break;
		}
		int permutations=0;
		int compinations=0;
		for(int a=0; a<scores.size(); a++) {
			for(int b=0; b<scores.size(); b++) {
				for(int c=0; c<scores.size(); c++) {
					if(scores.get(a)+scores.get(b)+scores.get(c)==score) {
						permutations++;
						if(a<=b&&b<=c) {
							compinations++;
						}
					}
				}
			}
		}
		if(permutations==0) {
			System.out.println("THE SCORE OF "+score+" CANNOT BE MADE WITH THREE DARTS.");
			System.out.println(stars);
		}else {
			System.out.println("NUMBER OF COMBINATIONS THAT SCORES "+score+" IS "+compinations);
			System.out.println("NUMBER OF PERMUTATIONS THAT SCORES "+score+" IS "+permutations);
			System.out.println(stars);
		}
		score=sc.nextInt();
	}
	System.out.println("END OF OUTPUT");
}
}
