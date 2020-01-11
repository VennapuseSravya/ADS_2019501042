class WordNet{
    public class Roundoff {
        public static String result = "";
        public static  String roundOff(String value) {
            System.out.println("INPUT:" + value);
            String result = "";
            if(value.contains(".")) {
                value = value.replace(".", "-");
                String[] valueArr = value.split("-", 2);
                if(valueArr[0].length() == 1) {
                    return parseWithDecimal(valueArr);
                } else if(valueArr[0].length() > 1) {
                    return parseWithDecimal(valueArr);
                }
    // 		} else {
    // 			long valLg = Long.parseLong(value);
    // 			long mul = 1;
    // 			long roundVal = 0;
    // 			if(valLg <=9){
    // 			    valLg =valLg;
    // 			}
    // 			int i=0;
    // 		while (valLg > 9 ) {
    // 				i=i+1;
    // 				roundVal = valLg % 10;
    // 				if(roundVal >= 5) {
    // 					System.out.println(valLg);
                         
    // 			String t = value.charAt(value.length()-1-i)+"";
    // 				System.out.println(valLg);
    // 				for(int i=0;i<t;i++){
    // 				    String val = value[i];
    // 				}
    // 					 val = valLg+Long.parseLong(t)*(10*i)+10*i;
    // 					 valLg = Long.parseLong(val);
    // 					System.out.println(valLg);
    // 				}
    // 				valLg /= 10;
    // 				System.out.println(valLg);
    // 				mul *= 10;
                    
    // //				System.out.println("LOL:" + valLg );
    // 			}
    // 			if(roundVal >= 5) {
                    
    // 				valLg *= mul;
    // 			} else {
    // 				valLg *= mul;
    // 			}
    // //			System.out.println(valLg + ": HI");
    // 			result = valLg + "";
    // 			return result;
            }
            return null;
        }
        
        public static String parseWithDecimal(String[] valueArr) {
            String result = "";
            long valLg = Long.parseLong(valueArr[0]);
            System.out.println(valLg);
            if(valLg == 0) {
                
                result = "0.";
                
    //			System.out.println("RAJ: " + valLg);
                String temp = valueArr[1];
                int count = 0;
                for (int i = 0; i < temp.length(); i++) {
                    if(temp.charAt(i) == '0') {
                        count++;
                    }else {
                        break;
                    }
                }
    //			System.out.println(count + ":33333");
                valLg = Long.parseLong(valueArr[1]);
    //			System.out.println("RAJ: " + valLg);
    //			System.out.println("COUNT: " + count);
                long mul = 1;
                while(count != 0) {
                    mul *= 10;
                    count--;
                }
                long roundVal = 0;
                while (valLg >= 9) {
                    roundVal = valLg % 10;
                    if(roundVal >= 5) {
    //					System.out.println(valLg);
                        valLg = valLg + 1;
    //					System.out.println(valLg);
                    }
                    valLg /= 10;
    //				mul *= 10;
    //				System.out.println("LOL:" + valLg );
                }
                if(roundVal >= 5) {
                    valLg = valLg + 1;
    //				System.out.println(valLg);
                }
                while(mul != 1) {
                    result = result + '0';
                    mul /= 10;
                }
    //			System.out.println(result);
                result += valLg;
    //			System.out.println(result + ": HI lol");
                return result;
            } else {
    //			System.out.println(valLg + ":222222");
                valLg = Long.parseLong(valueArr[0]);
                long mul = 1;
                long roundVal = 0;
                int i=0;
            
                if(valLg <= 9){
                   
                    if(valueArr[1].charAt(0) =='1' ||valueArr[1].charAt(0) =='2'||valueArr[1].charAt(0)=='3'||valueArr[1].charAt(0)=='4'||valueArr[1].charAt(0)== '0'){
                        valLg = valLg;
                    }else{
                        valLg = valLg+1;
                        
                    }
                }else{
                
                while (valLg > 9 ) {
                    
                       mul *= 10;
                     //  System.out.println(mul);
                       String v="";
                       long g=valLg;
                       while(g!=0){
                           long t =g%10;
                           v = t+v;
                           
                           g=g/10;
                       }
                      
                    roundVal = valLg % 10;
                    //System.out.println(" //"+roundVal);
                    if(roundVal >= 5) {
                    //	System.out.println(valLg);
                         
                    String t = valueArr[0].charAt(v.length()-1-1)+"";
                    
                    System.out.println(t);
                    //
                    
                    
                        valLg = Long.parseLong(t)*((long)Math.pow(10,v.length()-1-1)+(long)Math.pow(10,v.length()-1-1));
                    //	System.out.println(valLg);
                        String val="";
                        for(int j=0;j<valueArr[0].length()-1-i;j++){
                           
                             val =val+ valueArr[0].charAt(j);
                           //  System.out.println(val);
                       }
                        val = val + valLg;
                        valLg = Long.parseLong(val);
                
                    }
                
                    valLg /= 10;
                
                }
                    
                    //System.out.println("LOL:" + mul );
                System.out.println("LOL:" + valLg );
                
            
                if(roundVal >= 5) {
                    
                    valLg *= mul;
                } else {
                    valLg *= mul;
                }
                
    //			System.out.println(valLg + ": HI");
                result = valLg + "";
                return result;
            }
        }
        
        
        
        }
        
        public static void main(String[] args){
            System.out.println(roundOff("1535.0"));
        }
    }
}

