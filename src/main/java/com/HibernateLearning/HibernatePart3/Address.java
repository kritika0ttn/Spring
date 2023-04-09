package com.HibernateLearning.HibernatePart3;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
//    streetNumber, location, State.
int streetNumber;
String location;
String state;
}
