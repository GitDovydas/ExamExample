package org.example.model;

public class InteractiveModel {

    private Integer firstNum;
    private Integer secondNum;
    private Integer thirdNum;
    private Integer result;

    public InteractiveModel() {
        // Set default values
        this.firstNum = 0;
        this.secondNum = 0;
        this.thirdNum = 0;
        this.result = 0;
    }

    public InteractiveModel(Integer firstNum, Integer secondNum, Integer thirdNum, Integer result) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
        this.result = result;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        if (firstNum == null || firstNum.toString().isEmpty()) {
            this.firstNum = 0;
        } else {
            this.firstNum = firstNum;
        }
    }

    public Integer getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Integer secondNum) {
        if (secondNum == null || secondNum.toString().isEmpty()) {
            this.secondNum = 0;
        } else {
            this.secondNum = secondNum;
        }
    }

    public Integer getThirdNum() {
        return thirdNum;
    }

    public void setThirdNum(Integer thirdNum) {
        if (thirdNum == null || thirdNum.toString().isEmpty()) {
            this.thirdNum = 0;
        } else {
            this.thirdNum = thirdNum;
        }
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "InteractiveModel{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", thirdNum=" + thirdNum +
                ", result=" + result +
                '}';
    }
}