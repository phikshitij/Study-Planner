package com.example.studyplanner;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {


    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("what is the size of int variable", "16 bit", "8 bit", "32 bit", "64 bit", "32 bits", "");
        final QuestionsList question2 = new QuestionsList("what is the default value of boolean variable?", "true", "false", "null", "not define", "false", "");


        questionsLists.add(question1);
        questionsLists.add(question2);

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("what is the size of int variable", "16 bit", "8 bit", "32 bit", "64 bit", "32 bits", "");
        final QuestionsList question2 = new QuestionsList("what is the default value of boolean variable?", "true", "false", "null", "not define", "false", "");


        questionsLists.add(question1);
        questionsLists.add(question2);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("what is the size of int variable", "16 bit", "8 bit", "32 bit", "64 bit", "32 bits", "");
        final QuestionsList question2 = new QuestionsList("what is the default value of boolean variable?", "true", "false", "null", "not define", "false", "");


        questionsLists.add(question1);
        questionsLists.add(question2);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("what is the size of int variable", "16 bit", "8 bit", "32 bit", "64 bit", "16 bit", "");
        final QuestionsList question2 = new QuestionsList("what is the default value of boolean variable?", "true", "false", "null", "not define", "false", "");


        questionsLists.add(question1);
        questionsLists.add(question2);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }

    }

}