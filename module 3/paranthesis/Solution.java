class Solution{
	public static String reverse(String text){
		if(text.equals("{")){
			return "}";

		}
		if(text.equals("[")){
			return "]";

		}
		if(text.equals("(")){
			return ")";

		}
		return "";
	}


public static String isMatching(String str){
	stack obj = new stack();
	for(String text : str.split("")){                                     //split function is use to split the terms by ""
		if(text.equals("{") || text.equals("[") || text.equals("(")){
			obj.push(text);

		}
		else{
			String bracket = reverse(obj.pop());
			if(!bracket.equals(text)){
				return "NO";

			}
		}


	}

	if(obj.isEmpty()){
		return "YES";
	}
	else{
		return "NO";

	}
}
}
