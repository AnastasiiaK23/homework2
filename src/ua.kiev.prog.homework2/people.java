package ua.kiev.prog.homework2;

import java.util.HashMap;

public class People {
    private static HashMap<String, Anketaotv> statistics = new HashMap<String, Anketaotv>();

    public static HashMap<String, Anketaotv> getStatistics() {
        return People.statistics;
    }

    public static Anketaotv getStatistic(String id){
        Anketaotv qs = People.statistics.get(id);
        return qs == null ? createNewStatistic(id) : qs;
    }

    public static Anketaotv createNewStatistic(String id){
        Anketaotv qs = new Anketaotv();
        People.statistics.put(id, qs);
        return qs;
    }
}