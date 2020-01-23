package EncounterBuilder;

import java.util.ArrayList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;


public class MonsterList {
	private static ArrayList<String> nameList = new ArrayList<>();
	private static ArrayList<Integer> CRList = new ArrayList<>();
	
	
	public static void populateNameList(String inputName) {
		
		nameList.add(inputName);
	}
	
	public static void populateCRList(String inputCR) {
		
		int intCR = Integer.parseInt(inputCR);
		
		CRList.add(new Integer(intCR));
	}
	
	public static void printLists() {
		for(String name: nameList) {
			System.out.print(name + "\t");
		}
		System.out.println("\n");
		for(Integer CR: CRList) {
			System.out.print(CR.intValue()+"\t");
		}
		System.out.println("\n");
	}
	
}
