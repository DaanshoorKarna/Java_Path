import java.util.*;
public class GPAcalculator {

			private List<Integer> gradePointList;
		
		public GPAcalculator(){
			gradePointList=new ArrayList<Integer>();
		}
		
		public List<Integer> getGradePointList(){
	    return gradePointList;	
	}
	
	public void setGradePointList(List<Integer>gradePointList){
		this.gradePointList=gradePointList;
	}
	
	public void addGradePoint(char gradeObtained){
		int gradePoint=0;
		if(gradeObtained=='S'){
			gradePoint = 10;
		}
		else if(gradeObtained=='A'){
			gradePoint = 9;
		}
		else if(gradeObtained=='B'){
			gradePoint = 8;
		}
		else if(gradeObtained=='C'){
			gradePoint = 7;
		}
		else if(gradeObtained=='D'){
			gradePoint = 6;
		}
		else if(gradeObtained=='E'){
			gradePoint = 5;
		}
		
		gradePointList.add(gradePoint);
		
	}
	
	public double calculateGPAScored(){
		double gpa;
		if(gradePointList.isEmpty()){
			gpa=0;
		}else{
			int sum=0;
			for(Integer integer :gradePointList){
				sum=sum+integer;
			}
			gpa=sum/gradePointList.size();
		}
		return gpa;
	}

}
