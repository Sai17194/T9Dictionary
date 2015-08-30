package com.java.dictionary;

import java.util.HashMap;

public class TrieNode {
	
		public TrieNode(char ch){
			value=ch;
			children=new HashMap<Character,TrieNode>();
			isEnd=false;
		}
		
		public boolean isEnd() {
			return isEnd;
		}
		public void setEnd(boolean isEnd) {
			this.isEnd = isEnd;
		}
		
		public HashMap<Character, TrieNode> getChildren(){
			return children;
		}
		public char getValue(){
			return value;
		}

		private char value;
		private HashMap<Character,TrieNode> children;
		private boolean isEnd;
}
