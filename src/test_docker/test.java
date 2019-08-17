package test_docker;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.stream.IntStream;

public class test {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		var test = List.of(1,2,3,4,5);
	
		Long startTime = System.currentTimeMillis();
		
		System.out.println("At " + startTime.toString() + ":");
		for(String s : args)
		{
			System.out.println("-> "+ s);	
		}
		
		System.out.println("---------------------");
		
		
		
	}
}
