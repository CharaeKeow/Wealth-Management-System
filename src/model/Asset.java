package model;

import controller.validator.InvalidValueException;

public interface Asset {
	abstract double calculateMonetaryValue() throws InvalidValueException;
}