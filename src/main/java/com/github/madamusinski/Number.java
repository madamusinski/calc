package com.github.madamusinski;
import java.util.ArrayList;
import java.util.List;

public class Number implements Container{
    private double number;
    private List<Double> numbers;

    public Number(){
        numbers = new ArrayList<Double>();
    }

    @Override
    public Iterator getIterator(){
        return new NumberIterator();
    }

    private class NumberIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext(){
            if(index < numbers.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next(){

            if(this.hasNext()){
                return numbers.get(index++);
            }
            return null;
        }
    }
    //constructor



    public void add(Double num){
        numbers.add(num);
    }

    public void remove(Number num){
        numbers.remove(num);
    }

    public List<Double> getNumbers(){
        return numbers;
    }

}
