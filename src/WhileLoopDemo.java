
public class WhileLoopDemo {

	public static void main(String[] args) {
	
	String [] friends = new String[20];
	friends[0]="Masha";
	friends[1]="Matilda";
	friends[2]="Rosa";
	friends[3]=args[0];
	friends[4]=args[1];
	friends[18]="Hillary";
	friends[19]="Natasha";
	System.out.println("git");
	int totalElements = friends.length;
	int i = 0;
	
	  while(i<totalElements){
		if(friends[i]==null){
			i++;
			continue;
		}
		if(friends[i]=="Rosa"){
			//break;
		}
		System.out.println("I love "+friends[i]);
		i++;
	}
	for(String girl:friends){
		if(girl==null){continue;}
		System.out.println("I love "+girl);
	}
	
	//conditional operator(?)
	int k = 3;
	int f = 4;
	int d = k>f?5:0;
	System.out.println(d);//0
	System.out.println("The iteration is over");
	}

}
