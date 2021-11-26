 package org.facebook;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Qus2  {
	
	public static void main(String[] args) {
		
		Qus1 d1 = new Qus1();
		
		d1.setCusId(3214);
		d1.setCusName("Naveen");
		d1.setCusNumber(9876543210L);
		d1.setEmail("naveengp@gmail.com");
		
		
	//Normel output//
		int id = d1.getCusId();
		System.out.println(id);
		String name = d1.getCusName();
		System.out.println(name);
		long number = d1.getCusNumber();
		System.out.println(number);
		String email = d1.getEmail();
		System.out.println(email);
		
		
		Qus1 d2 = new Qus1();
		
		d2.setCusId(4562);
		d2.setCusName("Selva");
		d2.setCusNumber(975431310L);
		d2.setEmail("selvars@gmail.com");
		
		
		Qus1 d3 = new Qus1();
		
		d3.setCusId(1276);
		d3.setCusName("Arun");
		d3.setEmail("arunrocky@gmail.com");
		d3.setCusNumber(8754436121L);
		
		
		
		//LIST CREATION//
		System.out.println("FOR LOOP");
		System.out.println("**********");
		
		List<Qus1> p = new ArrayList();
		
		p.add(d1);
		p.add(d2);
		p.add(d3);
		
		for (int i = 0; i < p.size(); i++) {
			System.out.println("Customer id is:"+ p.get(i).getCusId());
			System.out.println("Customer name is:"+ p.get(i).getCusName());
			System.out.println("Customer phone is"+ p.get(i).getCusNumber());
			System.out.println("Customer email is:" + p.get(i).getEmail());
		}
		
		
		System.out.println("            ");
        System.out.println("ENHACED FOR LOOP");
		System.out.println("****************");
		
		for (Qus1 x : p) {
			
			System.out.println("Customer id is :"+ x.getCusId());
			System.out.println("Customer name is:"+ x.getCusName());
			System.out.println("Customer numer is:"+ x.getCusNumber());
			System.out.println("Customer email is :"+ x.getEmail());
		
		}
		
		
		//SET CREATION//
		System.out.println("      ");
		System.out.println("FOREACH LOOP");
		System.out.println("**************");
		
		
		Set<Qus1> p1 = new LinkedHashSet();
		
		p1.add(d1);
		p1.add(d2);
		p1.add(d3);
		
		for (Qus1 y : p1) {
			System.out.println("Customer id is :"+ y.getCusId());
			System.out.println("Customer name is:"+ y.getCusName());
			System.out.println("Customer number is:"+ y.getCusNumber());
			System.out.println("Customer email is :"+ y.getEmail());
			
		}
		
		
		//MAP METHOD//
		System.out.println("          ");
		System.out.println("FOREACH LOOP");
		System.out.println("****************");
		
		
		Map<String,Qus1> p2 = new TreeMap();
		
		p2.put("Customer-1 ", d1);
		p2.put("Customer-2", d2);
		p2.put("Customer-3", d3);
		
		Set<Entry<String, Qus1>> s = p2.entrySet();
		
		for (Entry<String, Qus1> z : s) {
			
			
			String key = z.getKey();
			System.out.println(key);
			
			
			System.out.println("Customer id is :"+ z.getValue().getCusId());
			System.out.println("Customer name is :"+ z.getValue().getCusName());
			System.out.println("Customer number is :"+ z.getValue().getCusNumber());
			System.out.println("Customer email is :"+ z.getValue().getEmail());
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
