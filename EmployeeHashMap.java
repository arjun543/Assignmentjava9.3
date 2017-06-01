package com;
import java.util.*;
public class EmployeeHashMap {

	public static void main(String args[]){
		
		
		Map<Integer,String> empMap=new HashMap<Integer,String>();
		Employee e1,e2,e3;
		e1=new Employee(101,"arjun");
		empMap.put(e1.getEmpId(), e1.getEmpName());
		e2=new Employee(102,"Mahi");
		empMap.put(e2.getEmpId(), e2.getEmpName());
		e3=new Employee(103,"Mahitha");
		empMap.put(e3.getEmpId(), e3.getEmpName());
		
		
		List<String>empNameList=new ArrayList<String>(empMap.values());
		System.out.println("NameList is ");
		for(String name : empNameList)
		{
			System.out.println(name);
		}
		
	}
}
