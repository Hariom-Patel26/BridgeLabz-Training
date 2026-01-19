package com.geomeasuresapp;

import java.util.Scanner;

public class GeoMeasuresApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== GeoMeasure Solutions - Line Segment Length Comparator =====");

		// Input first line segment
		System.out.print("Enter coordinates for Line Segment 1 (x1 y1 x2 y2): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		LineSegment seg1 = new LineSegment(x1, y1, x2, y2);

		// Input second line segment
		System.out.print("Enter coordinates for Line Segment 2 (x1 y1 x2 y2): ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();

		LineSegment seg2 = new LineSegment(x1, y1, x2, y2);

		// Display both line segments
		System.out.println("\n--- Comparison ---");
		System.out.printf("Segment 1: %s  Length: %.4f%n", seg1.toString(), seg1.getLength());
		System.out.printf("Segment 2: %s  Length: %.4f%n", seg2.toString(), seg2.getLength());

		double len1 = seg1.getLength();
		double len2 = seg2.getLength();

		if (Math.abs(len1 - len2) < 1e-6) {
			System.out.println("The two line segments are equal in length.");
		} else if (len1 > len2) {
			System.out.println("Segment 1 is longer.");
		} else {
			System.out.println("Segment 2 is longer.");
		}
		sc.close();
	}
}