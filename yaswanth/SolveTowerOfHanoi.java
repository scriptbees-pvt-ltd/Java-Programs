package org.jsp.towerOfHanoi;

import java.util.Scanner;

public class SolveTowerOfHanoi 
{
	public static void hanoiTower(int numDisks,char from,char middle,char to)
	{
		if(numDisks==1)
		{
			System.out.println("Disk 1 from "+from+" to "+to);
		}
		else
		{
			 hanoiTower(numDisks-1, from, to, middle);
	         System.out.println("Disk " + numDisks + " from " + from + " to " + to);
	         hanoiTower(numDisks-1, middle, from, to);
		}
	}
	public static void main(String[] args) 
	{
		int disks;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number of disks: ");
		disks = scr.nextInt();
		
		hanoiTower(disks,'A','B','C');
	}
}
