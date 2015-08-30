package com.java.dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Trie {
	
	private TrieNode root;
	
	public Trie(){
		root=new TrieNode((char)0);
	}
	
	public void add(String input){
		if(input.length()==0){
			return ;
		}
		else{
			char[] ch=input.toCharArray();
			int length=ch.length;
			TrieNode crawl=root;
			for(int i=0;i<length;i++){
				HashMap<Character,TrieNode> children=crawl.getChildren();
				if(children.containsKey(ch[i])){
					crawl=children.get(ch[i]);
				}
				else{
					TrieNode temp=new TrieNode(ch[i]);
					children.put(ch[i], temp);
					crawl=temp;
				}
			}
			crawl.setEnd(true);
		}	
	}
	
	public void searching(String input){
		if(input.length()==0){
			return ;
		}
		else{
			char[] ch=input.toCharArray();
			int length=ch.length;
			TrieNode crawl=root;
			String result="";
			for(int i=0;i<length;i++){
				HashMap<Character,TrieNode> child=crawl.getChildren();
				if(child.containsKey(ch[i])){
					result=result+ch[i];
					crawl=child.get(ch[i]);
					//print(result,crawl);
				}
				else{
					break;
				}
			}
			System.out.println("Result for "+input.toUpperCase()+" is : "+result);
			
		}
	}
	
	void print(String result, TrieNode crawl){
		if(result.length()>0){
			char[] ch=result.toCharArray();
			for(int i=0;i<ch.length;i++){
				HashMap<Character,TrieNode> child=crawl.getChildren();
				Set s=child.keySet();
				Iterator itr=s.iterator();
				System.out.println(ch[i]);
				while(itr.hasNext()){
					Character input=(Character)itr.next();
					System.out.println(ch[i]+input);
				}
				
			}
		}
	}
	
	

}
