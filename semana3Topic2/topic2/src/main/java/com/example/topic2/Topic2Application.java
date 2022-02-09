package com.example.topic2;

import java.util.Scanner;

public class Topic2Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Printer printer;
		int opt;

		System.out.println("1. print in color\n2. print in B&W");
		opt = scan.nextInt();
		if(opt == 1) {
			printer = Printing.selectPrinter("color");
			printer.print();
		}else if (opt == 2) {
			System.out.println("select printer: \n1. canon.\n2. hp");
			opt = scan.nextInt();
			if(opt == 1) {
				printer = Printing.selectPrinter("color");
				printer.print();
			}else if(opt == 2) {
				printer = Printing.selectPrinter("bw");
				printer.print();
			}else{
				System.err.println("invalid option");
			}
		}else{
			System.err.println("invalid option");
		}
	}

}
