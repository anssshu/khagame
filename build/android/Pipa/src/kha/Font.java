// Generated by Haxe 3.4.2
package kha;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface Font extends haxe.lang.IHxObject, kha.Resource
{
	double height(int fontSize);
	
	double width(int fontSize, java.lang.String str);
	
	double widthOfCharacters(int fontSize, haxe.root.Array<java.lang.Object> characters, int start, int length);
	
	double baseline(int fontSize);
	
}


