public class split{  
public static void main(String args[]){  
String s1="HI! I'm Sumit Reddy and my hobbies are cricket,taveling,listening music  and many more thing,Thank you.";  
String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}
