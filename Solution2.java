package 스터디예제11;

class Solution2 {
	    public String solution(String letter) {		//모스부호를 letter로 받아서 영어로 변환한다. 
	        String answer = "";		
	        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
	        				  "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
	        				  ".--","-..-","-.--","--.."};
	        String [] req = letter.split(" ");	// letter 문자열을 공백으로 분리한다. 분리된 문자열을 배열의 요소에 담는다. ex: "hello world"를 hello와 world로 나눠서  -> 배열 요소 0, 배열 요소 1에 따로 넣어줌. 
	        String word = "";	
	        
	        for(int j=0; j<req.length; j++){	
	            switch(req[j]){							// req[j]와 일치하는 case문으로 이동한다. 
	                case ".-" : 
	                    word += req[j].replace(".-", "a");
	                    break;
	                case "-..." : 
	                    word += req[j].replace("-...", "b");
	                    break;
	                case "-.-." : 
	                    word += req[j].replace("-.-.", "c");
	                    break;
	                case "-.." : 
	                    word += req[j].replace("-..", "d");
	                    break;
	                case "." :
	                    word += req[j].replace(".", "e");
	                    break;
	                case "..-." : 
	                    word += req[j].replace("..-.", "f");
	                    break;
	                case "--." : 
	                    word += req[j].replace("--.", "g");
	                    break;
	                case "...." : 
	                    word += req[j].replace("....", "h");
	                    break;
	                case ".." : 
	                    word += req[j].replace("..", "i");
	                    break;
	                case ".---" : 
	                    word += req[j].replace(".---", "j");
	                    break;
	                case "-.-" : 
	                    word += req[j].replace("-.-", "k");
	                    break;
	                case ".-.." :
	                    word += req[j].replace(".-..", "l");
	                    break;
	                case "--" : 
	                    word += req[j].replace("--", "m");
	                    break;
	                case "-." : 
	                    word += req[j].replace("-.", "n");
	                    break;
	                case "---" :
	                    word += req[j].replace("---", "o");
	                    break;
	                case ".--." : 
	                    word += req[j].replace(".--.", "p");
	                    break;
	                case "--.-" : 
	                    word += req[j].replace("--.-", "q");
	                    break;
	                case ".-." : 
	                    word += req[j].replace(".-.", "r");
	                    break;
	                case "..." : 
	                    word += req[j].replace("...", "s");
	                    break;
	                case "-" : 
	                    word += req[j].replace("-", "t");
	                    break;
	                case "..-" : 
	                    word += req[j].replace("..-", "u");
	                    break;
	                case "...-" : 
	                    word += req[j].replace("...-", "v");
	                    break;
	                case ".--" : 
	                    word += req[j].replace(".--", "w");
	                    break;
	                case "-..-" : 
	                    word += req[j].replace("-..-", "x");
	                    break;
	                case "-.--" : 
	                    word += req[j].replace("-.--", "y");
	                    break;
	                case "--.." : 
	                    word += req[j].replace("--..", "z");
	                    break;
	            }

	            answer = word;
	        }

	        return answer;
	    }
	}