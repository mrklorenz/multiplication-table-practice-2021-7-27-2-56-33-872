package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return null;
    }

    public boolean isValid(int startNum, int endNum){
        return isNumberInRange(startNum) && isNumberInRange(endNum) && !isEndBiggerThanStart(startNum,endNum);
    }

    public boolean isNumberInRange(int number){
        return number >= 1 && number <= 1000;
    }

    public boolean isEndBiggerThanStart(int startNum, int endNum){
        return endNum > startNum;
    }

    public String generateMultiplicationLine(int row, int col){
        String multiplicationLine = "";
        for(int i=0; i<= row; i++){
            multiplicationLine += generateMultiplicationExpression(row, i);
        }
        return multiplicationLine;
    }

    public String generateMultiplicationExpression(int multiplier, int multiplicand){
        int result = multiplier * multiplicand;
        return multiplier + "*" + multiplicand + "=" + result;
    }
}
