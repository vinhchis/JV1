package lab02_var_condition.lab02_homework;

public class IQ {
    private int english;
    private int aptitude;
    private int math;
    private int gknow;
    private int score;

    public IQ(int e, int a, int m, int g) {
        this.english = e;
        this.aptitude = a;
        this.math = m;
        this.gknow = g;

        this.score = this.english + this.aptitude + this.math + this.gknow;
        if (this.score >= 40) {
            this.score += 10;
        } else if (this.score >= 30) {
            this.score += 5;
        } else if (this.score >= 20) {
            this.score += 2;
        }

    }

    public int getScore() {
        return this.score;
    }

    public void printLevelIQ() {
        if (this.score >= 50) {
            System.out.println("You are a genius");
        } else if (this.score >= 35) {
            System.out.println("You are intelligent");
        } else if (this.score >= 22) {
            System.out.println("Your IQ level is average");
        } else {
            System.out.println("Your IQ level is below average");
        }
    }
}
