# CircuitCalculator

A Java Swing desktop calculator for complex numbers, the arithmetic behind AC circuit (phasor) analysis.

*Early work: university coursework.*

## Context

Uploaded to GitHub in August 2019 and co-written with a classmate. In March 2020 I renamed the package and translated the interface into English.

## What it shows

- A small object model: a `Complejo` (complex number) class that keeps both rectangular and polar form, and a `CalC` class for addition, subtraction, multiplication and division.
- Conversion between rectangular (binomial) and polar form, matching how phasors are worked by hand.
- A Swing GUI built with the NetBeans form designer, with separate "Operations" and "Transformations" sections.
- An Ant build through NetBeans project files.

## Stack

Java, Swing, NetBeans, Ant.

## Run it

Open the folder as a NetBeans project and run it, or build it with `ant` and run the resulting jar.

## Looking back (2026)

The logic sits close to the UI and there are no tests. Today I would pull the math into a tested library, use English names throughout, and build it with Gradle.
