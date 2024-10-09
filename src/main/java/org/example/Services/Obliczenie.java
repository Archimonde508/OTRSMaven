package org.example.Services;

import java.util.List;

public class Obliczenie {
    String function;

    public List<String> getInput() {
        return input;
    }

    public String getFunction() {
        return function;
    }

    public List<String> getOutput() {
        return output;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }

    private List<String> input;
    private List<String> output;

    public Obliczenie(String function, List<String> input, List<String> output) {
        this.function = function;
        this.input = input;
        this.output = output;
    }
}
