package controllers;

import models.StatisticList;

import java.util.List;

public class StatisticListController<T extends Number>{
    StatisticList statisticList;
    public StatisticListController(){
        this.statisticList = new StatisticList<>();
    }

    public void add (T number){
        try{
            statisticList.add(number);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void getAverage(){
        try{
            statisticList.getAverage();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void getMax(){
        try{
            statisticList.getMax();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void getMin(){
        try{
            statisticList.getMin();
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    public void getMedian(){
        try{
            statisticList.getMedian();
        } catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    public void printList(){
        try{
            statisticList.printList();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
