package student.alekseev.test;

public class Answer {
    private int optionA, optionB, optionC, optionD, questionid, answerid;

    public Answer(int optiona, int opionb, int optionc, int optiond, int questionide,int answeride){
        optionA = optiona;
        optionB = opionb;
        optionC = optionc;
        optionD = optiond;
        questionid = questionide;
        answerid = answeride;
    }

    public int getOptionA(){
        return optionA;
    }

    public int getOptionB(){
        return optionB;
    }

    public int getOptionC(){
        return optionC;
    }

    public int getOptionD(){
        return optionD;
    }

    public int getQuestionId(){
        return questionid;
    }

    public int getAnswerId(){
        return answerid;
    }

}
