package java_ex_myself;

public class Company {

	   String name = "회사명";

	    public void setName(final String name) {
	    	//name = "ex회사2"; //인자값으로 받은 final변수는 변경 불가능
	        this.name = name;
	    }
	}