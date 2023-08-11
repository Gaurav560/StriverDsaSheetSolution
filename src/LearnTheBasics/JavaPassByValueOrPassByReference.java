package LearnTheBasics;

public class JavaPassByValueOrPassByReference {
    public static void main(String[] args) {
        Score myScore=new Score();
        myScore.setScore(122);
        increaseScore(myScore);
        System.out.println(myScore.getScore());
    }

    private static void increaseScore(Score score){
        //score.setScore(score.getScore()+9);
        score=new Score();
        score.setScore(788);
    }
}
