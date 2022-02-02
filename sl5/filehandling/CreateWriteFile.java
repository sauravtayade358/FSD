package com.sl.filehandling;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateWriteFile {

	public static void createFileUsingFileClass() throws IOException
	{
		File file=new File("C:\\Users\\HP\\Desktop\\s\\textfile.txt");
		
		if(file.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is already Exist");
		}
		//write data to that file
		FileWriter writer= new FileWriter(file, true);
		writer.write(" Good m......");
		writer.close();
	}
	public static void createFileUsingFileoutputStream() throws IOException
	{
		FileOutputStream out=new FileOutputStream("C:\\Users\\HP\\Desktop\\s\\textfile2.txt",true);
		String input="Welcome to File Handling";
		byte array[]=input.getBytes();
		out.write(array);
		System.out.println("Data Written");
		out.close();
	}
	public static void createFileUsingNIO() throws IOException
	{
		Path path= Paths.get("C:\\Users\\HP\\Desktop\\s\\textfile3.txt");
		//write data using Files class
		String input="Welcome to File Handling";
		byte array[]=input.getBytes();
		Files.write(path, array,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");
		
		//write data of List to files directly
		
		Path path1= Paths.get("C:\\Users\\HP\\Desktop\\s\\textfile4.txt");
		//write data using Files class
		List<String> list= Arrays.asList("this is my first line","this is my second line");
		Files.write(path1, list,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written");
	}
	public static void main(String[] args) {
		try {
			//createFileUsingFileClass();
			//createFileUsingFileoutputStream();
			createFileUsingNIO();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}