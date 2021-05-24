package student.alekseev.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView optionA, optionB, optionC, optionD;
    private TextView questionnumber, question;
    int currentIndex;
    int qn = 1;
    ProgressBar progressBar;
    int CurrentQuestion, CurrentOptionA, CurrentOptionB, CurrentOptionC, CurrentOptionD;

    private Answer[] questionBank = new Answer[]{
        new Answer(R.string.question_1,R.string.question1_A,R.string.question1_B,R.string.question1_C,R.string.question1_D,R.string.answer_1),
            new Answer(R.string.question_2,R.string.question2_A,R.string.question2_B,R.string.question2_C,R.string.question2_D,R.string.answer_2),
            new Answer(R.string.question_3,R.string.question3_A,R.string.question3_B,R.string.question3_C,R.string.question3_D,R.string.answer_3),
            new Answer(R.string.question_4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer_4),
            new Answer(R.string.question_4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer_4),
            new Answer(R.string.question_4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer_4),
            new Answer(R.string.question_4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer_4),
            new Answer(R.string.question_4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer_4),
            new Answer(R.string.question_4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer_4),
    };

    final double PROGRESS_BAR = Math.ceil(100/questionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

        question = findViewById(R.id.question);
        questionnumber = findViewById(R.id.QuestionNumber);
        progressBar = findViewById(R.id.progress_bar);

        CurrentQuestion = questionBank[currentIndex].getQuestionId();
        question.setText(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        optionA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });

        optionB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });

        optionC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });

        optionD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });
    }


    private void updateQuestion() {
        currentIndex = (currentIndex + 1) % questionBank.length;

        CurrentQuestion = questionBank[currentIndex].getQuestionId();
        question.setText(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        qn =+ 1;
        if (qn < questionBank.length){
            questionnumber.setText(qn + "/" + questionBank.length + "Question");
        }
        progressBar.incrementProgressBy((int) PROGRESS_BAR);

    }
}