package models;

import exceptions.EmptyListException;
import exceptions.InvalidInputException;
import utility.ListUtil;

import java.util.ArrayList;
import java.util.List;


public class StatisticList<T extends Number & Comparable<T>> {
    private List<T> statisticList;

    public StatisticList (){
        this.statisticList = new ArrayList<>();
    }

    public void add(T value) throws Exception {
        if(value.doubleValue() < 0){
            throw new InvalidInputException("Invalid Input");
        }
        statisticList.add(value);
    }

    public int getSize(){
        return statisticList.size();
    }

    public double getAverage() throws Exception{
        double avg = 0;
        for (T number : statisticList){
            avg += number.doubleValue();
        }
        if (avg == 0){
            throw new EmptyListException("List is Empty");
        }
        return avg/statisticList.size();
    }

    public T getMin() throws Exception{
        if (this.statisticList.isEmpty()){
            throw new EmptyListException("List is empty");
        }
        List<T> sortedList = new ArrayList<>(this.statisticList);
        ListUtil.sort(sortedList);
        return sortedList.getFirst();
    }

    public T getMax() throws Exception{
        if (this.statisticList.isEmpty()){
            throw new EmptyListException("List is empty");
        }
        List<T> sortedList = new ArrayList<>(this.statisticList);
        ListUtil.sort(sortedList);
        return sortedList.getLast();
    }

    public double getMedian() throws Exception{
        if (this.statisticList.isEmpty()){
            throw new EmptyListException("List is empty");
        }
        int size = this.statisticList.size() - 1;
        List<T> sortedList = new ArrayList<>(this.statisticList);
        ListUtil.sort(sortedList);
        if (size % 2 == 0 ){
            double med1 = sortedList.get(size/2).doubleValue();
            double med2 = sortedList.get((int) (med1+1)).doubleValue();
            return (med2+med1)/2;
        } else{
            return (int) sortedList.get(size/2).doubleValue();
        }

    }

    public void printList() throws Exception{
        if (this.statisticList.isEmpty()){
            throw new EmptyListException("List is Empty");
        }
        ListUtil.sort(statisticList);
        for (T number : statisticList) {
            System.out.print(number + "-");
        }
        System.out.println();
    }
}
