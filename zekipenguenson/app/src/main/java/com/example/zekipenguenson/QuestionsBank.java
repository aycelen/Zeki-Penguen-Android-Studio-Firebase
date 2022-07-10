package com.example.zekipenguenson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {



    private static List<QuestionsList> bayrakQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("sdasd", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question2 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question3 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question4 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;

    }

    private static List<QuestionsList> dunyaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Bu hangi ülkenin dunyası?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question2 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question3 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question4 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;

    }

    private static List<QuestionsList> kitapQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Bu hangi ülkenin kitabı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question2 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question3 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question4 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;

    }

    private static List<QuestionsList> matQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Bu hangi ülkenin matematiği?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question2 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question3 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");
        final QuestionsList question4 = new QuestionsList("Bu hangi ülkenin bayrağı?", "Arjantin", "Kanada", "Türkiye", "Paraguay", "Kanada", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;

    }

    public static List<QuestionsList> getQestions(String selectedTopicName) {

        switch (selectedTopicName) {
            case "bayrak":
                return bayrakQuestions();
            case "dunya":
                return dunyaQuestions();
            case "kitap:":
                return kitapQuestions();
            default:
                return matQuestions();
        }
    }
}