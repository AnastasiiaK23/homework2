package ua.kiev.prog.homework2;

import java.util.ArrayList;
import java.util.HashMap;

public class Anketaotv {
    public static String[] Anketa_NAMES = {"gender", "age", "prefer"};
    public static String[][][] Anketa_VALUES = {
            {"Woman", "Man"},
            {"Less than 30", "More than 30"},
            {"Books", "Movies"}
    };

    private HashMap<String, HashMap<String, Integer>> statistc;

    public Anketaotv() {
        super();
        this.statistc = new HashMap<String, HashMap<String, Integer>>();
        for(int i = 0; i < Anketaotv.Anketa_NAMES.length; i++){
            String name = Anketaotv.Anketa_NAMES[i];
            String[] values = Anketaotv.Anketa_VALUES[i];
            HashMap<String, Integer> answers = new HashMap<String, Integer>();
            for(String val : values){
                answers.put(val, 0);
            }
            this.statistc.put(name, answers);
        }
    }

    public Anketaotv(HashMap<String, HashMap<String, Integer>> statistc) {
        super();
        this.statistc = statistc;
    }

    public HashMap<String, HashMap<String, Integer>> getStatistc() {
        return statistc;
    }

    public void setStatistc(HashMap<String, HashMap<String, Integer>> statistc) {
        this.statistc = statistc;
    }

    public synchronized void incrementAnswerNum(String qName, String qValue) {
        HashMap<String, Integer> answers = this.statistc.get(qName);
        if(answers == null) {
            return;
        }
        Integer ansNum = answers.get(qValue);
        if(ansNum == null) {
            return;
        }
        answers.put(qValue, ansNum + 1);
    }

    public Integer getAnwersNum(String qName, String qValue) {
        HashMap<String, Integer> answers = this.statistc.get(qName);
        if(answers == null) {
            return null;
        }
        return answers.get(qValue);
    }
}