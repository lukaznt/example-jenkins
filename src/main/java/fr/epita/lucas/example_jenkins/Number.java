package fr.epita.lucas.example_jenkins;

public class Number {
	
    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number > 0) return "Positive";
        if (number < 0) return "Negative";
		return null;
    }

}