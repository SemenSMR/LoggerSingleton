package org.example;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterout(List<Integer> source){
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer num : source){
            logger.log("Элемент " + num + "\" " + (num < treshold ? "Не проходит " : "Проходит" ));
            if (num > treshold){
                result.add(num);
            }
        } logger.log("Прошло фильтр " + result.size() + " Элемента из " + source.size());
        return result;
    }
}
