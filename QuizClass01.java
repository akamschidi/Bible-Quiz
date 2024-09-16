public class QuizClass01 {
    private String question;
    private String answer01;
    private String answer02;
    private String answer03;
    private String answer04;

    
    public QuizClass01() {
    }


    public QuizClass01(String question, String answer01, String answer02, String answer03, String answer04) {
        this.question = question;
        this.answer01 = answer01;
        this.answer02 = answer02;
        this.answer03 = answer03;
        this.answer04 = answer04;
    }


    public String getQuestion() {
        return question;
    }


    public void setQuestion(String question) {
        this.question = question;
    }


    public String getAnswer01() {
        return answer01;
    }


    public void setAnswer01(String answer01) {
        this.answer01 = answer01;
    }


    public String getAnswer02() {
        return answer02;
    }


    public void setAnswer02(String answer02) {
        this.answer02 = answer02;
    }


    public String getAnswer03() {
        return answer03;
    }


    public void setAnswer03(String answer03) {
        this.answer03 = answer03;
    }


    public String getAnswer04() {
        return answer04;
    }


    public void setAnswer04(String answer04) {
        this.answer04 = answer04;
    }


    @Override
    public String toString() {
        return "Question: " + question + ", answer01: " + answer01 + ", answer02: " + answer02 + ", answer03: "
                + answer03 + ", answer04: " + answer04;
    }
    
    
    
}
