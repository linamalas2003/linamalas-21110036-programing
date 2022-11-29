package OOP;

public class MyArray {
char [] c= new char[5];
public char CharAt(int index)
{
	if(index>=0 || index<5)
	{
	for(int i=0;i<5;i++)
	{
		if(i==index)
		{
			return c[i];
		}
	}
	}
	else
		return '!';
	return '!';
}
public int lastApperance(char a)
{
	for(int i=0;i<5;i++)
	{
		if (c[i]==a)
		{
			return i;
		}
		else 
		{
			return -1;
		}
	}
	return -1;
}
public void replaceAll(char z,char x)
{
	for (int i=0;i<5;i++)
	{
		if(c[i]==z)
		{
			c[i]=x;
		}
	}
}
public boolean Compare (String s)
{
	boolean x = false;
for(int i=0;i<5;i++)
{
if(String.valueOf(c)==s)
{
	x=true;
	}
else
	x=false;
}
return x;
	
}
}
