package ���͵���11;

class Solution2 {
	    public String solution(String letter) {		//�𽺺�ȣ�� letter�� �޾Ƽ� ����� ��ȯ�Ѵ�. 
	        String answer = "";		
	        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
	        				  "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
	        				  ".--","-..-","-.--","--.."};
	        String [] req = letter.split(" ");	// letter ���ڿ��� �������� �и��Ѵ�. �и��� ���ڿ��� �迭�� ��ҿ� ��´�. ex: "hello world"�� hello�� world�� ������  -> �迭 ��� 0, �迭 ��� 1�� ���� �־���. 
	        String word = "";	
	        
	        for(int j=0; j<req.length; j++){	
	            switch(req[j]){							// req[j]�� ��ġ�ϴ� case������ �̵��Ѵ�. 
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