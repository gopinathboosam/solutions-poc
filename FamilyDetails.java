package com.learn.test;
/**
 * @author gopi
 * Displaying the families
 * Grouping family members based on the last name(family name) and displaying them
 * Uses Family Class
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FamilyDetails {
public static void main(String[] args) {
	List<Family> famList = new ArrayList<Family>();
	famList.add(new Family("A","B"));
	famList.add(new Family("A","C"));
	famList.add(new Family("A","D"));
	famList.add(new Family("Z","AR"));
	famList.add(new Family("Z","BR"));
	getDetails(famList);
	//Stream test ** Starts
	/*Collector<Family,StringJoiner,String> collsss = Collector.of(()->new StringJoiner("|"),//Supplier
			(j,fam) -> j.add(fam.lastName),//accumulator
			(j1,j2) -> j1.merge(j2),//combiner
			StringJoiner::toString//finisher
			);
	
	String name =famList.stream().collect(collsss);
	System.out.println(name);;*/
	//Stream test ** Ends	
}
private static void getDetails(List<Family> famList) {
	Map<String,List<Family>> mapList=famList.stream().collect(Collectors.groupingBy(fam->fam.getFirstName()));
	for(Map.Entry<String, List<Family>> mapp:mapList.entrySet()) {
		List<Family> li = mapp.getValue();
		System.out.println("Family Name " + mapp.getKey() + " has " +li.size() +" members");
		li.stream().forEach(s->System.out.println("Members are "+s));
	}
	System.out.println();
}
}
