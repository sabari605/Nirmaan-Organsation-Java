package day17;

public class StringConcept implements IExmaple,IExample2{
public static void main(String[] args) {
	StringConcept str=new StringConcept(); 
	System.out.println(str.add(12, 56));
	System.out.println(str.mul(12, 56));
	System.out.println(str.div(12, 56));
	System.out.println(str.sub(12, 56));
}


@Override
public String add(int a, int b) {
	// TODO Auto-generated method stub
	return "Addition "+a+b;
}

@Override
public String mul(int a, int b) {
	// TODO Auto-generated method stub
	return "mul"+a*b;
}

@Override
public String div(int a, int b) {
	// TODO Auto-generated method stub
	return "div" +a/b;
}

@Override
public String sub(int a, int b) {
	// TODO Auto-generated method stub
	return "sub"+ (a-b);
}

		
		


}
