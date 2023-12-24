package com.groupassignment.main;

import com.groupassignment.departments.AdminDepartment;
import com.groupassignment.departments.HrDepartment;
import com.groupassignment.departments.TechDepartment;

public class DriverMain {

	public static void main(String[] args) {

		AdminDepartment ad = new AdminDepartment();
		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment();

		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());

		System.out.println("\nWelcome to " + hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());

		System.out.println("\nWelcome to " + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());

	}

}
